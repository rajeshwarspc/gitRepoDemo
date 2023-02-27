package gitRepoDemo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTable {
    @Test
	public void testTable1() {
		// TODO Auto-generated method stub
		
		int num = 4;
		System.out.println("Printing Table of "+num+": ");
		for(int i = 1; i<=10; i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
		Assert.assertNotEquals("TestTable", "TestTable1");

	}

}
