package sg.edu.nus.iss.club;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuite1 {

	
	public static Test suite(){
		TestSuite suite = new TestSuite("Test All");
		//suite.addTestSuite(TestCase1.class);
		return suite;
	}
}
