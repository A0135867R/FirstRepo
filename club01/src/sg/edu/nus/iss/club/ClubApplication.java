package sg.edu.nus.iss.club;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClubApplication {

	public static void main(String[] ar){
		/*
		System.out.println("Testing Polymophism:");
		Person p1 = new Member("Mike", "Johnson", "Green", 324);
		Person p2 = new Person("Simpson", "Jackson", "Cook");
		p1.show();
		p2.show();
		
		//Test Club
		System.out.println("Testing Club:");
		Club club = new Club();
		club.addMember("Mike", "Johnson", "Green");
		club.addMember("Simpson", "Jackson", "Cook");
		club.addMember("Allen", "Mok", "");
		club.addMember("Susan", "Wong", "");
		club.showMembers();
		System.out.println(club.getMembers().length);
		
		club.removeMember(2);
		System.out.println("After deletion:");
		club.showMembers();
		System.out.println(club.getMembers().length);
		
		club.addMember("Zhu", "", "Bin");
		System.out.println("After add:");
		club.showMembers();
		System.out.println("Array size is " + club.getMembers().length);
		*/
		SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yyyy H:mm");
		System.out.println(sdf.format(new Date()));
	}
}
