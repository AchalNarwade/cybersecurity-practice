import java.util.*;

public class CaesarCipher{ 


    public static String encrypt(String text, int key) {
    //ENCRYPTION METHOD
    String result = "";
    key = key % 26; //handle large key

    for(int i=0;i<text.length();i++){

        char ch = text.charAt(i);   //converting the text into array for encrypting each letter
        
    //FOR UPPER CASE LETTER
    
    if(ch>= 'A' && ch<='Z'){
        char encrypted = (char) (ch + key); // type casting

            if(encrypted > 'Z'){
                encrypted = (char) (encrypted-26);
            }
        result = result + encrypted; //Append the result of each letter in the text

    }


    //FOR LOWER CASE LETTER
    
    else if(ch>='a' && ch<='z'){
        char encrypted = (char) (ch+key); //type casting
    
        if(encrypted> 'z'){
            encrypted = (char)(encrypted -26);
        }
        result = result + encrypted;
        
    }
    
    //FOR OTHER CHARACTER
    else{
        result = result + ch ;
        }
        
    }
    return result;
    
}

    public static String decrypt(String text , int key){

        //DECRYPTION METHOD 
   
        String result = "";
    
         for(int i=0;i<text.length();i++){

        char ch = text.charAt(i);   //converting the text into array for encrypting each letter
        
    //FOR UPPER CASE LETTER
    
    if(ch>= 'A' && ch<='Z'){
        char decrypted = (char) (ch - key); // type casting

            if(decrypted < 'A'){
                decrypted = (char) (decrypted+26);
            }
        result = result + decrypted; //Append the result of each letter in the text

    }


    //FOR LOWER CASE LETTER
    
    else if(ch>='a' && ch<='z'){
        char decrypted = (char) (ch-key); //type casting
    
        if(decrypted < 'a'){
            decrypted = (char)(decrypted + 26);
        }
        result = result + decrypted;
        
    }
    
    //FOR OTHER CHARACTER
    else{
        result = result + ch ;
        }
        
    }
    return result;

}


     //MAIN METHOD
     public static void main(String[] args){
     
     Scanner sc = new Scanner(System.in);

    System.out.print("Enter the text to Encrypt: ");
    String text = sc.nextLine();
  
    System.out.print("Enter the key: ");
    int key = sc.nextInt();

    String Encrypted_Text = encrypt(text, key);
    System.out.println("Encrypted Text: " + Encrypted_Text );

    String Decrypted_Text = decrypt(Encrypted_Text,key);   //here not the original text but the encrypted text should be decrypted
    System.out.println("Decrypted Text: " + Decrypted_Text);

    sc.close();

    }
}