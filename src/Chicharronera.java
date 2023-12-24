import java.util.Scanner;

public class Chicharronera {

    public static void main(String[] args) {

        int A, B, C;

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes A, B y C separados por un espacio:");
        A = reader.nextInt();
        B = reader.nextInt();
        C = reader.nextInt();
        reader.close();

        double[] soluciones = chicharronear(A, B, C);

        System.out.println("Soluciones: " + soluciones[0] + " " + soluciones[1]);
    }

    public static double[] chicharronear(int A, int B, int C) {
        double discriminante = Math.pow(B, 2) - 4 * A * C;

        double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
        double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);

        return new double[] { x1, x2 };
    }
}
