package sg.edu.nus.iss.club;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestClub {

	@Test
	public void testGetMember(){
		Club club = new Club();
		Member member = club.getMember(0);
		assertNull(member);
		System.out.println("test");
		fail();
	}
}
