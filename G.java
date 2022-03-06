import java.util.Scanner;

class G {
    public static void main(String[] args) {
        int Age;
        System.out.print("Enter Age of Candidte is ");
        Scanner sc = new Scanner(System.in);
        Age = sc.nextInt();
        // System.out.println("The age of the Candidate is " + Age);
        if (Age >= 18) {
            System.out.print("Eligible for Vote ");

        } else {
            System.out.print("Sorry You aren't Eligible for Vote ");
        }
    }
}