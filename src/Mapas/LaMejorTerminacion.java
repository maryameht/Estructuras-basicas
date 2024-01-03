package Mapas;

// los números que terminan con el mismo digito que el del premio principal tienen un reintegro
// entrada : array de boletos de loteria
// salida : cuántas veces se repite una terminacion

import java.util.ArrayList;
import java.util.HashMap;

public class LaMejorTerminacion {

    public static void main(String[] args) {

        ArrayList<String> boletos = boletos();
        System.out.println("Lista de boletos:" + boletos);
        System.out.println("Salida:" + terminaciones(boletos));



    }

    public static ArrayList<String> boletos () {

        ArrayList<String> boletos = new ArrayList<>();
        boletos.add("00004");
        boletos.add("03847");
        boletos.add("39804");

        return boletos;

    }


    public static HashMap<Integer,Integer> terminaciones (ArrayList<String> boletos) {



        HashMap<Integer,Integer> terminaciones = new HashMap<>();
        terminaciones.put(4,1);
        terminaciones.put(7,1);

        Integer cuantos = terminaciones.get(4);

        if (cuantos == null) {
            terminaciones.put(4, 1);
        } else {
            terminaciones.put(4, cuantos + 1);
        }

        return terminaciones;
    }







}
