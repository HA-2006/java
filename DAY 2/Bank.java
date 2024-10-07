import java.util.Scanner;
class Bank{
	public static void main (String []args){
  		Scanner bankacount=new Scanner(System.in);
		float currentbalance=bankacount.nextFloat();
		float withdrawal=bankacount.nextFloat();
		if (currentbalance>=withdrawal)
                {
                     System.out.println(" withdrawal successfully");
                }
                else
                {
                      System.out.println("the message will error");
                }
                float newbalance=(currentbalance-withdrawal);
                System.out.println(newbalance);
        }
}



