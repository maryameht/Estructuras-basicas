package Mapas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagramas {

    public static void main(String[] args) throws IOException {

        //leemos el archivo
        //creamos la excepcion para q no casque

        try {
            BufferedReader reader = new BufferedReader(new FileReader("spanish-dict.txt"));
            System.out.println(reader);
            String linea;

            //creamos el mapa
            HashMap<String,ArrayList> anagramas = new HashMap<>();

            while ((linea = reader.readLine())!=null) {

                // alfabetizamos la linea
                String lineaAlfa = alfabetizar(linea);
                // creamos el array list a partir de la obtencion de la clave del mapa (lineaAlfa)
                ArrayList<String> valores = anagramas.get(lineaAlfa);
                // si los valores son nulos:
                // vuelve a crear la lista
                // añade la linea a la lista
                // añade la lineaalfa y el arraylist
                if (valores == null) {
                    valores = new ArrayList<>();
                    valores.add(linea);
                    anagramas.put(lineaAlfa,valores);
                } else { // si los valores no son nulos, añade a la lista directamente
                    valores.add(linea);
                }

            }reader.close();

            System.out.println(anagramas);

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }

    }


    public static String alfabetizar (String linea) {

        char [] letras = linea.toCharArray();
        Arrays.sort(letras);
        return new String(letras);

    }
}
