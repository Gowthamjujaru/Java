// write a program to print 1 to 20 using while loop 
/* 
public class Day1 {
    public static void main(String[] args) {
        int number = 1;
        while(number<=20){
            System.out.println("number :"+number);
            number++;
        }

    }
    
}
*/


// write a program to print 20 to 1 using while loops
/* 
public class Day1{
    public static void main(String[] args) {
       int revnum = 20; 
       while(revnum>=1){
        System.out.println("the num : "+revnum);
        revnum--;
       }
    }
}
*/
//  Check if a Number is Even or Odd

/*
public class Day1{

public static void main(String[] args) {
    int checknum = 25;
    if(checknum%2==0){
        System.out.println("even number");
    }else{
        System.out.println("odd number");
    }
    }

    
}

*/


// Find the Maximum of two Numbers
//
 /*
public class Day1{


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        // int num3 = 2;

        if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
*/


// Find the Maximum of two Numbers
/* 
public class Day1{
public static void main(String[] args) {
    
    int num1 = 10;
    int num2 = 3;
    int num3 = 4;
    int high;
    if(num1>=num2 && num1 >= num3){
high = num1;
    }
    else if(num1<=num2 && num2<=num3 ){
        high = num2;
    }
    else{
        high = num3;
    }
System.out.println("maximum value : "+high);
}

}

*/

// Check if a Number is Prime
/* 
public class Day1{
    public static void main(String[] args) {
        int num = 29;
        boolean isprime = true;

        if(num<=1){
isprime=false;
        }else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(num+" : is prime number");
        }else{
            System.out.println(num+" : is not prime number");

        }
    }
}


*/
/*

Explanation:
Class Declaration:

java
Copy code
public class Main {
This line declares a public class named Main. In Java, all code must be inside a class.
Main Method Declaration:

java
Copy code
public static void main(String[] args) {
This line defines the main method, which is the entry point of any Java application. When you run the program, execution starts here.
Hard-Coded Number:

java
Copy code
int number = 29;  // Hard-coded number
Here, we declare an integer variable named number and assign it the value 29. This is the number we will check to see if it is prime.
Boolean Flag:

java
Copy code
boolean isPrime = true;
We declare a boolean variable named isPrime and initialize it to true. This flag will help us keep track of whether number is prime.
Check for Numbers Less Than or Equal to 1:

java
Copy code
if (number <= 1) {
    isPrime = false;
This if statement checks if the number is less than or equal to 1. If it is, we set isPrime to false because numbers less than or equal to 1 are not prime.
Loop to Check for Factors:

java
Copy code
} else {
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            isPrime = false;  // Found a factor, so it's not prime
            break;
        }
    }
If the number is greater than 1, we enter the else block.
We start a for loop with int i = 2, which means we will check divisibility starting from 2 up to number - 1 (in this case, 2 to 28).
Inside the loop, we check if number is divisible by i using the modulus operator (%):
number % i == 0 checks if there is no remainder when number is divided by i.
If the condition is true, we set isPrime to false and break the loop. This means we found a factor, so the number is not prime.
Output the Result:

java
Copy code
if (isPrime) {
    System.out.println(number + " is a prime number.");
} else {
    System.out.println(number + " is not a prime number.");
}
After the loop, we check the value of isPrime.
If isPrime is still true, we print that the number is prime.
If isPrime is false, we print that the number is not prime.
Summary of Logic:
Input: The hard-coded number 29.
Check:
If the number is less than or equal to 1, it’s not prime.
Otherwise, check for divisibility by all integers from 2 to 28.
Output: If the number has no divisors other than 1 and itself, it is classified as prime; otherwise, it is not.
Example Run:
For the number 29, the program will go through the loop and find that it has no divisors between 2 and 28, confirming it is a prime number.

Final Output:

csharp
Copy code
29 is a prime number.
This step-by-step explanation should help clarify how the code works to determine if a number is prime. If you have any more questions or need further clarification, feel free to ask!

*/ 
/* 

public class Day1{
    public static void main(String[] args) {
        int Odd =1;
        while(Odd<=20){
            if(Odd%2==1){
                System.out.println("odd :"+Odd);
            }Odd++;
        }

        int revOdd=20;
        while(revOdd>=1){
            if(revOdd%2==1){
                System.out.println("revOdd :"+revOdd);
            }revOdd--;
        }
    }
}
*/

// write 2 table

/* 
class Day1{
    public static void main(String[] args) {
        int tab=2;
        while(tab<=20){
            if(tab%2==0){
                System.out.println(tab);
            }tab++;
        }
    }
}

*/

// write sum of 3 numbers
/* 
class Day1{
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 3;
        int sum = a+b+c;
        System.out.println(sum);

    }
}
*/

// write simple intrest

class Day1{
    public static void main(String[] args) {
        int pri = 90876;
        int rate = 9;
        int time = 1;
int total = pri*rate*time/100;
System.out.println("simple intrest is :"+total);
    }
}