import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int N = reader.nextInt();

        reader.close();

        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        System.out.println("La sumatoria de 1 a " + N + " es: " + suma);
    }
}
