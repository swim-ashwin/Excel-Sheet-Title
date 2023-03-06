public class median{

    public static void main(){

    }

    public int[] merge(int[] arr1, int[] arr2){
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

    public int[] sort(int[] mergedArray){
        return null;
    }

    public int findMedian(int[] rearranged){
        return 0;
    }
    

}