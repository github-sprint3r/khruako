 package com.email;
 
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
	
	public boolean sendEmail(String email, String queueNo, String tableNo)
	{
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
 
		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("khruako@gmail.com","1bc29b36f623ba82aaf6724fd3b16718");
				}
			});
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("khruako@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
			message.setSubject("คุณลูกค้าคิวที่ "+ queueNo +" โต๊ะของคุณพร้อมแล้ว");
			String body = 
				"<p>เรียน คุณลูกค้าคิวที่ {queue_no}.</p><br/>" +
				"<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;โต๊ะของคุณหมายเลข {table_no}</p><br/><br/>" +
				"{email}";
			body = body.replace("{queue_no}", queueNo)
					.replace("{table_no}", tableNo)
					.replace("{email}", "khruako@gmail.com");
			message.setContent(body,"text/html; charset=utf-8");
 
			Transport.send(message);

			return true;
 
		} catch (MessagingException e) {
			return false;
			//throw new RuntimeException(e);
		}
	}
}
