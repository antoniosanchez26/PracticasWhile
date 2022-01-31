package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0,numero, producto;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Qué tabla de multiplicar quiere repasar? La tabla del: ");
        numero = entrada.nextInt();

        while (i <= 10) {
            producto = i * numero ;
            System.out.println(i + " x " + numero + " = " + producto);
            i++;

        }
        entrada.close();
    }
}
