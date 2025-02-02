public class MixMatch {

    // Your main() method goes here
    public static void main(String[] args) {
        
        // Declare some variables
        String varString = "Hello, world!";
        char varChar = 'A';
        short varShort = 32000;
        int varInt = 12345;
        long varLong = 9876543210L;
        float varFloat = 3.14f;
        double varDouble = 3.14159;
        boolean varBoolean = true;

        System.out.println(varString + " <- String: stores sequences of characters");
        System.out.println(varChar + " <- Character: stores a single character");
        System.out.println(varShort + " <- Short: stores whole numbers from -32,768 to 32,767");
        System.out.println(varInt + " <- Integer: stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(varLong + " <- Long: stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(varFloat + " <- Float: stores fractional numbers with single precision (appr. 7 decimal places).");
        System.out.println(varDouble + " <- Double: stores fractional numbers with double precision (appr. 15 decimal places).");
        System.out.println(varBoolean + " <- Boolean: stores true or false values.");

        // Output multiple variables in a single print statement
        System.out.println("Mix of data types: " + varInt + " <- Integer, " + varDouble + " <- Double, " + varBoolean + " <- Boolean. ");
    }
}