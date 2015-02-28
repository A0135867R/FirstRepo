package sg.edu.nus.iss.club;

public class Facility {
private String name;
private String description;

public Facility(String name){
	this.name = name;
}

public Facility(String name, String description){
	this(name);
	this.description = description==null?"":description;
}

public String getName(){
	return this.name;
}

public String getDescription(){
	return this.description;
}

public void show(){
	System.out.println(this.toString());
}

public String toString(){
	return this.name + " " + this.description;
}
}
