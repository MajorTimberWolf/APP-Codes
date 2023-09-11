import java.util.*;
public class Tutorial5_1 {
    String mirrorImage(String str) {
        String ans = "";
        for(int i=str.length()-1;i>=0;i--) {
            ans+=str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Tutorial5_1 obj = new Tutorial5_1();
            System.out.print("Enter the string: ");
            String str = sc.nextLine();
            System.out.print("Mirror Image: "+obj.mirrorImage(str));
        }
    }
}
