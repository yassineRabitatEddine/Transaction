package dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Transaction {
	@Id
	private int id;
	private String ref;
	private String cptDeb;
	private String cptCred;
	private double montant;
	private String type;
	private String date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getCptDeb() {
		return cptDeb;
	}
	public void setCptDeb(String cptDeb) {
		this.cptDeb = cptDeb;
	}
	public String getCptCred() {
		return cptCred;
	}
	public void setCptCred(String cptCred) {
		this.cptCred = cptCred;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	public Transaction(int id,String ref, String cptDeb, String cptCred, double montant) {
		super();
		this.id=id;
		this.ref = ref;
		this.cptDeb = cptDeb;
		this.cptCred = cptCred;
		this.montant = montant;
		String a=cptDeb.substring(0,3);
		String b=cptCred.substring(0,3);
		if(a.equals(b))this.type="VIRINT";
		else this.type="VIRCHAC";
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		this.date=sdf.format(date);
		
	}
	
	
	public Transaction() {
		super();
	}
	
}
