import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            if(n%i == 0 && isPrime(i)) System.out.print(i + " ");
        }
    }

    private static boolean isPrime(int n) {
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
