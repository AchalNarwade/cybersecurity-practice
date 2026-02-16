import java.util.Scanner;

public class Salting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take password from user
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Salt (fixed for demo)
        String salt = "ABC";

        // Add salt to password
        String saltedPassword = password + salt;

        // Fake hash
        int hash = saltedPassword.hashCode();

        System.out.println("Salt: " + salt);
        System.out.println("Stored Hash: " + hash);

        // -------- Login --------
        System.out.print("Re-enter Password for Login: ");
        String loginPassword = sc.nextLine();

        int loginHash = (loginPassword + salt).hashCode();

        if (loginHash == hash) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}
