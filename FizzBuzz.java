import java.util.*; 
public class FizzBuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                 
        System.out.print("Let us play Fizz Buzz, If a number is a multiple of 3 I will tell you Fizz, if it is of 5 I will tell you Buzz and if it is  multiple of Both, FizzBuzz, Enter a Number- "); 
        int i= sc.nextInt();  
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if(i%5==0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }

        }
}
