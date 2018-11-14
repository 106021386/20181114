import java.util.Scanner;

public class p4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        boolean c =true;
        if(a==1){
            c =false;
       }
        for(int i=2;i<a;i++){
            if (a%i==0){
                c = false;
      break;
            }
        }
    if (c==false){
        System.out.println("no");
    }
    else {
        System.out.println("yes");
    }
    }


}
