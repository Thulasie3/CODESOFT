import java.util.*;
public class Atm_machine
{
    long pin_code,Acc_no;
    int select;
    double Bamt;
    String check;
    Scanner sc=new Scanner(System.in);
    
    void user_info()
    {
        System.out.println("Enter the Account no:");
        Acc_no=sc.nextLong();
        System.out.println("Enter the 4 digit pin number:");
        pin_code=sc.nextLong();
        System.out.println("enter the balance amount:");
        Bamt=sc.nextDouble();
      
    }
}
class user_Baccount extends Atm_machine
{
    void selection()
    {
    System.out.println("select any one:\n 1.Withdrawl\n 2.Deposit \n 3.Balance \n 4.Exit");
    select=sc.nextInt();
    
    switch(select)
    {
        case 1:
            Withdrawl();
            break;
        case 2:
            Deposit();
            break;
        case 3:
            Balance();
            break;
        case 4:
            System.out.println("The transaction is failed");
            break;

    }
    }
    void Withdrawl()
     {
        System.out.println("Enter the Withdrawl amount:");
        double Wamt=sc.nextLong();
        if((Bamt>=Wamt )&& (Wamt>0 && Bamt>0))
        {
        Bamt-=Wamt;
        System.out.println("please withdraw the amount:"+Wamt);
        System.out.println("do you want to check your balance? (yes/no):");
        check=sc.next();
        if(check.equals("yes"))
        {
            Balance();
        }
        else 
        {
            System.out.println("The transaction has completed successfully....\nThank you!!!");
        }
        }
        else
        {
            System.out.println("you don't have sufficient amount to withdraw.......");
            System.out.println("-------------------------------------------------------");
        }
        
     }
     
     void Deposit()
     {
        System.out.println("Enter the amount to be deposited: ");
        double Damt=sc.nextDouble();
        Bamt+=Damt;
        System.out.println("the amount has successfully deopsited");
        System.out.println("do you want to check your balance? (yes/no):");
        check=sc.next();
        if(check.equals("yes"))
        {
            Balance();
        }
        else 
        {
            System.out.println("The transaction has completed successfully....\nThank you!!!");       
        }
     }
     
     void Balance()
     {
         System.out.println("The balance amount is:"+Bamt);
         System.out.println("The transaction has completed successfully....\nThank you!!!");     
     }
     
   
     
}
class Atm 
{
    public static void main(String args[])
    {
        user_Baccount obj=new user_Baccount();
        System.out.println("Automated teller machine");
        System.out.println("-------------------------------------");
        obj.user_info();
        obj.selection();
        
    }
}