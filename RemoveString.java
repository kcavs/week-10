import java.util.*;
public class RemoveString {
    public static void main (String[]args){
        String str;
        String sent;
        Scanner input=new Scanner(System.in);
        System.out.print("enter a sentance: ");
        sent=input.nextLine();
        System.out.print("enter a string: ");
        str=input.nextLine();
        System.out.print(sent.replace(str+ " ",""));
    }
}
