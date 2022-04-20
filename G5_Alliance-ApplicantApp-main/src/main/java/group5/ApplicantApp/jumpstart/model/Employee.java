package group5.ApplicantApp.jumpstart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long app_id;
	
	@Column(name = "app_dateApplied")
	private String adateApplied;
	
	@Column(name = "job_position")
	private String ajobPos;
	
	@Column(name = "app_firstName")
	private String afirstName;
	
	@Column(name = "app_lastName")
	private String alastName;
	
	@Column(name = "app_middleName")
	private String amidName;
	
	@Column(name = "app_birthdate")
	private String abdate;
	
	@Column(name = "app_religion")
	private String areligion;
	
	@Column(name = "app_sex")
	private String asex;
	
	@Column(name = "app_age")
	private String aage;
	
	@Column(name = "app_cityAdd")
	private String acityAdd;
	
	@Column(name = "app_provAdd")
	private String aprovAdd;
	
	@Column(name = "app_telNum")
	private String atelNum;
	
	@Column(name = "app_mobileNum")
	private String amobileNum;
	
	@Column(name = "app_emailAdd")
	private String aemailAdd;
	
	@Column(name = "app_philhealth")
	private String aphilNum;
	
	@Column(name = "app_sssNum")
	private String asssNum;
	
	@Column(name = "app_tinNum")
	private String atinNum;

	public long getApp_id() {
		return app_id;
	}

	public void setApp_id(long app_id) {
		this.app_id = app_id;
	}

	public String getAdateApplied() {
		return adateApplied;
	}

	public void setAdateApplied(String adateApplied) {
		this.adateApplied = adateApplied;
	}

	public String getAjobPos() {
		return ajobPos;
	}

	public void setAjobPos(String ajobPos) {
		this.ajobPos = ajobPos;
	}

	public String getAfirstName() {
		return afirstName;
	}

	public void setAfirstName(String afirstName) {
		this.afirstName = afirstName;
	}

	public String getAlastName() {
		return alastName;
	}

	public void setAlastName(String alastName) {
		this.alastName = alastName;
	}

	public String getAmidName() {
		return amidName;
	}

	public void setAmidName(String amidName) {
		this.amidName = amidName;
	}

	public String getAbdate() {
		return abdate;
	}

	public void setAbdate(String abdate) {
		this.abdate = abdate;
	}

	public String getAreligion() {
		return areligion;
	}

	public void setAreligion(String areligion) {
		this.areligion = areligion;
	}

	public String getAsex() {
		return asex;
	}

	public void setAsex(String asex) {
		this.asex = asex;
	}

	public String getAage() {
		return aage;
	}

	public void setAage(String aage) {
		this.aage = aage;
	}

	public String getAcityAdd() {
		return acityAdd;
	}

	public void setAcityAdd(String acityAdd) {
		this.acityAdd = acityAdd;
	}

	public String getAprovAdd() {
		return aprovAdd;
	}

	public void setAprovAdd(String aprovAdd) {
		this.aprovAdd = aprovAdd;
	}

	public String getAtelNum() {
		return atelNum;
	}

	public void setAtelNum(String atelNum) {
		this.atelNum = atelNum;
	}

	public String getAmobileNum() {
		return amobileNum;
	}

	public void setAmobileNum(String amobileNum) {
		this.amobileNum = amobileNum;
	}

	public String getAemailAdd() {
		return aemailAdd;
	}

	public void setAemailAdd(String aemailAdd) {
		this.aemailAdd = aemailAdd;
	}

	public String getAphilNum() {
		return aphilNum;
	}

	public void setAphilNum(String aphilNum) {
		this.aphilNum = aphilNum;
	}

	public String getAsssNum() {
		return asssNum;
	}

	public void setAsssNum(String asssNum) {
		this.asssNum = asssNum;
	}

	public String getAtinNum() {
		return atinNum;
	}

	public void setAtinNum(String atinNum) {
		this.atinNum = atinNum;
	}
	
	//contact persons table
	@Column(name = "contact_name")
	private String conName;
	
	@Column(name = "contact_num")
	private String conNum;
	
	@Column(name = "contact_relationship")
	private String conRelation;
	
	@Column(name = "contact_address")
	private String conAddress;

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
	
	//spouse table
	@Column(name = "spouse_name")
	private String spouseName;
	
	@Column(name = "spouse_occupation")
	private String spouseOccup;
	
	@Column(name = "spouse_company")
	private String spouseComp;
	
	@Column(name = "spouse_age")
	private String spouseAge;

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseOccup() {
		return spouseOccup;
	}

	public void setSpouseOccup(String spouseOccup) {
		this.spouseOccup = spouseOccup;
	}

	public String getSpouseComp() {
		return spouseComp;
	}

	public void setSpouseComp(String spouseComp) {
		this.spouseComp = spouseComp;
	}

	public String getSpouseAge() {
		return spouseAge;
	}

	public void setSpouseAge(String spouseAge) {
		this.spouseAge = spouseAge;
	}
	
	//dependents table
	@Column(name = "dependent_name1")
	private String depName1;
	
	@Column(name = "dependent_age1")
	private String depAge1;
	
	@Column(name = "dependent_relation1")
	private String depRelation1;
	
	@Column(name = "dependent_name2")
	private String depName2;
	
	@Column(name = "dependent_age2")
	private String depAge2;
	
	@Column(name = "dependent_relation2")
	private String depRelation2;
	
	@Column(name = "dependent_name3")
	private String depName3;
	
	@Column(name = "dependent_age3")
	private String depAge3;
	
	@Column(name = "dependent_relation3")
	private String depRelation3;

	public String getDepName1() {
		return depName1;
	}

	public void setDepName1(String depName1) {
		this.depName1 = depName1;
	}

	public String getDepAge1() {
		return depAge1;
	}

	public void setDepAge1(String depAge1) {
		this.depAge1 = depAge1;
	}

	public String getDepRelation1() {
		return depRelation1;
	}

	public void setDepRelation1(String depRelation1) {
		this.depRelation1 = depRelation1;
	}

	public String getDepName2() {
		return depName2;
	}

	public void setDepName2(String depName2) {
		this.depName2 = depName2;
	}

	public String getDepAge2() {
		return depAge2;
	}

	public void setDepAge2(String depAge2) {
		this.depAge2 = depAge2;
	}

	public String getDepRelation2() {
		return depRelation2;
	}

	public void setDepRelation2(String depRelation2) {
		this.depRelation2 = depRelation2;
	}

	public String getDepName3() {
		return depName3;
	}

	public void setDepName3(String depName3) {
		this.depName3 = depName3;
	}

	public String getDepAge3() {
		return depAge3;
	}

	public void setDepAge3(String depAge3) {
		this.depAge3 = depAge3;
	}

	public String getDepRelation3() {
		return depRelation3;
	}

	public void setDepRelation3(String depRelation3) {
		this.depRelation3 = depRelation3;
	}
	
	//fams table
	@Column(name = "fambg_fatherName")
	private String fbfatherName;
	
	@Column(name = "fambg_fatherOccup")
	private String fbfatherOccup;
	
	@Column(name = "fambg_fatherComp")
	private String fbfatherComp;
	
	@Column(name = "fambg_fatherAge")
	private String fbfatherAge;
	
	@Column(name = "fambg_motherName")
	private String fbmotherName;
	
	@Column(name = "fambg_motherOccup")
	private String fbmotherOccup;
	
	@Column(name = "fambg_motherComp")
	private String fbmotherComp;
	
	@Column(name = "fambg_motherAge")
	private String fbmotherAge;
	
	@Column(name = "fambg_numOfSiblings")
	private String fbNumSiblings;
	
	@Column(name = "fambg_birthOrder")
	private String fbBirthOrder;

	public String getFbfatherName() {
		return fbfatherName;
	}

	public void setFbfatherName(String fbfatherName) {
		this.fbfatherName = fbfatherName;
	}

	public String getFbfatherOccup() {
		return fbfatherOccup;
	}

	public void setFbfatherOccup(String fbfatherOccup) {
		this.fbfatherOccup = fbfatherOccup;
	}

	public String getFbfatherComp() {
		return fbfatherComp;
	}

	public void setFbfatherComp(String fbfatherComp) {
		this.fbfatherComp = fbfatherComp;
	}

	public String getFbfatherAge() {
		return fbfatherAge;
	}

	public void setFbfatherAge(String fbfatherAge) {
		this.fbfatherAge = fbfatherAge;
	}

	public String getFbmotherName() {
		return fbmotherName;
	}

	public void setFbmotherName(String fbmotherName) {
		this.fbmotherName = fbmotherName;
	}

	public String getFbmotherOccup() {
		return fbmotherOccup;
	}

	public void setFbmotherOccup(String fbmotherOccup) {
		this.fbmotherOccup = fbmotherOccup;
	}

	public String getFbmotherComp() {
		return fbmotherComp;
	}

	public void setFbmotherComp(String fbmotherComp) {
		this.fbmotherComp = fbmotherComp;
	}

	public String getFbmotherAge() {
		return fbmotherAge;
	}

	public void setFbmotherAge(String fbmotherAge) {
		this.fbmotherAge = fbmotherAge;
	}

	public String getFbNumSiblings() {
		return fbNumSiblings;
	}

	public void setFbNumSiblings(String fbNumSiblings) {
		this.fbNumSiblings = fbNumSiblings;
	}

	public String getFbBirthOrder() {
		return fbBirthOrder;
	}

	public void setFbBirthOrder(String fbBirthOrder) {
		this.fbBirthOrder = fbBirthOrder;
	}
	
	//educational table
	@Column(name = "educ_nameGS")
	private String educNameGS;
	
	@Column(name = "educ_yrsGS")
	private String educYrsGS;
	
	@Column(name = "educ_degreeGS")
	private String educDegreeGS;
	
	@Column(name = "educ_achievementGS")
	private String educAchievementGS;
	
	@Column(name = "educ_nameHS")
	private String educNameHS;
	
	@Column(name = "educ_yrsHS")
	private String educYrsHS;
	
	@Column(name = "educ_degreeHS")
	private String educDegreeHS;
	
	@Column(name = "educ_achievementHS")
	private String educAchievementHS;
	
	@Column(name = "educ_nameCS")
	private String educNameCS;
	
	@Column(name = "educ_yrsCS")
	private String educYrsCS;
	
	@Column(name = "educ_degreeCS")
	private String educDegreeCS;
	
	@Column(name = "educ_achievementCS")
	private String educAchievementCS;
	
	@Column(name = "educ_nameMS")
	private String educNameMS;
	
	@Column(name = "educ_yrsMS")
	private String educYrsMS;
	
	@Column(name = "educ_degreeMS")
	private String educDegreeMS;
	
	@Column(name = "educ_achievementMS")
	private String educAchievementMS;

	public String getEducNameGS() {
		return educNameGS;
	}

	public void setEducNameGS(String educNameGS) {
		this.educNameGS = educNameGS;
	}

	public String getEducYrsGS() {
		return educYrsGS;
	}

	public void setEducYrsGS(String educYrsGS) {
		this.educYrsGS = educYrsGS;
	}

	public String getEducDegreeGS() {
		return educDegreeGS;
	}

	public void setEducDegreeGS(String educDegreeGS) {
		this.educDegreeGS = educDegreeGS;
	}

	public String getEducAchievementGS() {
		return educAchievementGS;
	}

	public void setEducAchievementGS(String educAchievementGS) {
		this.educAchievementGS = educAchievementGS;
	}

	public String getEducNameHS() {
		return educNameHS;
	}

	public void setEducNameHS(String educNameHS) {
		this.educNameHS = educNameHS;
	}

	public String getEducYrsHS() {
		return educYrsHS;
	}

	public void setEducYrsHS(String educYrsHS) {
		this.educYrsHS = educYrsHS;
	}

	public String getEducDegreeHS() {
		return educDegreeHS;
	}

	public void setEducDegreeHS(String educDegreeHS) {
		this.educDegreeHS = educDegreeHS;
	}

	public String getEducAchievementHS() {
		return educAchievementHS;
	}

	public void setEducAchievementHS(String educAchievementHS) {
		this.educAchievementHS = educAchievementHS;
	}

	public String getEducNameCS() {
		return educNameCS;
	}

	public void setEducNameCS(String educNameCS) {
		this.educNameCS = educNameCS;
	}

	public String getEducYrsCS() {
		return educYrsCS;
	}

	public void setEducYrsCS(String educYrsCS) {
		this.educYrsCS = educYrsCS;
	}

	public String getEducDegreeCS() {
		return educDegreeCS;
	}

	public void setEducDegreeCS(String educDegreeCS) {
		this.educDegreeCS = educDegreeCS;
	}

	public String getEducAchievementCS() {
		return educAchievementCS;
	}

	public void setEducAchievementCS(String educAchievementCS) {
		this.educAchievementCS = educAchievementCS;
	}

	public String getEducNameMS() {
		return educNameMS;
	}

	public void setEducNameMS(String educNameMS) {
		this.educNameMS = educNameMS;
	}

	public String getEducYrsMS() {
		return educYrsMS;
	}

	public void setEducYrsMS(String educYrsMS) {
		this.educYrsMS = educYrsMS;
	}

	public String getEducDegreeMS() {
		return educDegreeMS;
	}

	public void setEducDegreeMS(String educDegreeMS) {
		this.educDegreeMS = educDegreeMS;
	}

	public String getEducAchievementMS() {
		return educAchievementMS;
	}

	public void setEducAchievementMS(String educAchievementMS) {
		this.educAchievementMS = educAchievementMS;
	}
	
	//thesis table
	@Column(name = "thesis_sub")
	private String thesisSubj;
	
	@Column(name = "thesis_title")
	private String thesisTitle;
	
	@Column(name = "thesis_progLang")
	private String thesisProgLang;
	
	@Column(name = "thesis_desc")
	private String thesisDesc;
	
	@Column(name = "thesis_role")
	private String thesisRole;
	
	@Column(name = "thesis_teachersName")
	private String thesisTName;
	
	@Column(name = "thesis_contactNum")
	private String thesisContactNum;
	
	@Column(name = "thesis_grade")
	private String thesisGrade;

	public String getThesisSubj() {
		return thesisSubj;
	}

	public void setThesisSubj(String thesisSubj) {
		this.thesisSubj = thesisSubj;
	}

	public String getThesisTitle() {
		return thesisTitle;
	}

	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}

	public String getThesisProgLang() {
		return thesisProgLang;
	}

	public void setThesisProgLang(String thesisProgLang) {
		this.thesisProgLang = thesisProgLang;
	}

	public String getThesisDesc() {
		return thesisDesc;
	}

	public void setThesisDesc(String thesisDesc) {
		this.thesisDesc = thesisDesc;
	}

	public String getThesisRole() {
		return thesisRole;
	}

	public void setThesisRole(String thesisRole) {
		this.thesisRole = thesisRole;
	}

	public String getThesisTName() {
		return thesisTName;
	}

	public void setThesisTName(String thesisTName) {
		this.thesisTName = thesisTName;
	}

	public String getThesisContactNum() {
		return thesisContactNum;
	}

	public void setThesisContactNum(String thesisContactNum) {
		this.thesisContactNum = thesisContactNum;
	}

	public String getThesisGrade() {
		return thesisGrade;
	}

	public void setThesisGrade(String thesisGrade) {
		this.thesisGrade = thesisGrade;
	}
	
	//Extracurricular table
	@Column(name = "extraAct_one")
	private String extraActOne;
	
	@Column(name = "extraAct_one_role")
	private String extraActOneRole;
	
	@Column(name = "extraAct_two")
	private String extraActTwo;
	
	@Column(name = "extraAct_two_role")
	private String extraActTwoRole;

	public String getExtraActOne() {
		return extraActOne;
	}

	public void setExtraActOne(String extraActOne) {
		this.extraActOne = extraActOne;
	}

	public String getExtraActOneRole() {
		return extraActOneRole;
	}

	public void setExtraActOneRole(String extraActOneRole) {
		this.extraActOneRole = extraActOneRole;
	}

	public String getExtraActTwo() {
		return extraActTwo;
	}

	public void setExtraActTwo(String extraActTwo) {
		this.extraActTwo = extraActTwo;
	}

	public String getExtraActTwoRole() {
		return extraActTwoRole;
	}

	public void setExtraActTwoRole(String extraActTwoRole) {
		this.extraActTwoRole = extraActTwoRole;
	}
	
}
