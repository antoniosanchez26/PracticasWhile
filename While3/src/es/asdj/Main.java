package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5;i++) {
            System.out.println("NUMERO " + (i + 1) + ": ");
            do {
                System.out.print("Dame un número positivo: ");
                numero = entrada.nextInt();
            } while (numero < 0);
            System.out.println("El número que me has dado es: " + numero);
            System.out.println("-------------------------------");
        }
        entrada.close();
    }
}
