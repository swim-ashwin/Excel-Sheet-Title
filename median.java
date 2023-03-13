public class median{

    public static void main(String[] args){
    // int[] arr1 = {1, 3, 5};
    // int[] arr2 = {2, 4, 6, 8};
    // int[] mergedArray = merge(arr1, arr2);

    // for (int i = 0; i < mergedArray.length; i++) {
    //     System.out.print(mergedArray[i] + " ");
    // }

    int[] test = {4, 7, 11, 2, 8};
    int[] result = sort(test);

    for(int i = 0; i < result.length; i++){
        System.out.print(result[i] + " ");
    }
    
    }

    public static int[] merge(int[] arr1, int[] arr2){
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }
        if (arr2 == null || arr2.length == 0) {
            return arr1;
        }
    
        int aLength = arr1.length;
        int bLength = arr2.length;
        int totalLength = aLength + bLength;
    
        int[] c = new int[totalLength];
        for (int i = 0; i < aLength; i++) {
            c[i] = arr1[i];
        }
        for (int i = 0; i < bLength; i++) {
            c[aLength + i] = arr2[i];
        }
    
        return c;
    }

    public static int[] sort(int[] mergedArray){
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = i + 1; j < mergedArray.length; j++) {
                if (mergedArray[j] < mergedArray[i]) {
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }
        return mergedArray;
    }

    public static int findMedian(int[] rearranged){
        return 0;
    }
    

}