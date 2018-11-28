package paquete;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Gonzalo Izuzquiza
 */
public class SAX {

    SAXParser parser;
    ManejadorSAX sh;
    File fXML;

    public int abrir_XML_SAX(File fichero) {

        try {

            // se crea un objeto para interpretar el documento XML
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();

            //se crea una instancia que recorrera el xml secuencialmente
            sh = new ManejadorSAX();

            fXML = fichero;

            return 0;

        } catch (Exception e) {

            e.printStackTrace();
            return -1;
        }

    }

    class ManejadorSAX extends DefaultHandler {

        int ultimoelement;
        String cadena_resultado = "";

        public ManejadorSAX() {
            ultimoelement = 0;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {

            if (qName.equals("Equipo")) {
                cadena_resultado = cadena_resultado + "\nNombre del equipo: " + atts.getValue(atts.getQName(0)) + "\n";
                ultimoelement = 1;
                cadena_resultado = cadena_resultado + "\nGoles a favor: " + atts.getValue(atts.getQName(1)) + "\n";
                ultimoelement = 2;
                cadena_resultado = cadena_resultado + "\nGoles en contra: " + atts.getValue(atts.getQName(2)) + "\n";
                ultimoelement = 3;
                cadena_resultado = cadena_resultado + "\nEstadio: " + atts.getValue(atts.getQName(3)) + "\n";
                ultimoelement = 4;
                cadena_resultado = cadena_resultado + "\nPresidente: " + atts.getValue(atts.getQName(4)) + "\n";
                ultimoelement = 5;
            } else if (qName.equals("Mejor_jugador_de_la_historia")) {
                ultimoelement = 6;
                cadena_resultado = cadena_resultado + "\nEl mejor jugador de la historia es: ";
            } else if (qName.equals("Entrenador")) {
                ultimoelement = 7;
                cadena_resultado = cadena_resultado + "\nEl entrenador es: ";
            } else if (qName.equals("Jugador_mejor_pagado")) {
                ultimoelement = 8;
                cadena_resultado = cadena_resultado + "\nEl jugador mejor pagado es: ";
            } else if (qName.equals("Maximo_goleador")) {
                ultimoelement = 9;
                cadena_resultado = cadena_resultado + "\nEl pichichi es: ";
            } else if (qName.equals("Capitan")) {
                ultimoelement = 10;
                cadena_resultado = cadena_resultado + "\nEl capitán es: ";
            } else if (qName.equals("Ultimo_fichaje")) {
                ultimoelement = 11;
                cadena_resultado = cadena_resultado + "\nEl último fichaje es: ";
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {

            if (qName.equals("Equipo")) {
                System.out.println("He encontrado el final de un elemento");
                cadena_resultado = cadena_resultado + "\n -------------";
            }
        }

        @Override
        public void characters(char[] ch, int start, int lenght) throws SAXException {

            if (ultimoelement == 6) {
                for (int i = start; i < lenght + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }

            } else if (ultimoelement == 7) {
                for (int i = start; i < lenght + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 8) {
                for (int i = start; i < lenght + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 9) {
                for (int i = start; i < lenght + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 10) {
                for (int i = start; i < lenght + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            } else if (ultimoelement == 11) {
                for (int i = start; i < lenght + start; i++) {
                    cadena_resultado = cadena_resultado + ch[i];
                }
            }
        }
    }

    public String recorrerSAX() {

        try {
            parser.parse(fXML, sh);
            return sh.cadena_resultado;
        } catch (SAXException e) {
            e.printStackTrace();
            return "Error al parsear con SAX";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al parsear con SAX";
        }
    }

}
