import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(
                "The median of the two arrays is: " + MedianOfTwoArrays(new float[] { 1, 3 }, new float[] { 2 }));
        System.out.println(
                "The median of the two arrays is: " + MedianOfTwoArrays(new float[] { 1, 2 }, new float[] { 3, 4 }));
    }

    private static float MedianOfTwoArrays(float[] array1, float[] array2) {
        // Sumamos ambos arreglos
        float[] mergedArrays = new float[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArrays, 0, array1.length);
        System.arraycopy(array2, 0, mergedArrays, array1.length, array2.length);
        // for (float num : mergedArrays) {
        // System.out.println(num);
        // }

        // Ordenamos los arreglos
        Arrays.sort(mergedArrays);

        for (float number : mergedArrays) {
            System.out.println(number);
        }

        // Deacuerdo al tamaño, sacar la media
        float mediana = mergedArrays.length / 2;
        System.out.println("Mediana: " + mediana);
        // Si no hay mitad exacta, sacamos la media de los dos numeros
        return 0;
    }
}
