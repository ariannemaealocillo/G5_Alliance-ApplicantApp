package group5.ApplicantApp.jumpstart.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "applicant_address")
public class ApplicantAddress {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long app_id;
	
	@Column(name = "city_address")
	private String city_address;
	
	@Column(name = "provincial_address")
	private String provincial_address;

	@ManyToOne
	@JoinColumn(name = "app_id", referencedColumnName = "app_id", insertable=false, updatable=false, nullable=false)
	private ApplicantModel applicant;
	
	public ApplicantAddress()
	{
		
	}
	

	public ApplicantAddress(String city_address, String provincial_address, ApplicantModel applicant) {
		
		this.city_address = city_address;
		this.provincial_address = provincial_address;
		this.applicant = applicant;
	}





	public long getId() {
		return app_id;
	}





	public void setId(long id) {
		this.app_id = id;
	}





	public String getCity_address() {
		return city_address;
	}





	public void setCity_address(String city_address) {
		this.city_address = city_address;
	}





	public String getProvincial_address() {
		return provincial_address;
	}





	public void setProvincial_address(String provincial_address) {
		this.provincial_address = provincial_address;
	}



	public ApplicantModel getApplicant() {
		return applicant;
	}




	public void setApplicant(ApplicantModel applicant) {
		this.applicant = applicant;
	}


	


	@Override
	public String toString()
	{
		return city_address + " " + provincial_address;
	}
}
