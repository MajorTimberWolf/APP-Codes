import java.util.*;
public class Tutorial5_4 {
    boolean primeOrNot(int num) {
        if(num<=1) {
            return false;
        }
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            Tutorial5_4 obj = new Tutorial5_4();
            if(obj.primeOrNot(n)) {
                System.out.println("PRIME NUMBER");
            }
            else {
                System.out.println("NOT A PRIME NUMBER");
            }
        }
    }
}
