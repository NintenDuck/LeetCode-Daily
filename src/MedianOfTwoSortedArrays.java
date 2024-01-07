import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(
                "The median of the two arrays is: "
                        + MedianOfTwoArrays(new float[] { 1.0f, 3.0f }, new float[] { 2.0f }));
        System.out.println(
                "The median of the two arrays is: "
                        + MedianOfTwoArrays(new float[] { 1.0f, 2.0f }, new float[] { 3.0f, 4.0f }));
    }

    /**
     * @param array1
     * @param array2
     * @return median of the two arrays
     */
    private static float MedianOfTwoArrays(float[] array1, float[] array2) {
        System.out.println("========================================");
        float[] mergedArrays = new float[array1.length + array2.length];
        float mediana = 0.0f;
        
        // Sumamos ambos arreglos
        System.arraycopy(array1, 0, mergedArrays, 0, array1.length);
        System.arraycopy(array2, 0, mergedArrays, array1.length, array2.length);

        // Ordenamos los arreglos
        Arrays.sort(mergedArrays);

        // Deacuerdo al tamaño, sacar la mediana
        mediana = (mergedArrays.length / 2);

        if (medianaExacta(mediana)) {
            return mergedArrays[(int) mediana];
        } else {
            // Si no hay mitad exacta, sacamos la media de los dos numeros
            return (mergedArrays[mergedArrays.length / 2] + mergedArrays[(mergedArrays.length / 2) + 1]) / 2;
        }
    }

    /**
     * @param mediana
     * @return true or false depending on result
     */
    private static boolean medianaExacta(float mediana) {
        return mediana - (int) mediana == 0 ? true : false;
    }
}
