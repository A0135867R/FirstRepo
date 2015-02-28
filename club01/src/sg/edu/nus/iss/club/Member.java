package sg.edu.nus.iss.club;

public class Member extends Person {

	private int memberNumber;
	
	public Member(String surname, String firstName, String secondName, int memberNumber){
		super(surname, firstName, secondName);
		this.memberNumber = memberNumber;
	}
	
	public int getMemberNumber(){
		return this.memberNumber;
	}
	
	@Override
	public void show(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString(){
		return super.toString() + " " + this.memberNumber;
	}
}
