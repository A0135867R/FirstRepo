package sg.edu.nus.iss.club;

public class Person {
	
	private String surname;
	private String firstName;
	private String secondName;
	
	public Person(String surname, String firstName, String secondName){
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getSurname() {
		return surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void show(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString(){
		return this.surname + " " + this.firstName + " " + this.secondName;
	}

}
