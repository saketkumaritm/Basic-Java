import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxi = 10000001;
        boolean isPrime[] = new boolean[maxi];
        for (int i = 0; i < maxi; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(maxi); i++) {
            if (isPrime[i] == true) {
                for (int j = i + i; j <= maxi; j++) {
                    isPrime[j] = false;
                }
            }
        }
        int counterArray[] = new int[maxi];
        counterArray[0] = counterArray[1] = 0;
        for (int i = 2; i < maxi; i++) {
            if (isPrime[i] == true) {
                counterArray[i] = counterArray[i - 1] + 1;
            } else {
                counterArray[i] = counterArray[i - 1];
            }
            int testcase = sc.nextInt();
            while (testcase > 0) {
                int n = sc.nextInt();
                int ans = counterArray[n] - counterArray[n / 2];
                System.out.println(ans);
                testcase--;
            }
        }
    }
}