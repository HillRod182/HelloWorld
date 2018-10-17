package CH7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {5, 8, 7, 12};
        System.out.println("Before the Algos " +Arrays.toString(array));
        array = jonnyAlgo(array);
        System.out.println("After Jonnys Algo "+Arrays.toString(array));

    }

    //This algo is an in-array swap
    public static int[] jonnyAlgo(int[] ja) {
        int current = 0;
        for(int i = 0;i<=ja.length/2;i++){
            current = ja[i];
            ja[i]=ja[ja.length-i-1];
            ja[ja.length-i-1] = current;
        }
return ja;
    }

    //This algo uses a temp array
    public static int[] abbyAlgo(int[] aa) {

        //  Step 1: Create a new temp int array of that size
        int[] temp = new int[aa.length];
        //  Step 2: Copy the conetnts of the original array into the new array of the same size in reverse

        for (int i = aa.length - 1; i >= 0; i--) {
            temp[aa.length-i-1] = aa[i];
        }
        aa = temp;
        return aa;
    }
}
