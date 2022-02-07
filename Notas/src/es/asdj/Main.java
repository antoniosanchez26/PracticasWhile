package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int notas,numero,aprobados = 0,suspensos = 0, media = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas notas quieres introducir? ");
        notas = entrada.nextInt();
        System.out.println();

        for (int i = 0 ; i < notas; i++) {
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                numero = entrada.nextInt();
                if (numero >= 5) {
                    aprobados = aprobados +1;
                } else {
                    suspensos = suspensos +1;
                }
                media = (media + numero) /2;
            } while (numero < 0 || numero > 10);
            System.out.println();
        }
        entrada.close();

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
        System.out.println("Media de notas: " + media);
    }
}