public class median{

    public static void main(String[] args){
         int[] arr1 = {};
        int[] arr2 = {};
        int[] mergedArray = merge(arr1, arr2);

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        int[] result = sort(mergedArray);
        double median = findMedian(result);
        System.out.print("\n" + "Median is: ");
        System.out.println(median);
    
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

    public static double findMedian(int[] rearranged){
        int n = rearranged.length;
    if (n % 2 == 0) {
        return (rearranged[n/2 - 1] + rearranged[n/2]) / 2.0;
    } else {
        return rearranged[n/2];
    }
    }
    

}