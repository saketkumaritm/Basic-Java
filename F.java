import java.util.Scanner;

class F {
    public static void main(String[] args) {
        int pwd;
        System.out.print("Enter Password ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if (pwd == 2456) {
            System.out.println("My Name: Saket kumar");
            System.out.println("My Age: 28 ");
            System.out.println("My Contact number: 8544242615 ");
            System.out.println("My Address: Aura County Pune ");

        } else {
            System.out.print("Sorry Wrong Password");
        }

    }
}
