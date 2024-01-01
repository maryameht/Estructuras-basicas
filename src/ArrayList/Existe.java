package ArrayList;

import java.util.ArrayList;

//método que compruebe si un elemento existe en un ArryList dado
public class Existe {
    public static void main(String[] args) {

        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Ford");
        coches.add("Kia");
        coches.add("Volsvagen");
        coches.add("Peugeot");
        coches.add("Clio");

        System.out.println("¿Existe?:" + existe(coches));
    }

    public static boolean existe(ArrayList<String> coches) {

        for ( String coche : coches) {

            if (coches.contains("Ford")) {
                return true;
            }
        }
        return false;


    }

}
