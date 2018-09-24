package CH7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){

        //Step 1: Declare a variable
        int x;
        int[] numbers1 = new int[5]; //An int array of size 5

        //Step 2: Initialize the variable
        x = 5;
        System.out.println("Numbers1 = " + Arrays.toString(numbers1)); //Before populating the array
         for(int i = 0; i <5; i++) {
             numbers1[i] = i + 1;
         }
        System.out.println("Numbers1 = " + Arrays.toString(numbers1)); //After populating the array

        //Or declare and initialize at the same time
        int y = 5;
        int[] numbers2 = {1,2,3,4,5};
        System.out.println("Numbers2 = " + Arrays.toString(numbers2));
    }
}
