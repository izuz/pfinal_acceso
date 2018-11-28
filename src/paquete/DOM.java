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

    public String recorrerDOMyMostrarlo(Document doc) {

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

                salida = salida + "\n" + "Nombre del equipo:" + datos_nodo[0];
                salida = salida + "\n" + "Goles a favor:" + datos_nodo[1];
                salida = salida + "\n" + "Goles en contra:" + datos_nodo[2];
                salida = salida + "\n" + "Estadio:" + datos_nodo[3];
                salida = salida + "\n" + "Presidente:" + datos_nodo[4];
                salida = salida + "\n" + "Mejor jugador de la historia:" + datos_nodo[5];
                salida = salida + "\n" + "Entrenador:" + datos_nodo[6];
                salida = salida + "\n" + "Jugador mejor pagado:" + datos_nodo[7];
                salida = salida + "\n" + "Máximo goleador:" + datos_nodo[8];
                salida = salida + "\n" + "Capitán:" + datos_nodo[9];
                salida = salida + "\n" + "Último fichaje:" + datos_nodo[10];
                salida = salida + "\n -----------------";
            }
        }
        return salida;
    }

    protected String[] procesarEquipo(Node n) {

        String datos[] = new String[10];
        Node ntemp = null;
        int contador = 1;

        //obtencion del primer atributo del nodo
        datos[0] = n.getAttributes().item(0).getNodeValue();
        
        //obtencion de los hijos del libro que son el titulo y el autor
        NodeList nodos = n.getChildNodes();

        for (int i = 0; i < nodos.getLength(); i++) {

            ntemp = nodos.item(i);

            if (ntemp.getNodeType() == Node.ELEMENT_NODE) {

                //obtencion del texto del titulo y autor accediendo al nodo text hijo de ntemp y se saca su valor
                datos[contador] = ntemp.getChildNodes().item(0).getNodeValue();

                contador++;
            }
        }
        return datos;
    }

    public int annadirDOM(String titulo, String autor, String anno) {

        try {

            //creamos un nodo para el titulo, se crea tipo texto y se añade
            Node ntitulo = doc.createElement("Titulo");
            Node ntitulo_text = doc.createTextNode(titulo);
            ntitulo.appendChild(ntitulo_text);

            //creamos un nodo para el autor, se crea tipo texto y se añade
            Node nautor = doc.createElement("Autor");
            Node nautor_text = doc.createTextNode(autor);
            nautor.appendChild(nautor_text);

            // creamos un nodo para libro
            Node nlibro = doc.createElement("Libro");
            //añadimos un atributo
            ((Element) nlibro).setAttribute("publicado_en", anno);
            //añadimos a libro el autor y titulo 
            nlibro.appendChild(ntitulo);
            nlibro.appendChild(nautor);

            //obtenemos el primer nodo del documento y se le añade como hijo del nodo libro
            Node raiz = doc.getChildNodes().item(0);
            raiz.appendChild(nlibro);

            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int guardarDOMcomoFILE(String nombre) {

        try {

            //creamos un fichero al que le pasamos el nombre para que luego guarde donde quiera
            File archivo_xml = new File(nombre);

            //especificamos el formato de salida
            OutputFormat format = new OutputFormat(doc);

            //especificamos que la salida este identada
            format.setIndenting(true);

            //escribe el contenido en el FILE
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo_xml), format);
            serializer.serialize(doc);

            return 0;

        } catch (Exception e) {
            return -1;
        }
    }

}
