import java.util.*;

public class Grade
{
    int n,i;
    char grade;
    double avg;
    int sub[]=new int[10];
    int tot=0;
    Scanner sc=new Scanner(System.in);
    void mark()
    {
        System.out.println("Enter the no.of subjects:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter the mark for subject"+" "+i+":");
            sub[i]=sc.nextInt();
            tot=tot+sub[i];
        }
        
        avg=tot/n;
        if(avg>=91 && avg<=100)
            {
                grade='A';
            }
            else if(avg>=81 && avg<=90) 
            {               
                grade='B';
            }
            else if(avg>=71 && avg<=80)
            {
                grade='C';
            }   
            else if(avg>=61 && avg<=70)
            {
                grade='D';
            }
            else if(avg>=50 && avg<=60)
            {
                grade='E';
            } 
            else
            {
                grade='F';
            }
            System.out.println("The total marks of student:"+tot);
            System.out.println("The average percenrage  of student:"+avg+"%");
            System.out.println("The grade is:"+grade);
            
   }
}

class Grade_cal {
    public static void main(String args[])
    {
        Grade m=new Grade();
        System.out.println("---------------The student grade calculator:---------------");
        m.mark();
        
    }
    
}
