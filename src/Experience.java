import java.util.Date;

public class Experience {
	
	private String startDate;
	private String endDate;
	private String position;
	private String company;
	private String duty;
	
	
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	@Override
	public String toString() {
		return "Experience [startDate=" + startDate + ", endDate=" + endDate + ", position=" + position + ", company="
				+ company + ", duty=" + duty + "]";
	}
	
	

}
