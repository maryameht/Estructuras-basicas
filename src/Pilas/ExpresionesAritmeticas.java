package Pilas;
import java.util.*;
//1. Añadimos a la pila los operandos que vamos encontrando --> pila.add
//2.Leemos la cadena elemento por elemento hasta encontrarnos con un operando --> fori
//3. Al leer el operador extraemos 2 valores de la pila siendo el primer elemento el segundo operando -->
// --> si i = / * + - --> extraemos 2 valore sde la pila (pila.poo) --> i + 1 = i return resultado

//Método 1 --> pila (se añaden los elemntos por delante)
//Método 2 --> cola (se añaden los elemntos por detras)

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println(calcular("5 1 2 + 4 * 3 -")); //5 + 1 = 6 y 2 *4=8 resultado = 6+8

    }

    public static int calcular (String cadena ) {

        String [] expresion = cadena.split(" ");

        Stack<Character> pila = new Stack<Character>();
        int operando1;
        int operando2;
        int resultado = 0;
        for (int i = 0; i < expresion.length; i++) {

            switch (expresion[i]){

                case "/":
                    operando1 = pila.pop();
                    operando2 = pila.pop();
                    resultado = pila.push((char) (operando1/operando2));
                    break;

                case "*":
                    operando1 = pila.pop();
                    operando2 = pila.pop();
                    resultado = pila.push((char) (operando1*operando2));

                    break;

                case "+":
                    operando1 = pila.pop();
                    operando2 = pila.pop();
                    resultado = pila.push((char) (operando1 + operando2));

                    break;

                case "-":
                    operando1 = pila.pop();
                    operando2 = pila.pop();
                    resultado = pila.push((char) (operando2-operando1));
                    break;

                default:
                    resultado = pila.push((char) Integer.parseInt(expresion[i]));
            }
        } return resultado;


    }



}


