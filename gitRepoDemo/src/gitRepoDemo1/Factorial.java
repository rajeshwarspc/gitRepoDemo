package gitRepoDemo1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Factorial {
    
	@Test
	public void factorial1()
	{
		int num, fact = 1;
		num  = 5;
		
		for(int i = 2; i<=num; i++)
			fact = fact * i;
				
		System.out.println("Factorial of "+num+" is: "+fact);		
         
		Assert.assertTrue(true);
        
	}

}
