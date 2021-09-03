import java.util.Scanner;

public class SumAndMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();     // 5
        int multi = sc.nextInt();   // 6
        // 2 , 3
        for(int i=1; i<=sum/2; i++){
            if(multi%i == 0){
                if(i + (multi/i) == sum) System.out.println(i + " " + multi/i);
            }
        }
    }
}
