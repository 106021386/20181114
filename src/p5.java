import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
       int b=0;
        for(int i=1;i<=a;i++){
            if (i%3==0){
                b+=i;

            }
        }System.out.println(b);
    }
}
