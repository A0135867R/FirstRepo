package sg.edu.nus.iss.club;

import java.util.Date;

public class Booking {
	private Facility facility;
	private Member member;
	private Date startDate;
	private Date endDate;
	
	public Booking(Member member, Facility facitlity, Date startDate, Date endDate){
		this.member = member;
		this.facility = facility;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Facility getFacility(){
		return this.facility;
	}
	
	public Member getMember(){
		return this.member;
	}
	
	public Date getStartDate(){
		return this.startDate;
	}
	
	public Date getEndDate(){
		return this.endDate;
	}
	
	public boolean overlaps(Booking booking){
		booking.
		return true;
	}
	

}
