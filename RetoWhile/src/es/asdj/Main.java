package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0,numero, producto = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Indica la altura, en filas, del triángulo: ");
        numero = entrada.nextInt();

        while (i < numero) {
            System.out.println(producto);
            producto = producto * 10 + 1;
            i++;

        }
        entrada.close();
    }
}
