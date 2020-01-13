import java.math.BigInteger;
import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        int n = scan.nextInt();
        int sum = 1;
        for (int i = 1; i <=n ; i++) {
            a = a.multiply(b);
        }
        System.out.println(a);
    }
}
