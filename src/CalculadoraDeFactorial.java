import java.util.Scanner;

public class CalculadoraDeFactorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero;

        System.out.println("Dame un numero, y te dare su factorial:");
        numero = reader.nextInt();

        calcularFactorial(numero);

        reader.close();
    }

    private static void calcularFactorial(int numero) {
        if (numero < 0) {
            System.out.println("El factorial no esta definido para numeros negativos");
            return;
        }

        long sumFactorial = 1;

        for (int i = numero; i > 1; i--) {
            sumFactorial *= i;
        }

        System.out.println("Factorial de: " + numero + " es: " + sumFactorial);
    }
}
