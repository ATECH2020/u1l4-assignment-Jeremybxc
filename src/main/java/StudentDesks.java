import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();
        int chr1, chr2, chr3, totD;

        /*
         *  your code goes here
         */
        if (class1 % 2 == 0)
        {
          chr1 = class1 / 2;
        }else
        {
          chr1 = (class1 / 2) + 1;
        }
        if (class2 % 2 == 0)
        {
          chr2 = class2 / 2;
        }else
        {
          chr2 = (class2 / 2) + 1;
        }
        if (class3 % 2 == 0)
        {
          chr3 = class3 / 2;
        }else
        {
          chr3 = (class3 / 2) + 1;
        }
        totD = chr1 + chr2 + chr3;
        System.out.print(totD);

        // closing the scanner object
        scanner.close();
    }
}