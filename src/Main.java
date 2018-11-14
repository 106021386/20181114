import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scn = new Scanner(System.in);
                String a = scn.next();
                int b=0,c=0;
                for(int i =0;i<a.length();i++){
                    b=(int) a.charAt(i)-(int)'0';
                    c+=b;
                }
                System.out.println(c);


            }
        }

