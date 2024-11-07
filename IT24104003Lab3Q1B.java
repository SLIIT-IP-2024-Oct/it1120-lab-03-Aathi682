public class IT24104003Lab3Q1B{
    public static void main (String[]args)
    {

    double totalAmount,discount,finalamount,riceperkg,kg;

        riceperkg=225;
        kg=5.0;
    
    totalAmount = riceperkg*kg;

    discount = totalAmount*0.10;

    finalamount = totalAmount - discount;
    
    System.out.println(finalamount);



    }
}
