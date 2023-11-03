import java.util.Scanner;

public class PasswordTester {
    Scanner input = new Scanner(System.in);

    private String password;

    public void setPassword(String password) {
        System.out.println("Lets test your password: ");
        this.password=input.nextLine();

    }

    public String getPassword() {
        return password;
    }
    
    public String checkLength() {
        int length = password.length() + 1;
        if (length >= 12) {
            return "The password is strong";

        } else {
            return "The password is weak";
        }
    }

    public String checkUpperCase() {

        int numUc = 0;

        for (int i = 0 ; i != password.length() ; i++) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c)) {
                numUc += 1;

            } else {
                numUc = numUc + 0;
            }
            
        }
        if (numUc >= 2) {
                return "The password is strong";

            } else {
                return "The password is weak"; 
            }
    }

    public String checkLowerCase() {
        int numLc = 0;
        for (int i = 0 ; i != password.length() ; i++) {
            char c = password.charAt(i);
            if(Character.isLowerCase(c)) {
                numLc += 1;

            } else {
                numLc = numLc + 0;
            }
            
        }
        if (numLc >= 2) {
                return "The password is strong";

            } else {
                return "The password is weak"; 
            }

    }

    public String checkNumbers() {
        int numNum = 0;
        for (int i = 0 ; i != password.length() ; i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)) {
                numNum += 1;

            } else {
                numNum = numNum + 0;
            }
            
        }
        if (numNum >= 2) {
                return "The password is strong";

            } else {
                return "The password is weak"; 
            }
        
    }

    //public String checkSymbols() {

   // }
}
