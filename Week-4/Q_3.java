//Write a java code to print the following pattern

public class Q_3 {
    public static void main(String[] args) {
        int n = 5; //Number of rows
        
        //Upper Half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
