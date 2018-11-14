import java.util.Scanner;

public class p2 {

        public static void main(String[] args){
            Scanner scn=new Scanner(System.in);
            String sen=scn.nextLine();
            int b=scn.nextInt();
            for(int i=0;i<sen.length();i++){

                System.out.print((char)((int)sen.charAt(i)+b));
            }
        }}

