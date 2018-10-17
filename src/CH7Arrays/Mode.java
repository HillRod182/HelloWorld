package CH7Arrays;

public class Mode {
    public static void main(String[]args){
        int number =669260267;
        int mode =mode(number);
        System.out.println(mode);
    }
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

