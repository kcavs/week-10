import java.util.*;
public class Monogram {
    public static void main (String[]args){
        String in1;
        String in2;
        String in3;
        Scanner input=new Scanner(System.in);
        System.out.print("enter your first name: ");
        in1= input.next();
        System.out.print("enter your middle initial: ");
        in2= input.next();
        System.out.print("enter your last name: ");
        in3=input.next();
        String l1= in1.toLowerCase();
        l1=l1.substring(0,1);
        String l2= in2.toLowerCase();
        l2=l2.substring(0,1);
        String l3=in3.toUpperCase();
        l3=l3.substring(0,1);
        System.out.print("your monogram is: "+l1+l3+l2);
    }
}
