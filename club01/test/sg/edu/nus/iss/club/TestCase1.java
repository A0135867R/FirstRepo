package sg.edu.nus.iss.club;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase1{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
		System.out.println("test1");
	}
	
	public void test2(){
		System.out.println("test2");
	}
	
	@Test
	public void test3(){
		//fail();
		System.out.println("test3");
	}

}
