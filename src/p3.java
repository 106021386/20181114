import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scm = new Scanner(System.in);
    int a =scm.nextInt();
    if(a>=-128 && a<=127){
        String b =Integer.toBinaryString(a);
    if(a>=0){
        for(int i = 0;i<8-b.length();i++){
            System.out.print(0);
        }
     System.out.print(b);}
     else {
        System.out.println(b.substring(24));

    }

    }
    }
}
