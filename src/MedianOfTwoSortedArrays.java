import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(
                "The median of the two arrays is: "
                        + MedianOfTwoArrays(new float[] { 1.0f, 3.0f }, new float[] { 2.0f }));
        System.out.println(
                "The median of the two arrays is: "
                        + MedianOfTwoArrays(new float[] { 1.0f, 2.0f }, new float[] { 3.0f, 4.0f }));
    }

    private static float MedianOfTwoArrays(float[] array1, float[] array2) {
        System.out.println("========================================");
        // Sumamos ambos arreglos
        float[] mergedArrays = new float[array1.length + array2.length];
        float mediana = 0.0f;

        System.arraycopy(array1, 0, mergedArrays, 0, array1.length);
        System.arraycopy(array2, 0, mergedArrays, array1.length, array2.length);
        // for (float num : mergedArrays) {
        // System.out.println(num);
        // }

        // Ordenamos los arreglos
        Arrays.sort(mergedArrays);

        // for (float number : mergedArrays) {
        // System.out.println(number);
        // }

        // Deacuerdo al tamaño, sacar la media
        mediana = (mergedArrays.length / 2);
        System.out.println("Mediana: " + mediana);

        // TODO: HACER RETURN CORRECTO
        if (medianaExacta(mediana)) {
            return mediana;
        } else {
            // Si no hay mitad exacta, sacamos la media de los dos numeros
            return (mergedArrays[mergedArrays.length/2] + mergedArrays[(mergedArrays.length/2) + 1]) / 2;
        }
    }

    private static boolean medianaExacta(float mediana) {
        return mediana - (int) mediana == 0 ? true : false;
    }
}
