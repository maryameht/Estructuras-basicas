package Mapas;
import java.util.*;
// pedimos un array de cadenas de letras al usuario
// mostrar las veces que se repiten cada una de las palabras
// para finalizar el programa se debe introducir una linea en blanco
public class Frequency {
    public static void main(String[] args) {

        String [] palabras = Utilidades.dividirEnPalabras("Uno dos dos tres tres tres");
        HashMap<String,Integer> frecuencia = frecuencia(palabras);
        System.out.println(frecuencia);

    }

    public static HashMap<String,Integer> frecuencia (String...palabras) {

       HashMap<String,Integer> frecuencia = new HashMap<>();

       for ( String palabra : palabras ) {

           int repeticiones = 1;
           if (frecuencia.containsKey(palabra)) {

               repeticiones ++;
               frecuencia.put(palabra,repeticiones+1);

           }

           frecuencia.put(palabra,repeticiones);

       }

       return frecuencia;

    }


}
