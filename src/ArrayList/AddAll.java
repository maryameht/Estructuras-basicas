package ArrayList;

//un programa que añada todos los elementos de una lista a otra

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {

        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Ford");
        coches.add("Kia");
        coches.add("Volsvagen");
        coches.add("Peugeot");
        coches.add("Clio");

        ArrayList<String> mascoches = new ArrayList<String>();
        mascoches.add("Opel");
        mascoches.add("Zafira");
        mascoches.add("Golf");
        mascoches.add("Citroen");

        mascoches.addAll(coches);

        System.out.println(mascoches);


    }


}
