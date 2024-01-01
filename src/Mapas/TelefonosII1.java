package Mapas;

//esta vez un contacto puede tener más de un telefono
//Arraylist --> telefonos
//Mapa : contacto --> array telefonos

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelefonosII1 {

    public static void main(String[] args) {


        Map<String,ArrayList<String>> agenda = rellenarAgenda();
        String contacto, telefonos = buscarContacto(agenda);

        if (agenda.containsValue(telefonos));
        System.out.println("Telefonos:" + telefonos);


        //------------------------------------DUDA----------------------------------------------------------
        /* Cuando pongo la siguiente condición para indicar "Error" en caso de no encontrar el contacto,
           no me funciona bien:

           if (agenda.containsValue(telefonos)) {
            System.out.println("Error");
        }

         */


    }

    public static Map<String, ArrayList<String>> rellenarAgenda () {

        Map<String,ArrayList<String>> agenda = new HashMap<>();

        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("654777432");
        telefonos.add("876231099");
        agenda.put("Juan", telefonos);

        telefonos = new ArrayList<>(); //limpiamos la agenda y volvemos a añadir numeros
        telefonos.add("657222123");
        telefonos.add("765999032");
        agenda.put("Maria", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("879666543");
        telefonos.add("324777098");
        agenda.put("Jefe", telefonos);

        return agenda;
    }

    public static String buscarContacto (Map<String,ArrayList<String>> agenda) {

        String telefonos = "" ;
        String contacto = Utilidades.leerCadena("Introduce el contacto");
        for (int i = 0; i < agenda.size(); i++) {

            if (agenda.containsKey(contacto)) {
               telefonos = String.valueOf(agenda.get(contacto));
            }

        }
        return telefonos;
    }


}
