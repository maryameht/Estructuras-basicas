package Mapas;
import java.util.*;
// pais --> capital
// pedimos al usuario un pais y mostramos su capital
public class PaisCapital {
    public static void main(String[] args) {

        HashMap<String,String> mundo = rellenarmapa();
        System.out.println("Introduce el país y te muestro su capital");
        String capital = buscarpaisycapital(mundo);
        System.out.println("La capital del pais introducido es " + capital);


    }

    public static HashMap<String, String> rellenarmapa () {

        HashMap<String, String> mundo = new HashMap<>();
        mundo.put("España", "Madrid");
        mundo.put("Marruecos", "Rabat");
        mundo.put("Inglaterra", "Londres");


        return mundo;
    }

    public static String buscarpaisycapital (HashMap<String,String> mundo) {


        Scanner miScanenr = new Scanner(System.in);
        String pais = miScanenr.next();
        String capital = "";

        for (int i = 0; i < mundo.size(); i++) {

            if (mundo.containsKey(pais)) {

                capital = mundo.get(pais);

            }

        }
        return capital;
    }


}
