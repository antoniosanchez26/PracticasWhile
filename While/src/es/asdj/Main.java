package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String texto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe todo lo que quieras (“salir” para terminar)... Empieza cuando quieras.");
        texto = entrada.nextLine();

        while (!texto.equals("salir")) {
            System.out.println(texto);
            texto = entrada.nextLine();
        }
        entrada.close();
    }
}
