public class PasswordTesterTester {
    public static void main(String[] args) {
        PasswordTester pass1 = new PasswordTester();

        pass1.setPassword("");

        System.out.println(pass1.checkLength());
        System.out.println(pass1.checkUpperCase());
        System.out.println(pass1.checkLowerCase());
        System.out.println(pass1.checkNumbers());
        //System.out.println(pass1.checkSymbols());
    }
}
