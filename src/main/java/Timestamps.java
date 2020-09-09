import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int secInHour1, secInHour2;
        int secInMin1, secInMin2;

        /*
         *  your code goes here
         */
        secInHour1 = hours1 * 3600;
        secInHour2 = hours2 * 3600;
        secInMin1 = minutes1 * 60;
        secInMin2 = minutes2 * 60;
        int deltaHour = secInHour2 - secInHour1;
        int deltaMin = secInMin2 - secInMin1;
        int delta = seconds2 - seconds1;
        int totalSec = deltaHour + deltaMin + delta;
        System.out.print(totalSec);

        // closing the scanner object
        scanner.close();
    }
}