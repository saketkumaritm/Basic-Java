/* Control Flow */

// for
// while
// do while
// for each
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i < 20; i++) {
            System.out.println("num " + i);
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("Even Number");
                break;
            } else {
                System.out.println("Odd number ");
                break;
            }
        }
        System.out.print("while loop");

    }
}