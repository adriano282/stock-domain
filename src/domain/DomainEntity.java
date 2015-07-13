package domain;

import java.util.Calendar;

public class DomainEntity implements IEntity{
	
	
	private Integer id;
	private Calendar dtCreated;
	
	public Calendar getDtCreated() {
		return dtCreated;
	}
	
	public String getMonth_name() {
		
		return dtCreated.get(Calendar.MONTH)  + "/" + dtCreated.get(Calendar.YEAR); 
	}
	
	public String getStringDate() {
		
		if (dtCreated == null)
			return "";
		
		Integer dayOfMonth = dtCreated.get(Calendar.DAY_OF_MONTH);
		Integer month = dtCreated.get(Calendar.MONTH);
		Integer year = dtCreated.get(Calendar.YEAR);	
		
		
		return (dayOfMonth < 10? "0" + dayOfMonth.toString():dayOfMonth)
				+ "/" + (month < 10? "0" + month.toString():month)
				+ "/" +year; 
	}
	
	public void setDtCreated(Calendar dtCreated) { 
		this.dtCreated = dtCreated;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	

}
 