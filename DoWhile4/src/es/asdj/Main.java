package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("NÚMERO " + i );
            System.out.println("======================================================");
            do {
                System.out.print("Dame un número entre 1 y 100: ");
                numero = entrada.nextInt();
            } while (numero < 1 || numero > 100);
            System.out.println();
        }
        entrada.close();
    }
}