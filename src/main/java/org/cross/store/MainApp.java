package org.cross.store;

import java.util.ArrayList;
import java.util.List;

import org.cross.store.domain.Mail;
import org.cross.store.domain.MailInfo;
import org.cross.store.domain.User;
import org.cross.store.repo.UserRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main-context.xml");
		UserRepository userStore = ctx.getBean(UserRepository.class);
		
		userStore.deleteAll();
		
		User user = new User();
		user.setBalance(300L);
		
		List<MailInfo> mails = new ArrayList<MailInfo>();
		MailInfo mailInfo = new MailInfo("under@gmail.com", 30);
		MailInfo mailInfo2 = new MailInfo("test@hotmail.com", null);
		
		mails.add(mailInfo);
		mails.add(mailInfo2);
		
		Mail mail = new Mail(mails);
		
		user.setMail(mail);
		
		userStore.save(user);
	}
}
