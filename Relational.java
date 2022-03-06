import java.util.Scanner;

class Relational {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter tw values...!");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); // Greater
        b = sc.nextInt(); // Lesser
        System.out.println("True/False " + (a > b));
        System.out.println("True/False " + (a < b));
        System.out.println("True/False " + (a >= b));
        System.out.println("True/False " + (a <= b));
        System.out.println("True/False " + (a == b));
        System.out.println("True/False " + (a != b));
    }
}
