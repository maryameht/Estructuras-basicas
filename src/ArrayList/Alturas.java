package ArrayList;
//media altura = sumaalturas / numero de alumnos

//numero de alumnos
//alturas
//alumnos más altos? encontrar el max
//alumnos más bajos? encontrar el min


import java.util.ArrayList;

public class Alturas {

    public static void main(String[] args) {

        //hacemos la llamada a los métodos

        int alumnos = numeroAlumnos();
        ArrayList<Double> alturas = leerAlturas(numeroAlumnos());
        double media = calcularMedia(alturas);
        int alumnosAlturaSuperior = calcularAlumnosAlturaSuperior(alturas,media);
        int alumnosAlturaInferior = calcularAlumnosAlturaInferior(alturas, media);
        mostrarResultados(alturas, media);



    }

    public static int numeroAlumnos () {

        int numAlumnos;
        return numAlumnos = Utilidades.leerEntero("¿Cuantos alumnos hay en clase?");
    }

    public static ArrayList<Double> leerAlturas (int numAlumnos) {

        ArrayList<Double> alturas = new ArrayList<>();
        double altura;

        System.out.println("Introduce la altura del alumno");

        //por cada uno de los alumnos añadimos una altura
        for (int i = 0; i < numAlumnos; i++) {
            alturas.add(Utilidades.leerDoble(""));
        }
        return alturas;

    }

    public static double calcularMedia (ArrayList<Double> alturas) {

        double sumaAlturas = 0;

        for (int i = 0; i < alturas.size(); i++) {
            sumaAlturas += alturas.get(i);

        }
        double media = sumaAlturas / alturas.size();
        return media;


    }

    public static int calcularAlumnosAlturaSuperior (ArrayList<Double> alturas, double media) {

       int alumnos = 0;

        for (int i = 0; i < alturas.size(); i++) {

            if (alturas.get(i) > media) {

                alumnos ++;

            }

        }

        return alumnos;

    }

    public static int calcularAlumnosAlturaInferior (ArrayList<Double> alturas, double media) {

        int alumnos = 0;

        for (int i = 0; i < alturas.size(); i++) {

            if (alturas.get(i) < media);

            alumnos ++;

        }

        return alumnos;


    }

    public static void mostrarResultados (ArrayList<Double> alturas, double media) {

        System.out.println("Alturas:" + alturas);
        System.out.println("Media:" + media);
        System.out.println("Número de alumnos con altura inferior a la media:" + calcularAlumnosAlturaInferior(alturas, media));
        System.out.println("Número de alumnos con altura superior a la media:" + calcularAlumnosAlturaSuperior(alturas, media));
    }


}
