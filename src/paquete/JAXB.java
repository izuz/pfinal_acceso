package paquete;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import futbol_binding.Futbol;

/**
 * @author Gonzalo Izuzquiza
 */
public class JAXB {

    Futbol mifutbol;

    public int abrir_XML_JAXB(File fichero) {

        JAXBContext contexto;

        try {
            //creamos una instancia JAXB
            contexto = JAXBContext.newInstance(Futbol.class);

            // creamos un objeto Ubnaesheller
            Unmarshaller u = contexto.createUnmarshaller();

            // desalizamos el fichero
            mifutbol = (Futbol) u.unmarshal(fichero);

            return 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public String recorrerJAXByMostrar() {

        String datos_nodo[] = null;
        String cadena_resultado = "";

        //Crea una lista con objetos de tipo futbol
        List<Futbol.Equipo> lFutbol = mifutbol.getEquipo();

        // recorremos la lista para sacar los valores
        for (int i = 0; i < lFutbol.size(); i++) {
            cadena_resultado = cadena_resultado + "\n" + "Nombre del equipo:" + lFutbol.get(i).getNombreEquipo();
            cadena_resultado = cadena_resultado + "\n" + "Goles a favor: " + lFutbol.get(i).getGolesAFavor();
            cadena_resultado = cadena_resultado + "\n" + "Goles en contra: " + lFutbol.get(i).getGolesEnContra();
            cadena_resultado = cadena_resultado + "\n" + "Estadio: " + lFutbol.get(i).getEstadio();
            cadena_resultado = cadena_resultado + "\n" + "Presidente: " + lFutbol.get(i).getPresidente();
            cadena_resultado = cadena_resultado + "\n" + "El mejor jugador de la historia es: " + lFutbol.get(i).getMejorJugadorDeLaHistoria();
            cadena_resultado = cadena_resultado + "\n" + "Entrenador: " + lFutbol.get(i).getEntrenador();
            cadena_resultado = cadena_resultado + "\n" + "El jugador mejor pagado es: " + lFutbol.get(i).getJugadorMejorPagado();
            cadena_resultado = cadena_resultado + "\n" + "El pichichi es: " + lFutbol.get(i).getMaximoGoleador();
            cadena_resultado = cadena_resultado + "\n" + "El capitan es: " + lFutbol.get(i).getCapitan();
            cadena_resultado = cadena_resultado + "\n" + "El último fichaje es: " + lFutbol.get(i).getUltimoFichaje();
            cadena_resultado = cadena_resultado + "\n ---------------------------------------";
        }
        return cadena_resultado;
    }

}
