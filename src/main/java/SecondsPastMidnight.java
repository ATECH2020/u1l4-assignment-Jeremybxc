import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds= scanner.nextInt();
        int hour;
        int min;

        //Your code goes here
        hour = seconds/3600;
        min = seconds/60;
        System.out.print(hour + " " + min);

        // closing the scanner object
        scanner.close();
    }
}