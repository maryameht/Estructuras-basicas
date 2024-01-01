package ArrayList;

import java.util.ArrayList;

public class Coches {
    public static void main(String[] args) {

        //creamos el arraylist de coches, donde almacenaremos
        //los coches

        ArrayList<String> coches = new ArrayList<>();
        String coche;

        //creamos un bucle donde iremos pidiendo al usuario el coche
        //si el usuario introduce un espacio en blanco, acaba
        do {
            coche = Utilidades.leerCadena("Introduce el coche que deseas");
            coches.add(coche);


        } while (!coche.isEmpty());

        System.out.println(coches);

    }




}

