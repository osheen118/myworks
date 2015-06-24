import java.util.Scanner; 
public class Calc
{

public static void main(String args[])
{ boolean start = true;
Scanner scan1 = new Scanner(System.in);
while(start)
{
	
	System.out.println("Hi , Welcome to Calculator");
	
	System.out.println("Select any of these");
	System.out.println("Addition - 1\nSubraction - 2\nMultiplication - 3\nDivision -4\nExponential - 5\nFactorial - 6\nSquareroot -7" );

	
	 Scanner scan = new Scanner(System.in);   
	//Start scanner
	
	 String choice= scan.nextLine();
	 System.out.println("Enter 1st value:");
	 float a1= scan.nextFloat();
	 float a2=0;
	 if(!"6".equals(choice) && !"7".equals(choice))
	  {
		 System.out.println("Enter the 2nd value");
		 a2= scan.nextFloat(); 
	  }
	 
	 
 
	
	  if("1".equals(choice))
      {
    
       float sum = a1 +a2;
       System.out.println(a1+  "+"  +a2+  "=" +sum);
       }
      
      if("2".equals(choice))
         {
           float sub = a1 - a2;
            System.out.println(a1+  "-" +a2+  "=" +sub);
         }
	     
      
    	  if("3".equals(choice))
    	  {
    	  
    		  float mult = a1 * a2 ;
    	  System.out.println(a1+ "*" +a2+ "=" +mult);
    		}
    	  if("4".equals(choice))
    	  {
    		  float div = a1 / a2 ;
    	  
    	  System.out.println(a1+ "/" +a2+ "=" +div );
    	  }
    	  
    	  if("5".equals(choice))
    	  {
    		  double pow = Math.pow(a1, a2);
    	  
    	  System.out.println(a1+ "^" +a2+ "=" +pow );
    	  }
    	  
    	  
    	
    	 
    	  if("6".equals(choice))
    	  {
    	  
    		  int result=1;
    		
    		  for (int i = 1; i <= a1; i++) 
    		  {
    		  result = result * i;
    		  
    		}System.out.println("factorial is" +  result );  

    	  
    	  
    	  }
    	  
    	  
    	  
    	  if("7".equals(choice))
    	  {
    		  double pow = Math.sqrt(a1);
    	  
    	  System.out.println(pow);
    	  }
    	  System.out.println("Continue? (yes,no)");
    	  String repeat = scan1.nextLine();

    	  if("no".equals(repeat))
    	  {
    	      start = false;
    	      System.out.println("Bye, Come Again!!");
    	  }    
    	    scan1.close();
    	  scan.close();
    	  }

    
}
       
}       
      
	
	
	

	