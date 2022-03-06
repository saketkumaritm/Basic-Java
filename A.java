import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter any two number ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.print("Sum of the two number = " + c);
        // int a = 5, b = 7;
        // System.out.println(" And " + (a & b));
        // System.out.println(" OR " + (a | b));
        // System.out.println(" XOR " + (a ^ b));
        // System.out.println(" Complement " + (~a));
    }
}
