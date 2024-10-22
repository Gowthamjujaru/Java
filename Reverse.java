// public class Reverse {
//     public static void main(String[] args) {
//         int num = 0;
//         int originalnum = num;
//         int rev = 0;
//         if(num < 10 && num >= 0) {
//             System.out.println("Please enter a valid number with more than one digit.");
//         }
//         while(num!=0){
//             rev = rev*10+num%10;
//             num=num/10;
            
//         }
       
//         if(rev==originalnum){
//             System.out.println("yes it is palindrome!");
//         }
//         else{
//             System.out.println("NO!");
//         }
//         System.out.println("num : "+originalnum+" revnum : "+rev);

//     }
// }
public class Reverse {
    public static void main(String[] args) {
        int num = 12;  // You can change this number to test
        int originalNum = num;  // Store the original number
        int rev = 0;

        // Check if the number is a single digit
        if(num < 10 && num >= 0) {
            System.out.println("Please enter a valid number with more than one digit.");
        } else {
            while(num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            if(rev==originalNum){


            System.out.println("Original number: " + originalNum+" Reversed number: " + rev);
            System.out.println("Yes it is palindrome!");
        }
    else{
        System.out.println("Not a Palindrome!");
    }}
    }
}
