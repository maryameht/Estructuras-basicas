package Mapas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//leemos el archivo
//crear el mapa: apellido --> frecuencia
//pedir por pantalla el apellido
//mostrar la frecuencia
//finaliza cuando introduzca una linea en blanco
public class LastNameFrequency {
    public static void main(String[] args) throws IOException {

        //método aparte para crear el mapa
        HashMap<String, Integer> frecuenciaApellidos = crearMapa();

        String apellidoIntroducido;
        Scanner miScanner = new Scanner(System.in);

        do {

            System.out.println("\n");
            System.out.println("Introduce el apellido");
            //almacenamos de manera que pasamos a mayusculas
            apellidoIntroducido = miScanner.next().toUpperCase();

            //si el usuario no introduce un espacio en blanco, entra en el bucle
            if (!apellidoIntroducido.equals("")) {
                //si el valor de la clave existe, muestra la frecuencia
                if (frecuenciaApellidos.get(apellidoIntroducido) == null) {
                    System.out.println("El apellido introducido no existe");
                } else {
                    System.out.printf("La frecuencia del apellido %s es %d", apellidoIntroducido, frecuenciaApellidos.get(apellidoIntroducido));
                }
            }

        } while (!apellidoIntroducido.equals(""));


    }


    public static String[] StringtoArray(String linea) {

        String[] lineaArray = linea.split(",");
        return lineaArray;

    }

    public static HashMap<String, Integer> crearMapa() throws IOException {

        //creamos el mapa
        HashMap<String, Integer> frecuenciaApellidos = new HashMap<>();

        try {
            //leemos el fichero
            BufferedReader reader = new BufferedReader(new FileReader("LastnameFrequencies.csv"));
            String linea;


            while ((linea = reader.readLine()) != null) {

                String[] lineaArray = StringtoArray(linea);
                String apellidoFichero = lineaArray[0];
                String apellidoIntroducido;


                if (lineaArray.length == 2) {

                    //debemos reemplazar los puntos por nada, ya que los numeros se escriben sin puntos
                    String frecuenciaSinPuntos = lineaArray[1].replaceAll("\\.", "");
                    //pasamos de cadena a numero
                    int frecuencia = Integer.parseInt(frecuenciaSinPuntos);
                    //creamos el mapa
                    frecuenciaApellidos.put(apellidoFichero, frecuencia);

                }

            }


        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");

        }

        return frecuenciaApellidos;
    }
}
