//This program takes user input and calculates the average temperature for n days
//This program also identifies how many days are above the average temperature
package CH7Arrays;

import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args) {
        numberDays();
    }
        //Step 1: Ask the user for the input, the number of days
        public static void numberDays() {
            System.out.print("How many days's temperatures? ");
            Scanner console = new Scanner(System.in);
            int days = console.nextInt();
            temperatures(days,console);
        }

        //Step 2: Print the temperature for each day
    public static void temperatures (int days, Scanner console){
        int tempSum = 0;
        int[] temps = new int[days];
        for (int i = 1; i <= days; i++) {
            System.out.print("Day " + i + "'s high temp: ");
            int currentTemp = console.nextInt();
            temps[i - 1] = currentTemp;
            tempSum += currentTemp;
        }
}
        //Step 3: Calculate and compare the average temp. to each days temp. to see if its higher
    public static void Average(int tempSum, int[] temps) {
        int Averagetemp = tempSum / temps.length;
        int higher = 0;
        for (int i = 1; i <= temps.length; i++) {
            if (temps[i - 1] > Averagetemp) {
                higher++;
            }

        }

        //Step 5: Print the average and the number of days above the average
        System.out.println("Average temp = " + Averagetemp);
        System.out.println(higher + " days were above average.");
    }
}
