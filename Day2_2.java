public class Day2_2 {
    public static void main(String[] args) {
        // Reverse a number
        reverseNumber(897);

        // Swap numbers in multiple ways
        swapNumbers();
    }

    // Method to reverse a number
    public static void reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("orginal number: "+num+" Reversed number: " + rev);
    }

    // Method to swap numbers using different methods
    public static void swapNumbers() {
        int a = 10;
        int b = 99;
        System.out.println("Before swapping: a value = " + a + ", b value = " + b);

        // Swap logic 1: Using a temporary variable
        int temp = a;  // Store value of 'a' in 'temp'
        a = b;         // Assign value of 'b' to 'a'
        b = temp;      // Assign value of 'temp' (old 'a') to 'b'
        System.out.println("After swapping with temp variable: a value = " + a + ", b value = " + b);

        // Reset values for next method
        a = 10;
        b = 99;

        // Swap logic 2: Without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without temp variable: a value = " + a + ", b value = " + b);

        // Reset values for next method
        a = 10;
        b = 99;

        // Swap logic 3: Using multiplication and division
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After swapping using multiplication and division: a value = " + a + ", b value = " + b);

        // Reset values for next method
        a = 10;
        b = 99;

        // Swap logic 4: Using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping using XOR: a value = " + a + ", b value = " + b);
    }

}
    

