/*
Se te proporciona un array de enteros nums de longitud n con índice base 0, así como un entero indexDifference y un entero valueDifference.
Tu tarea es encontrar dos índices, i y j, ambos en el rango [0, n - 1], que cumplan con las siguientes condiciones:
    abs(i - j) >= indexDifference, y
    abs(nums[i] - nums[j]) >= valueDifference
Devuelve un array de enteros llamado answer, donde answer = [i, j] si hay dos índices que cumplen con las condiciones, y answer = [-1, -1] en caso contrario. Si hay varias opciones para los dos índices, puedes devolver cualquiera de ellas.
Nota: i y j pueden ser iguales.
 */

public class FindIndicesWithIndexAndValueDifferenceI {
    public static void main(String[] args) {
        int[] foo = findIndices(new int[] { 5, 1, 4, 1 }, 2, 4);
        for (int number : foo) {
            System.out.println(number);
        }
    }

    private static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int numLength = nums.length;

        for (int i = 0; i < numLength; i++) {
            for (int j = i + indexDifference; j < numLength; j++) {
                if (Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
