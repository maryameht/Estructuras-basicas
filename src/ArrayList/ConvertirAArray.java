package ArrayList;

import java.util.ArrayList;

//un programa que convierta un ArrayList en un array
public class ConvertirAArray {

    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Ford");
        coches.add("Seat");
        coches.add("Kia");

        String [] cochesArray = new String[coches.size()];
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));

        }

    }

}
