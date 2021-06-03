import java.util.Scanner;
public class student {
    public static void main(String[]args){
        Scanner conv = new Scanner(System.in);                 
        System.out.println("Hello welcome to the impreial/metric calculator");
        System.out.println("Press 1 for miles/kilometers");
        System.out.println("Press 2 for Celsius/Farenheit ");
        System.out.println("Press 3 for inches/centimeters  ");
        System.out.println("Press 4 for pounds/kilograms ");
        System.out.println("Press 5 for metres/yards-   " );
        int T = conv.nextInt();

        if(T==1){
            Scanner co = new Scanner(System.in);                 
            System.out.print("Enter the number- ");
            double r = co.nextDouble();

            Scanner con = new Scanner(System.in);                 
            System.out.print("Press 1 to convert to kilometers or 2 to convert to miles");
            double q = con.nextDouble();
            if(q==1){
                System.out.println(r*1.60934);
            } else if(q==2){
                System.out.println(r/1.60934);
            }

            
        }else if(T==2){
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
}



