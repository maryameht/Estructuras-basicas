package Mapas;

/*crear una guía de telefonos que asocie un número de teléfono
a un contacto
El programa debe pedir un contacto y mostrar un numero asociado
*/
//Mapa: contacto --> teléfono

import ArrayList.Utilidades;
import java.util.*;

public class Telefonos {

    public static void main(String[] args) {

        Map<String,String> agenda = RellenarAgenda();
        String contacto, telefono = buscarContacto(agenda);
        if (agenda.containsValue(telefono)) {
            System.out.println("Telefono:" + telefono);
        } else {
            System.out.println("No existe");
        }


    }

    public static Map<String,String> RellenarAgenda () {

        Map<String,String> RellenarAgenda = new HashMap<>();
        RellenarAgenda.put("Juan", "765999098");
        RellenarAgenda.put("Maria", "964555213");
        RellenarAgenda.put("Jefe", "654876211");


        return RellenarAgenda;
    }

    public static String buscarContacto (Map<String, String> RellenarAgenda) {

        String telefono = "";
        String contacto = Utilidades.leerCadena("Introduce el contacto");

        for (int i = 0; i < RellenarAgenda.size(); i++) {


            if (RellenarAgenda.containsKey(contacto)) {
                telefono = RellenarAgenda.get(contacto);
            }

        }
        return telefono;

    }




}
