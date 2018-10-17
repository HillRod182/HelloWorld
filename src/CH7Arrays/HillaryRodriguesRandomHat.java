//This program allows the user to enter an even number of team and then prints in a round order what teams will compete
package CH7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HillaryRodriguesRandomHat {
    public static void main(String[] args){
       nTeams();
    }

    public static void nTeams(){
        int numTeams = 0;
        Scanner console = new Scanner (System.in);
        System.out.print("How many teams? "); // asks the user how many teams are going to be competing
       int n = 0;
       do{
           n = console.nextInt();
           if (n%2 == 0) {
               numTeams = n;
           } else {
               System.out.print("Please enter an even number ");
           }
      } while(numTeams ==0);
       vs(numTeams);
    }

    public static void vs(int n){
boolean repeat = true;
        int[] teams = new int[n];
       int[] vsTeams = new int[n]; // Empty array to hold the random numbers
        for (int i=0;i<=vsTeams.length-1;i++) {
            int random = (int) (Math.random() * n) + 1; // Creates random numbers between 1 and the number of teams
            //System.out.println(random);
            for (int j = 0; j <= i; j++) {
                if (random != vsTeams[j]) {
                   repeat = false;
                    //System.out.println(Arrays.toString(vsTeams));
                }

            }
            if(repeat == false){
                vsTeams[i] = random;
            }
        }

        for (int i=0;i<vsTeams.length-1;i+=2) {
            System.out.println("Team " + vsTeams[i] + " vs. Team " + vsTeams[i + 1]);
        }
    }
}
