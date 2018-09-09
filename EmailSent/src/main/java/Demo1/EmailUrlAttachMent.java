package Demo1;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailUrlAttachMent {
	public static void main (String[]args) throws MalformedURLException, EmailException{
	 EmailAttachment attachment = new EmailAttachment();
	  attachment.setURL(new URL("http://www.apache.org/images/asf_logo_wide.gif"));
	  attachment.setDisposition(EmailAttachment.ATTACHMENT);
	  attachment.setDescription("Apache logo");
	  attachment.setName("Apache logo");

	  // Create the email message
	  MultiPartEmail email = new MultiPartEmail();
	  email.setHostName("smtp.gmail.com");
	  email.setSmtpPort(465);
	  email.setAuthenticator(new DefaultAuthenticator("preetish.bhanja@gmail.com", "password"));
	  email.setSSLOnConnect(true);
	  email.addTo("preetish1990.bhanja@gmail.com", "preetish kumar bhanjadeo");
	  email.setFrom("preetish.bhanja@gmail.com", "Preetish Bhanja");
	  email.setSubject("The logo");
	  email.setMsg("Here is Apache's logo");
	  
	  // add the attachment
	  email.attach(attachment);

	  // send the email
	  email.send();
}
}