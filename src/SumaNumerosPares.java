/*
    Escribe un programa que solicite al usuario ingresar un número entero positivo NN.
    El programa debe calcular la suma de todos los números pares desde 2 hasta NN (incluyendo NN) e imprimir el resultado.
    Por ejemplo, si el usuario ingresa N=10N=10, el programa debería calcular la suma 2+4+6+8+102+4+6+8+10
    e imprimir el resultado 3030.
 */

import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numeroSumatoria;

        System.out.println("Dame el numero hasta que quieres la sumatoria: ");
        numeroSumatoria = reader.nextInt();
        reader.close();

        sumaPares(numeroSumatoria);
    }

    private static void sumaPares(int numeroFinal) {
        if (numeroFinal <= 0)
            return;

        int sumatoria = 0;

        for (int i = 2; i <= numeroFinal; i += 2) {
            sumatoria += i;
        }

        System.out.printf("""
                El resultado de la sumatoria hasta el numero %d es: %d
                """, numeroFinal, sumatoria);
    }
}
