import java.util.Random;
import java.util.Scanner;

class Game 
{
    Scanner sc = new Scanner(System.in);
    Random r=new Random();
    int n, guess, i, score, k = 5, s1, s2;

    void Rules() 
	{
        	System.out.println("Rules for the game:");
        	System.out.println("Guess the number within 5 trials");
        	System.out.println("HINT:The game will tell you whether the target number is higher or lower than your guess");
		System.out.println("The number is between the range of 0-100");
        	System.out.println("----------------------------------------------");
	}

    void Play() 
	{
		Rules();
		score=0;
		s1=0;
		s2=0;
		guess = r.nextInt(100);
		
		for (i = 1; i <=k; i++) 
		{
           		 System.out.println("enter the number:");
           		 n = sc.nextInt();
            		
			if (guess == n)
			{
                		System.out.println("wow!!!,your guess is correct,such a brilliant guess");
           
               		 	break;
           		 } 
			else if (n < guess) 
			{
                		
				System.out.println("the number is higher than " + n);
                		System.out.println("----------you have " + (k - i) + " trails only-----------");
                		s1 += 1;
            		} 
			else if (n > guess) 
			{
                	

				System.out.println("the number is lower than " + n);
                		System.out.println("-----------you have " + (k - i) + " trails only-------------");
                		s2 += 1;
            		}
       		 }
      
            
       			 score = s1+ s2;
        		switch (score) 
			{
            			case 0:
               				System.out.println("Score: 100");
                				break;
            			case 1:
                			System.out.println("Score: 90");
                				break;
            			case 2:
               				System.out.println("Score: 80");
                				break;
            			case 3:
                			System.out.println("Score: 70");
                				break;
            			case 4:
                			System.out.println("Score: 60");
                				break;
            			case 5:
					if(guess!=n)
					{
						System.out.println("your chance is over you lost the game");
           		 			System.out.println("----------------------");
						System.out.println("score :0");
						System.out.println("guessed number is:"+guess);
        				}
					else
					{
						System.out.println("score:50");
					}
                				break;
       			 }
    	}
	void playagain()
	{
		String again;
		System.out.println("want to play again? (yes/no)");
        	again = sc.next();
        	if (again.equals("yes"))
 		{
            		System.out.println(".........................");
            		Play();
			playagain();
        	} 
		else 
		{
           		System.out.println("*******end of the game*******");
        	}

	}
}


public class Random_game 
{
    public static void main(String[] args)
 	{
       		Game g = new Game();
		g.Play();
		g.playagain();
        
    }
}


