import java.util.*;

public class javabasic {
    // public static int factoril(int n){
    // int fac=1;
    // for (int i = 1; i <=n ; i++) {
    // fac=fac*i;

    // }
    // return fac;
    // }
    // public static int binomial(int n , int r){
    // int n_factoril=factoril(n);
    // int rp_factoril=factoril(r);
    // int nr_factoril=factoril(n-r);
    // int a=n_factoril/ (rp_factoril * nr_factoril);
    // return a;
    // }

    public static boolean isprime(int n) {

        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;

                }
                break;
            }
            return true;
        }
    }
public static void rangeprims(int n){
    for(int i=2 ; i<=n ; i++){
        if(isprime(i )){
System.out.print(i + " ");
        }
    }

}
public static void binTodic(int n){
    int mynum=n;
   int power=0;
   int decimal=0;
   while (mynum>0) {
    int lastdisgt=mynum%10;
    decimal=decimal+(lastdisgt*(int)Math.pow(2, power));
    power++;
   mynum= mynum/10;
    
   }
   System.out.println("Decimal number is "+n+" = "+ decimal);

}

public static void dectobin(int n){
    int num =n;
    int power=0;
    int bin=0;
    while (n>0) {
        int rem=n%2;
        bin=bin+(rem*(int)Math.pow(10,power));
        power++;
        n=n/2;
        
    }
System.out.println("BinRY number is "+num+" = "+ bin);
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // binTodic(10010101);
        dectobin(7);
        // int n=sc.nextInt();
        // int r=sc.nextInt();
        // System.out.println(binomial(5, 2));
        // System.out.println(factoril(3));
        // String input =sc.next();
        // String input=sc.nextLine();
        // boolean bn=sc.nextBoolean();
        // if (bn == true) {
        // System.out.println("You are over 18");
        // } else if (bn == false) {
        // System.out.println("You are under 18");
        // }

        // float a = 67.004;
        // int b=(int) a;
        // System.out.println(b);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter A=");
        // int a=sc.nextInt();
        // System.out.println("Enter B=");
        // int b=sc.nextInt();
        // System.out.println("Enter C=");
        // int c=sc.nextInt();
        // int output=(a+b+c)/3;
        // System.out.println(output);
        // int $ = 23;
        // System.out.println($);
        // int a=2,b=5;
        // int exp= (a * (b/a));
        // System.out.println(exp);
        // int year=sc.nextInt();
        // boolean x=year/4==0;
        // boolean y=year/100 !=0;

        // if(year/4 ==0|| year/100==0 || year /400==0){
        // System.out.println("Leap year");
        // }else{
        // System.out.println("not leap year");
        // }
        // int n=sc.nextInt();
        // while (n>0) {
        // int lastdisgt=n%10;
        // System.out.print(lastdisgt);
        // n /=10;

        // }

        // System.out.println("Enter a number:");
        // int n=sc.nextInt();
        // boolean primes=true;
        // if(n==2){
        // System.out.println("Given number "+ n + " is not prime");
        // }else{
        // for(int i=2; i<=Math.sqrt(n) ; i++){

        // if(n%i==0){
        // primes=false;
        // }
        // }
        // if(primes==true){
        // System.out.println("Given number "+ n + " is prime");
        // }else{
        // System.out.println("Given number "+ n + " is not prime");
        // }
        // }

        //

        // int fac=1;
        // int n=3;
        // for(int i=1;i<=n;i++){
        // fac=fac*i;
        // }
        // System.out.println(fac);

        // if (isprime(14)) {
        //     System.out.println("ture");
        // } else {
        //     System.out.println("false");
        // }

        // rangeprims(2000000000);

    }
}