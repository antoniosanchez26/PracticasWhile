package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero, contador = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Dame un número entre 1 y 100: ");
            numero = entrada.nextInt();

        } while (numero < 1 || numero > 100);
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if  (contador <= 2){
            System.out.print("El número  es primo");
        } else {
            System.out.print("El número es compuesto");
        }
    }
}
