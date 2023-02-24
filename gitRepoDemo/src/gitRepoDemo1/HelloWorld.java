package gitRepoDemo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {
    @Test
	public void hellowWorld1()
	{
		System.out.println("Printing Hello World");
		Assert.assertEquals("hellowWorld1test", "hellowWorld1test");

	}

}
