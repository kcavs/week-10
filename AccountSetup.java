import java.util.*;
public class AccountSetup{
    public static void main (String[]args){
        String user;
        String pass;
        int length;
        Scanner input=new Scanner(System.in);
        System.out.print("enter a username: ");
        user=input.nextLine();
        System.out.print("enter a password that is at least 8 characters: ");
        pass=input.nextLine();
        length= pass.length();
        while(length<8){
            System.out.print("enter a password that is at least 8 characters: ");
            pass= input.nextLine();
            length=pass.length();
        }
        user= user.toLowerCase();
        pass=pass.toLowerCase();
        System.out.print("your username is "+user+" and you password is "+pass);


    }
}