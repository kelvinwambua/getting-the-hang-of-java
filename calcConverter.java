import java.util.Scanner;

public class main{
    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);                 
        System.out.print("Enter the temperature- ");
        int temp = sc.nextInt();
        
        
        Scanner u = new Scanner(System.in);                 
        System.out.print("Press (1) to convert to celsius or (2) to Farenheit- ");
        int t= u.nextInt();
        
        if(t==2){
            System.out.println(temp*9/5+32);

        } else if(t==1){
            System.out.println((temp-32)*5/9);
        }else {
            System.out.println("Error...., Please enter a valid input");
        }


    }
}