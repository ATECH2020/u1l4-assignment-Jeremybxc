import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int deg = scanner.nextInt();
        int hour;
        int ndeg;
        int aTime;

        /*
         *  your code goes here
         */
        hour = deg / 30;
        ndeg = deg - (hour * 30);
        aTime = ndeg * 2;
        System.out.print(aTime + " min");


        // closing the scanner object
        scanner.close();
    }
}