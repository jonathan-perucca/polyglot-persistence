package org.cross.store.domain;

import java.util.List;

import org.bson.types.ObjectId;

public class Mail {

	private ObjectId id;
	private List<MailInfo> mails;
	
	public Mail(List<MailInfo> mails) {
		super();
		this.mails = mails;
	}
	
	public List<MailInfo> getMails() {
		return mails;
	}
	public void setMails(List<MailInfo> mails) {
		this.mails = mails;
	}
}
