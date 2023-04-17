public class median_v2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        double[] median = mergeAndSort(arr1, arr2);
        System.out.println("Median of the merged array is: " + median);
    }

    // public static int[] merge(int[] arr1, int[] arr2) {
    //     if (arr1 == null || arr1.length == 0) {
    //         return arr2;
    //     }
    //     if (arr2 == null || arr2.length == 0) {
    //         return arr1;
    //     }

    //     int aLength = arr1.length;
    //     int bLength = arr2.length;
    //     int totalLength = aLength + bLength;

    //     int[] c = new int[totalLength];
    //     for (int i = 0; i < aLength; i++) {
    //         c[i] = arr1[i];
    //     }
    //     for (int i = 0; i < bLength; i++) {
    //         c[aLength + i] = arr2[i];
    //     }

    //     return c;
    // }

    // public static int[] sort(int[] mergedArray) {
    //     if (mergedArray.length > 0) {
    //         for (int i = 0; i < mergedArray.length - 1; i++) {
    //             for (int j = i + 1; j < mergedArray.length; j++) {
    //                 if (mergedArray[j] < mergedArray[i]) {
    //                     int temp = mergedArray[i];
    //                     mergedArray[i] = mergedArray[j];
    //                     mergedArray[j] = temp;
    //                 }
    //             }
    //         }
    //         return mergedArray;
    //     } else {
    //         System.out.print("Array is empty");
    //         return mergedArray;
    //     }
    // }

    // public static double findMedian(int[] arr1, int[] arr2) {
    //     int a = arr1.length;
    //     int b = arr2.length;
    
    //     int[] mergedArray = new int[a + b];
    
    //     int i = 0;
    //     int j = 0;

    //     for (int k = 0; k < mergedArray.length; k++) {
    //         if (i == a) {
    //             mergedArray[k] = arr2[j];
    //             j++;
    //         }
    //         else if (j == b) {
    //             mergedArray[k] = arr1[i];
    //             i++;
    //         }
    //         else if (arr1[i] < arr2[j]) {
    //             mergedArray[k] = arr1[i];
    //             i++;
    //         } else {
    //             mergedArray[k] = arr2[j];
    //             j++;
    //         }
    //     }

    //     double median;
    //     if ((a + b) % 2 == 0) {
    //         int middle1 = (a + b) / 2 - 1;
    //         int middle2 = (a + b) / 2;
    //         median = (mergedArray[middle1] + mergedArray[middle2]) / 2.0;
    //     } else {
    //         int middle = (a + b) / 2;
    //         median = mergedArray[middle];
    //     }

    //     return median;
    // }

    public static double[] mergeAndSort(int[] arr1, int[] arr2) {
        double[] mergedArr = new double[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
    
        for (; i < arr1.length && j < arr2.length; k++) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k] = arr1[i++];
            } else {
                mergedArr[k] = arr2[j++];
            }
        }
    
        for (; i < arr1.length; i++, k++) {
            mergedArr[k] = arr1[i];
        }
    
        for (; j < arr2.length; j++, k++) {
            mergedArr[k] = arr2[j];
        }

        for (i = 0; i < mergedArr.length - 1; i++) {
            for (j = i + 1; j < mergedArr.length; j++) {
                if (mergedArr[i] > mergedArr[j]) {
                    double temp = mergedArr[i];
                    mergedArr[i] = mergedArr[j];
                    mergedArr[j] = temp;
                }
            }
        }
    
        return mergedArr;
    }
    

    
    
    

    public static double findMedian(int[] rearranged) {
        int n = rearranged.length;
        if (n % 2 == 0) {
            return (rearranged[n / 2 - 1] + rearranged[n / 2]) / 2.0;
        } else {
            return rearranged[n / 2];
        }
    }
}
