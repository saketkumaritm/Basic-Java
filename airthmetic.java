import java.util.Scanner;

class airthmetic {
    public static void main(String[] args) {
        int a, b, c, ch;
        System.out.print("Enter any two number ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your Choice ");
        // ch = sc.nextInt();
        switch (ch) {
            case 1:
                c = a + b; {
                System.out.print("Addition - " + c);
                break;
            }
            case 2:
                c = a - b; {
                System.out.print("Substract - " + c);
                break;
            }
            case 3:
                c = a * b; {
                System.out.print("Multiplication - " + c);
                break;
            }
            case 4:
                c = a / b; {
                System.out.print("Division - " + c);
                break;
            }
            case 5:
                c = a % b; {
                System.out.print("Remainder - " + c);
                break;
            }
            default: {
                System.out.print("invalid choice.....");
            }

        }
    }
}