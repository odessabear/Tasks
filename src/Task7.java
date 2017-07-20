import java.util.Scanner;

/**
 * Created by alexander.mikhailov on 23.11.2016.
 */
public class Task7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input x : ");
        int x = in.nextInt();
        System.out.println("Input n : ");
        int n = in.nextInt();
        int s = 1;
        for(int i = 1;i <= n;i++){
            s = s * x;
        }
        System.out.printf(" x: %d to the power of n: %d is %d ",x,n,s);
    }
}
