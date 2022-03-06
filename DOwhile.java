import java.util.Scanner;

class DOWhile {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        do {
            System.out.print(num + " ");
            ++num;
        } while (num < 10);

    }
}