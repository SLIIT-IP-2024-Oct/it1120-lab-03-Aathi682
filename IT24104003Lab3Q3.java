public class IT24104003Lab3Q3{
public static void main (String arges[]) {

int amount,remain,num5000,num1000,num500,num100,num50,num20,num10,num5,num2,num1;

amount=2754;

num5000=amount/5000;
remain=amount%5000;

num1000=remain/1000;
remain=remain%1000;

num500=remain/500;
remain=remain%500;

num100=remain/100;
remain=remain%100;

num50=remain/50;
remain=remain%50;

num20=remain/20;
remain=remain%20;

num10=remain/10;
remain=remain%10;

num5=remain/5;
remain=remain%5;

num2=remain/2;
remain=remain%2;

num1=remain/1;

System.out.println("numberof5000is"+ num5000);
System.out.println("numberof1000is"+ num1000);
System.out.println("numberof500is"+ num500);
System.out.println("numberof100is"+ num100);
System.out.println("numberof50is"+  num50);
System.out.println("numberof20is"+ num20);
System.out.println("numberof10is"+ num10);
System.out.println("numberof5is"+  num5);
System.out.println("numberof2is"+ num2);
System.out.println("numberof1is"+ num1);
   }
}
