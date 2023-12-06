import java.util.Scanner;

public class assignment5 {

//     Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your method.

public static boolean isEven(int n){
    if(n%2==0){
        return true;

    }else{
        return false;
    }
}


// Quesion 3 Palindrome

public static void Palindrome(int n){
    int num=n;
    int palin=0;
    while (n>0) {
        int lastdisgt = n%10;
        palin=(palin*10)+lastdisgt;
        n=n/10;
        
    }
    if(num==palin){
        System.out.println("plaindrome is "+ num + " = " + palin);
    } else{
        System.out.println("plaindrome is not number "+ num + " = " + palin);
    }
}

// Question 5 :
// Write a Java method to compute the sum of the digits in an integer.

public static void integer(int n){
    int sum=0;
    while (n>0) {
        int rem=n%10;
        sum = sum+rem;
        n=n/10;

        
    }
    System.out.println(sum);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println(isEven(n));
        // Palindrome(n);
        integer(n);
    }
}
