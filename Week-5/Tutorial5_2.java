import java.util.*;
public class Tutorial5_2 {
    Boolean rotationallyEq(String str1, String str2) {
        if(str1.length()!=str2.length()) {
            return false;
        }
        int len = str1.length();
        for(int i=0;i<len;i++) {
            if(str1.charAt(i)!=str2.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();
        Tutorial5_2 obj = new Tutorial5_2();
        if(obj.rotationallyEq(str1,str2)) {
            System.out.print("Rotationally Equivalent");
        }
        else {
            System.out.print("NOT Rotationally Equivalent");
        }
    }
}
