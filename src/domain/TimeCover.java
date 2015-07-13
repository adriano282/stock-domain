package domain;

public class TimeCover extends DomainEntity{
	
	private Integer daysToOrder;
	private Integer daysToDelivery;
	private Integer daysToConference;
	private Integer daysMarginSecurity;
	private Integer totalDays;
	
	public Integer getDaysToOrder() {
		return daysToOrder;
	}
	public void setDaysToOrder(int daysToOrder) {
		this.daysToOrder = daysToOrder;
	}
	public Integer getDaysToDelivery() {
		return daysToDelivery;
	}
	public void setDaysToDelivery(int daysToDelivery) {
		this.daysToDelivery = daysToDelivery;
	}
	public Integer getDaysToConference() {
		return daysToConference;
	}
	public void setDaysToConference(int daysToConference) {
		this.daysToConference = daysToConference;
	}
	public Integer getDaysMarginSecurity() {
		return daysMarginSecurity;
	}
	public void setDaysMarginSecurity(int daysMarginSecurity) {
		this.daysMarginSecurity = daysMarginSecurity;
	}
	public Integer getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
}
