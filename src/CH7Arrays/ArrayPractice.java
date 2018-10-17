package CH7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        /*
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
        */

        //randomArray();

        int number = 669260267;
        int mode =mode(number);
        System.out.println(mode);
    }

   /* public static void randomArray(){
        int randomNum = (int)(Math.random()*10)+1; //Math.random class creates a random number between 0.0 and 1.0
                                                    //Then multiply the range by 10 and shift it by 1 to 1.0 to 11.0
                                                    //Then typecast int so that it will drop the decimal points
        int[] array = new int[randomNum];
        for(int i = 0; i< array.length; i++){
            array[i]= (int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(array));
    }*/

//Michaels algo
   /* public static int mode(int num){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        while(num>0){
            int digit = num%10;
            if(digit==0){
                count0++;
            }else if(digit==1){
                count1++;
            }else if(digit==2){
                count2++;
            }else if(digit==3){
                count3++;
            }else if(digit==4){
                count4++;
            }else if(digit==5){
                count5++;
            }else if(digit==6){
                count6++;
            }else if(digit==7){
                count7++;
            }else if(digit==8){
                count8++;
            }else if(digit==9){
                count9++;
            }
            num = num/10;

        }
        int MaxFinal = Math.max(count0,Math.max(count1,Math.max(count2,Math.max(count3,Math.max(count4,Math.max(count5,Math.max(count6,Math.max(count7,
                Math.max(count8,count9)))))))));
        if(MaxFinal==0) {
            count0++;
        }
        else if(MaxFinal==count0) {
            count0++;
        }else if(MaxFinal==count1) {
            count0++;
        }else if(MaxFinal==count2) {
            count0++;
        }else if(MaxFinal==count3) {
            count0++;
        }else if(MaxFinal==count4) {
            count0++;
        }else if(MaxFinal==count5) {
            count0++;
        }else if(MaxFinal==count6) {
            count0++;
        }else if(MaxFinal==count7 ) {
            count0++;
        }else if(MaxFinal==0) {
            count0++;
        }else if(MaxFinal==0) {
            count0++;
        }
    }*/

   //Justins algo
    public static int mode(int num){
        int[] array = new int[10];
       int digit = 0;
        while (num>0){
          digit = num%10;
          array[digit]++;
          num=num/10;
        }
        int maxNum = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i]> maxNum){
                maxNum = array[i];
            }
        }
        int mode = 0;
        for (int i = 1;i<array.length;i++){
            if (array[i]==maxNum) {
                mode = i;
            }
        }
        return mode;
    }
}
