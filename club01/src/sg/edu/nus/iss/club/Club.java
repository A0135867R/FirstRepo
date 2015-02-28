package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Club {

	private static final int ARRAY_SIZE_INCREMENT = 3;
	private int numMembers;
	private int count;
	private ArrayList<Member> members;
	private HashMap<String, Facility> facilities;
	
	public Club(){
		numMembers = 0;
		count = 0;
		members = new ArrayList<Member>(2);
		facilities = new HashMap<String, Facility>();
	}
	
	public Member getMember(int memberNum){
		if (memberNum <=0 || memberNum > members.size()){
			return null;
		}
		return members.get(memberNum);
	}
	
	public Member[] getMembers(){
		return (Member[])members.toArray();
	}
	
	public Member addMember(String surname, String firstName, String secondName){
		numMembers++;
		
		Member newMember = new Member(surname, firstName, secondName, numMembers);
		members.add(newMember);
		return newMember;
		
	}
	
	public void removeMember(int memberNum){
		members.remove(memberNum);
	}
	
	public void showMembers(){
		Member[] resultMembers = this.getMembers();
		for (int i=0;i<resultMembers.length;i++){
			if (resultMembers[i] instanceof Member){
				resultMembers[i].show();
			}
		}
	}

	/*
	public void ensureArraySize(){
		if (members.length < numMembers){
			Member[] newMembers = new Member[members.length + Club.ARRAY_SIZE_INCREMENT];
			for (int i=0;i<members.length;i++){
				newMembers[i] = members[i];
			}
			members = newMembers;
		}
	}
	*/
	
	public Facility getFacility(String name){
		return facilities.get(name);
	}
	
	public Facility[] getFacilities() throws Exception{
		if (facilities.isEmpty()){
			throw new Exception("There are no facilities.");
		}
		Facility[] resultFacilities = new Facility[facilities.size()];
		Set<String> facilityNames = facilities.keySet();
		Iterator<String> it = facilityNames.iterator();
		int i = 0;
		while (it.hasNext()){
			Facility facility = facilities.get(it.next());
			resultFacilities[i++] = facility;
		}
		return resultFacilities;
	}
	
}
