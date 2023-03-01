package childGame;
import java.util.*;

		class Questions
		{
			public void questions()
			{
				Scanner obj = new Scanner(System.in);
				int count=0;
				int wcount=0;
				int select;
				int i=0;
				System.out.println("Please answer the following questions.");
				System.out.println();
				
				System.out.println("1. Which animal is known as the 'Ship of the Desert'?");
				System.out.println();
				System.out.println("1.  Dog");
				System.out.println("2.  Horse");
				System.out.println("3.  Camel");
				System.out.println("4.  Elephant");
				System.out.println();
				System.out.println("Select the Number :- ");
			 
			 for(i=0;i<=4;i++)
			 {
				select = obj.nextInt();
				if(select < 5)
				{
				if(select == 3)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
				}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				
			 }
			 
				
				System.out.println();
				
						System.out.println("2.  How many hours are there in a day?");
				System.out.println();
				System.out.println("1.  48");
				System.out.println("2.  72");
				System.out.println("3.  12");
				System.out.println("4.  24");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
					if(select < 5)
					{
				if(select == 4)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
			}
			
				System.out.println();
				
						System.out.println("3. Rainbow consist of how many colours?");
				System.out.println();
				System.out.println("1.  3 colours");
				System.out.println("2.  6 colours");
				System.out.println("3.  7 colours");
				System.out.println("4.  10 colours");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 3)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
		}
				System.out.println();
				
						System.out.println("4. How many seconds make one hour?");
				System.out.println();
				System.out.println("1.  3600 seconds");
				System.out.println("2.  2400 seconds");
				System.out.println("3.  7200 seconds");
				System.out.println("4.  1200 seconds");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 1)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("5. Name the National bird of India?");
				System.out.println();
				System.out.println("1.  Hen");
				System.out.println("2.  Cock");
				System.out.println("3.  Duck");
				System.out.println("4.  Peacock");
				System.out.println();
				System.out.println("Select the Number :- ");
				
				 for(i=0;i<=4;i++)
			 {
				select = obj.nextInt();
				if(select <5)
				{
				if(select == 4)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("6. What is the capital of India?");
				System.out.println();
				System.out.println("1.  Patna");
				System.out.println("2.  Kolkata");
				System.out.println("3.  Mumbai");
				System.out.println("4.  New Delhi");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 4)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("7. Which is the smallest month of the year?");
				System.out.println();
				System.out.println("1.  June");
				System.out.println("2.  July");
				System.out.println("3.  February");
				System.out.println("4.  August");
				System.out.println();
				System.out.println("Select the Number :- ");
			
				 for(i=0;i<=4;i++)
			 {
						select = obj.nextInt();
						if(select<5)
						{
				if(select == 3)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("8. Which colour symbolises peace?");
				System.out.println();
				System.out.println("1.  Red");
				System.out.println("2.  Green");
				System.out.println("3.  Yellow");
				System.out.println("4.  White");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 4)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("9. Name the place known as the Roof of the World?");
				System.out.println();
				System.out.println("1.  Tibet");
				System.out.println("2.  India");
				System.out.println("3.  Saudi");
				System.out.println("4.  America");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 1)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				
				System.out.println();
				
						System.out.println("10.  Which festival is called the festival of colours?");
				System.out.println();
				System.out.println("1.  Dashahra");
				System.out.println("2.  Muharram");
				System.out.println("3.  Eid");
				System.out.println("4.  Holi");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 4)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				
				System.out.println();
				
				System.out.println("11. What type of gas is absorbed by plants?");
				System.out.println();
				System.out.println("1.  Oxygen");
				System.out.println("2.  Carbon mono oxide");
				System.out.println("3.  Carbon di oxide");
				System.out.println("4.  carbon");
				System.out.println();
				System.out.println("Select the Number :- ");
			 
			 for(i=0;i<=4;i++)
			 {
				select = obj.nextInt();
				if(select < 5)
				{
				if(select == 3)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
				}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				
			 }
			 
				
				System.out.println();
				
						System.out.println("12.  Name the longest river on the Earth?");
				System.out.println();
				System.out.println("1.  Nile");
				System.out.println("2.  Ganga");
				System.out.println("3.  Yamuna");
				System.out.println("4.  Amazon");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
					if(select < 5)
					{
				if(select == 1)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
			}
			
				System.out.println();
				
						System.out.println("13. Which is the principal source of energy for the Earth?");
				System.out.println();
				System.out.println("1.  Moon");
				System.out.println("2.  Sun");
				System.out.println("3.  Jupiter");
				System.out.println("4.  Mercury");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 2)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
		}
				System.out.println();
				
						System.out.println("14. Name the planet nearest to the Earth?");
				System.out.println();
				System.out.println("1.  Sun");
				System.out.println("2.  Mercury");
				System.out.println("3.  Neptune");
				System.out.println("4.  Moon");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 2)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("15.  Name a bird that lays the largest eggs?");
				System.out.println();
				System.out.println("1.  Hen");
				System.out.println("2.  Ostrich");
				System.out.println("3.  Swan");
				System.out.println("4.  Peacock");
				System.out.println();
				System.out.println("Select the Number :- ");
				
				 for(i=0;i<=4;i++)
			 {
				select = obj.nextInt();
				if(select <5)
				{
				if(select == 2)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("16. Name the planet known as the Red Planet?");
				System.out.println();
				System.out.println("1.  Mars");
				System.out.println("2.  Jupiter");
				System.out.println("3.  Sun");
				System.out.println("4.  Mercury");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 1)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("17. Name the country known as the Land of the Rising Sun?");
				System.out.println();
				System.out.println("1.  China");
				System.out.println("2.  America");
				System.out.println("3.  Afganishtan");
				System.out.println("4.  Japan");
				System.out.println();
				System.out.println("Select the Number :- ");
			
				 for(i=0;i<=4;i++)
			 {
						select = obj.nextInt();
						if(select<5)
						{
				if(select == 4)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("18. Name the hardest substance available on Earth?");
				System.out.println();
				System.out.println("1.  Iron");
				System.out.println("2.  Stone");
				System.out.println("3.  Diamond");
				System.out.println("4.  Gold");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 3)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				System.out.println();
				
						System.out.println("19. The speed of light will be minimum while passing through?");
				System.out.println();
				System.out.println("1.  Vaccum");
				System.out.println("2.  Water");
				System.out.println("3.  Air");
				System.out.println("4.  Glass");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 4)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				
				System.out.println();
				
						System.out.println("20.  Rain drops acquire spherical shape due to?");
				System.out.println();
				System.out.println("1.  Surface Tension");
				System.out.println("2.  Viscosity");
				System.out.println("3.  Friction");
				System.out.println("4.  Elasticity");
				System.out.println();
				System.out.println("Select the Number :- ");
			
			 for(i=0;i<=4;i++)
			 {
					select = obj.nextInt();
						if(select < 5)
						{
				if(select == 1)
				{
					System.out.println("Right answer");
					count = count + 1;
					break;
				}
				else
				{
					System.out.println("Wrong answer");
					wcount = wcount - 1;
					break;
				}
					}
			
				else
				{
					System.out.println("Please select in the Options");
				}
				}
				
				System.out.println();
				
				System.out.println("Correct answer  =  "+count);
				System.out.println("Wrong answer  =  "+(wcount));
			}
		}
				


		public class ChildGame { 
			public static void main(String[] args) {
				Questions q= new Questions();
				q.questions();

	}

}
