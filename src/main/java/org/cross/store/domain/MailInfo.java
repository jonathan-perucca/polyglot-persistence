package org.cross.store.domain;

public class MailInfo {

	private String adresse;
	private Integer counter;
	
	public MailInfo(String adresse, Integer counter) {
		super();
		this.adresse = adresse;
		this.counter = counter;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Integer getCounter() {
		return counter;
	}
	public void setCounter(Integer counter) {
		this.counter = counter;
	}
}
