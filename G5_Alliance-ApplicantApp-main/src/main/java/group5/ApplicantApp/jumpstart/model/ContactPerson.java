package group5.ApplicantApp.jumpstart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactpersons")
public class ContactPerson {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long contact_id;
	
	@Column(name = "contact_name")
	private String conName;
	
	@Column(name = "contact_num")
	private String conNum;
	
	@Column(name = "contact_relationship")
	private String conRelation;
	
	@Column(name = "contact_address")
	private String conAddress;

	public long getContact_id() {
		return contact_id;
	}

	public void setContact_id(long contact_id) {
		this.contact_id = contact_id;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getConNum() {
		return conNum;
	}

	public void setConNum(String conNum) {
		this.conNum = conNum;
	}

	public String getConRelation() {
		return conRelation;
	}

	public void setConRelation(String conRelation) {
		this.conRelation = conRelation;
	}

	public String getConAddress() {
		return conAddress;
	}

	public void setConAddress(String conAddress) {
		this.conAddress = conAddress;
	}
	
}
