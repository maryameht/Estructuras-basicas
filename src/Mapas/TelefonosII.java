package Mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TelefonosII {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("626354811");
        telefonos.add("647009231");
        agenda.put("Juan", telefonos);

        telefonos = new ArrayList<>(); //creamos de nuevo otra lista
        telefonos.add("962886431");
        telefonos.add("911");
        agenda.put("Ana", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("654782009");
        telefonos.add("998432124");
        agenda.put("Pepe", telefonos);


        System.out.println("¿Qué contacto estás buscando?");
        Scanner miScanner = new Scanner(System.in);
        String contacto = miScanner.next();
        if (agenda.containsKey(contacto)) {
           System.out.printf("Los números de %s son:"+ contacto,agenda.get(telefonos));
        } else {
            System.out.println("No se encuentra el contacto introducido");
        }




    }
}

