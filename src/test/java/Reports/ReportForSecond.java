package Reports;

import org.testng.Assert;
import org.testng.annotations.*;


public class ReportForSecond {
	@Test
	public void testMethod1() {
		Assert.assertTrue(true);
		System.out.println("Test method is returning false");
	}
}
