//1. reverse a number
/* 
class Day2{
    public static void main(String[] args) {
        int num = 897;
        int rev=0;
        while(num!=0){
rev = rev*10+num%10;
        num=num/10;
    }
        System.out.println(rev);
    }
  
}

*/
// Swap number in multiple ways
/* */
class Day2{
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        System.out.println("Before swaping"+"a value : "+a+" b value : "+b);
        /* 
        // logic-1 using temp variable
        using temparary variable 
        int t=a;  // t=a here a=10 if t=a 10=t now value of t is equal to value of t
        a=b;   // a = b  here b = 99 now a is updated to to now assume a is empty and value b is  in a
        b=t;  // t = value of a and b value is in a now t 
        */ 
        /* logic-2 not using 3rd variable 
        a=a+b;  
        b=a-b;
        a=a-b;
*/

/*logic-3 using (*) and (/)  */
    // a=a*b;       // a = 10*99=990
    // b=a/b;       // b=99/990=10
    // a=a/b;       // a = 990/10=99
    /*a = a * b;

This sets a = 10 * 99 = 990 (which is correct so far).
b = a / b;

This sets b = 990 / 99 = 10. (Now both a and b have the same value 10, which is incorrect.)
a = a / b;

This sets a = 990 / 10 = 99, which brings a back to 99. */


a = a ^ b;
b = a ^ b;
a = a ^ b;

        System.out.println("after swaping"+"a value : "+a+" b value : "+b);
        
    }
}

