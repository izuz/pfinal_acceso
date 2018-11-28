package paquete;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;

/**
 * @author Gonzalo Izuzquiza
 */
public class XPATH {

    String salida = "";

    public int EjecutaXPath(File ficheroo, String consulta) {

        try {
            //Crea un objeto DocumentBuilderFactory para el DOM (JAXP)
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //Crear un árbol DOM (parsear) con el archivo futbol.xml
            Document XMLDoc = factory.newDocumentBuilder().parse(ficheroo);
            //Crea el objeto XPath
            XPath xpath = XPathFactory.newInstance().newXPath();
            //Crea un XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile(consulta);
            //Ejecuta la consulta indicando que se ejecute sobre el DOM y que devolverá
            //el resultado como una lista de nodos.
            Object result = exp.evaluate(XMLDoc, XPathConstants.NODESET);
            NodeList nodeList = (NodeList) result;
            //Ahora recorre la lista para sacar los resultados
            if (consulta.equals("/Futbol/Equipo")) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    salida = salida + "\n Nombre del equipo: " + nodeList.item(i).getAttributes().getNamedItem("Nombre_equipo").getNodeValue();
                    salida = salida + "\n Goles a favor: " + nodeList.item(i).getAttributes().getNamedItem("Goles_a_favor").getNodeValue();
                    salida = salida + "\n Goles en contra: " + nodeList.item(i).getAttributes().getNamedItem("Goles_en_contra").getNodeValue();
                    salida = salida + "\n Estadio: " + nodeList.item(i).getAttributes().getNamedItem("Estadio").getNodeValue();
                    salida = salida + "\n Presidente: " + nodeList.item(i).getAttributes().getNamedItem("Presidente").getNodeValue();
                    salida = salida + "\n" + nodeList.item(i).getTextContent();

                }
            } else {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    salida = salida + "\n" + nodeList.item(i).getTextContent(); // para cuando quiere algo en concreto

                }
            }
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

}
