import java.util.Arrays;

public class median_v3 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 8, 21, 48};
        int[] array2 = {3, 5, 7, 9, 10, 23, 47, 50};

        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int k = 0;

        for (int i = 0, j = 0; i < array1.length && j < array2.length; k++) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
        }

        for (int i = k; i < array1.length; i++, k++) {
            mergedArray[k] = array1[i];
        }

        for (int j = k; j < array2.length; j++, k++) {
            mergedArray[k] = array2[j];
        }

        return mergedArray;
    }
}