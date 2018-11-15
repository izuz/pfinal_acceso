package paquete;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;

/**
 * @author Gonzalo Izuzquiza
 */
public class XPATH {

    Document doc;
    File fichero;

    public int EjecutaXPath() {
        String salida = "";
        try {
            //Crea un objeto DocumentBuilderFactory para el DOM (JAXP)
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //Crear un árbol DOM (parsear) con el archivo LibrosXML.xml
            Document XMLDoc = factory.newDocumentBuilder().parse(new File("LibrosXML.xml"));
            //Crea el objeto XPath
            XPath xpath = XPathFactory.newInstance().newXPath();
            //Crea un XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile("/Libros/*/Autor");
            //Ejecuta la consulta indicando que se ejecute sobre el DOM y que devolverá
            //el resultado como una lista de nodos.
            Object result = exp.evaluate(XMLDoc, XPathConstants.NODESET);
            NodeList nodeList = (NodeList) result;
            //Ahora recorre la lista para sacar los resultados
            for (int i = 0; i < nodeList.getLength(); i++) {
                salida = salida + "\n"
                        + nodeList.item(i).getChildNodes().item(0).getNodeValue();
            }
            System.out.println(salida);
            return 0;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return 0;
        }
    }
}
