package paquete;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Gonzalo Izuzquiza
 */
public class DOM {

    Document doc = null; // resepresenta al arbol del DOM

    public int abrir_XML_DOM(File fichero) {

        try {
            // se crea un objeto de tipo DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // para ignorar los comentario del xml
            factory.setIgnoringComments(true);

            // para ignorar los espacios en blanco del xml
            factory.setIgnoringElementContentWhitespace(true);

            // para cargar la estructura en arbol del DOM
            DocumentBuilder builder = factory.newDocumentBuilder();

            // interpreta el XML y genera el DOM equivalente
            doc = (Document) builder.parse(fichero);

            return 0; // con esto el doc ya apunta al arbol del DOM listo para ser recorrido

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public String recorrerDOMyMostrarlo() {

        String datos_nodo[] = null;
        String salida = "";
        Node node;

        //obtencion del primer numero del DOM (1º hijo)
        Node raiz = doc.getFirstChild();

        //obtencion de lista de nodos hijos del raiz
        NodeList nodelist = raiz.getChildNodes();

        //procesamiento de los nodos hijos
        for (int i = 0; i < nodelist.getLength(); i++) {
            node = nodelist.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {

                //es nodo
                datos_nodo = procesarEquipo(node);

//                salida = salida + "\n" + "Nombre del equipo:" + datos_nodo[0];
//                salida = salida + "\n" + "Goles a favor:" + datos_nodo[1];
//                salida = salida + "\n" + "Goles en contra:" + datos_nodo[2];
//                salida = salida + "\n" + "Estadio:" + datos_nodo[3];
//                salida = salida + "\n" + "Presidente:" + datos_nodo[4];
//                salida = salida + "\n" + "Mejor jugador de la historia:" + datos_nodo[5];
//                salida = salida + "\n" + "Entrenador:" + datos_nodo[6];
//                salida = salida + "\n" + "Jugador mejor pagado:" + datos_nodo[7];
//                salida = salida + "\n" + "Máximo goleador:" + datos_nodo[8];
//                salida = salida + "\n" + "Capitán:" + datos_nodo[9];
//                salida = salida + "\n" + "Ultimo fichaje:" + datos_nodo[10];
//                salida = salida + "\n -----------------";
            }
        }
        return salida;
    }

    protected String[] procesarEquipo(Node n) {

        String datos[] = new String[10];
        Node ntemp = null;
        int contador = 5;

        //obtencion del primer atributo del nodo
        datos[0] = n.getAttributes().item(0).getNodeValue();
        datos[1] = n.getAttributes().item(0).getNodeValue();
        datos[2] = n.getAttributes().item(0).getNodeValue();
        datos[3] = n.getAttributes().item(0).getNodeValue();
        datos[4] = n.getAttributes().item(0).getNodeValue();

        //obtencion de los hijos del libro que son el titulo y el autor
        NodeList nodos = n.getChildNodes();

        for (int i = 5; i < nodos.getLength(); i++) {

            ntemp = nodos.item(i);

            if (ntemp.getNodeType() == Node.ELEMENT_NODE) {

                //obtencion del texto del titulo y autor accediendo al nodo text hijo de ntemp y se saca su valor
                datos[contador] = ntemp.getTextContent();

                contador++;
            }
        }
        return datos;
    }
                           //Document doc ,
    public int annadirDOM(String nombre, String favor, String contra, String estadio, String presi,
            String thebest, String coach, String dinero, String goles, String capi, String ultimo){

        try {

            //creamos un nodo para el mejor jugador, se crea tipo texto y se añade
            Node nthebest = doc.createElement("Mejor_jugador_de_la_historia");
            Node nthebest_text = doc.createTextNode(thebest);
            nthebest.appendChild(nthebest_text);

            //creamos un nodo para el entrenador, se crea tipo texto y se añade
            Node ncoach = doc.createElement("Entrenador");
            Node ncoach_text = doc.createTextNode(coach);
            ncoach.appendChild(ncoach_text);

            //creamos un nodo para el mejor pagado, se crea tipo texto y se añade
            Node ndinero = doc.createElement("Jugador_mejor_pagado");
            Node ndinero_text = doc.createTextNode(dinero);
            ndinero.appendChild(ndinero_text);

            //creamos un nodo para el pichichi, se crea tipo texto y se añade
            Node ngoles = doc.createElement("Maximo_goleador");
            Node ngoles_text = doc.createTextNode(goles);
            ngoles.appendChild(ngoles_text);

            //creamos un nodo para el capitan, se crea tipo texto y se añade
            Node ncapi = doc.createElement("Capitan");
            Node ncapi_text = doc.createTextNode(capi);
            ncapi.appendChild(ncapi_text);

            //creamos un nodo para el ultimo fichaje, se crea tipo texto y se añade
            Node nultimo = doc.createElement("Ultimo_fichaje");
            Node nultimo_text = doc.createTextNode(ultimo);
            nultimo.appendChild(nultimo_text);

            // creamos un nodo para equipo
            Node nEquipo = doc.createElement("Equipo");

            //añadimos los atributos
            ((Element) nEquipo).setAttribute("Nombre_equipo", nombre);
            ((Element) nEquipo).setAttribute("Goles_a_favor", favor);
            ((Element) nEquipo).setAttribute("Goles_en_contra", contra);
            ((Element) nEquipo).setAttribute("Estadio", estadio);
            ((Element) nEquipo).setAttribute("Presidente", presi);

            //añadimos a equipo todos los elementos
            nEquipo.appendChild(nthebest);
            nEquipo.appendChild(ncoach);
            nEquipo.appendChild(ndinero);
            nEquipo.appendChild(ngoles);
            nEquipo.appendChild(ncapi);
            nEquipo.appendChild(nultimo);

            //obtenemos el nodo del documento y se le añade como hijo del nodo equipo
            Node raiz = doc.getChildNodes().item(0);
            raiz.appendChild(nEquipo);
            

            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int guardarDOMcomoFILE(File fichero) {
        try {

            //especificamos el formato de salida
            OutputFormat format = new OutputFormat(doc);

            //especificamos que la salida este identada
            format.setIndenting(true);

            //escribe el contenido en el FILE
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(fichero), format);
            serializer.serialize(doc);

            return 0;

        } catch (Exception e) {
            return -1;
        }
    }
}
