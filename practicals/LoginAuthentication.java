import java.util.Scanner;

public class LoginAuthentication{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
 
    String userName = "Achal";
    String password = "@bcs120";

    System.out.print("Enter User_Name: ");
    String Entered_userName = sc.nextLine();
    System.out.print("Enter Password: ");
    String Entered_password = sc.nextLine();


    if(userName.equals(Entered_userName) && password.equals(Entered_password)){
        System.out.println("Successfully Logged In!");
    }else{
        System.out.println("Incorrect UserName or Password.\nTry Again!");
    }

    }
}