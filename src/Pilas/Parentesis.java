package Pilas;

import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {

        System.out.println("¿Está bien parentizada?:" + esParentizada("[{}()]"));

    }

    public static boolean esParentizada (String frase) {

        Stack<Character> pila = new Stack<Character>();

        //recorremos la cadema
        for (int i = 0; i < frase.length(); i++) {
            //si en la cadena encontramos el caracter ( [ { , añade a la pila
            char caracter = frase.charAt(i);

            if (caracter == '[' || caracter == '{' || caracter == '(') {
                pila.add(caracter);
            } else {
                //creamos el caracter "ultimo" que va a ser el ultimo elemento de la pila
                char ultimo = pila.pop();
                //si el caracter es el simbolo de cierre y el ultimo caracter no es el de apertura
                // devuelve verdadero
                if ( caracter == ')' && ultimo != '(')
                    return false;
                if (caracter == ']' && ultimo != '[')
                    return false;
                if (caracter == '}' && ultimo != '{')
                    return false;

            }

        }
        return pila.isEmpty();
    }







}




