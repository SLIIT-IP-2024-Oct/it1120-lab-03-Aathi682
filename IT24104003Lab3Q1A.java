import java.util.Scanner;

public class It24104003Lab3Q1A{
    public static void main(String[] args)
   {
Scanner sc= new Scanner(System.in);

System.out.print("Enter the price of 1kg of rice: ");
double riceperkg= sc.nextDouble();

System.out.print("Enter the number of kilogram:");
double kg= sc.nextDouble();

 double finalprice = riceperkg*kg;
    
     
     System.out.println("finalprice; "+finalprice);
sc.close();
     
    }
}