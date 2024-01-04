package Mapas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// contar cuántos alumnos hay de cada pais
// leer el archivo + excepcion
// mapa : pais --> nºalumnos
public class CountCountries {


    public static void main(String[] args) throws IOException {


        try {
            BufferedReader reader = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));
            String linea;

            //creamos el mapa pais --> rep pais(nºalumnos)
            HashMap<String,Integer> contarPaises = new HashMap<>();

            while ((linea = reader.readLine())!= null) {

                //convertimos la linea a array
                String [] lineaArray = StringtoArray(linea);
                //el pais es el indice 6 de la linea
                String pais = lineaArray[6];
                //el valor asociado a pais es repeticiones
                Integer repeticiones = contarPaises.get(pais);
                //aumentamos la frecuencia en +1
                //
                contarPaises.put(pais, repeticiones == null ? 1 : repeticiones + 1);
                /* EXPRESION CONDICIONAL:
                 repeticiones == null ? 1 : repeticiones + 1

                 Si repeticiones == null, significa que no ha sido agregado en el mapa
                 por lo que establece el valor 1

                 Si repeticiones != null, significa que ya está en el mapa y
                 por tanto tiene que cumplir (repeticiones+1), es decir, incrementa el valor en + 1

                 */

            }reader.close();


            for (String pais : contarPaises.keySet()) {
                //pais : repeticiones
                System.out.println(pais + ":" + contarPaises.get(pais));
            }


        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }

    }

    public static String [] StringtoArray (String linea) {

        String [] lineaArray = linea.split(","); //convertimos la cadena en array de palabras
        return lineaArray;

    }


}
