package Demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailAttachments {

	public static void main(String[] args) throws EmailException {
		 EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("‪C:/Users/GUDU/Desktop/usa-west-road.jpg");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Picture of UntitledFile");
		  attachment.setName("Untitled");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("preetish.bhanja@gmail.com", "UUUUU"));
		  email.setSSLOnConnect(true);
		  email.addTo("preetish1990.bhanja@gmail.com", "preetish kumar bhanjadeo");
		  email.setFrom("preetish.bhanja@gmail.com", "Preetish Bhanja");
		  email.setSubject("The picture");
		  email.setMsg("Here is the picture you wanted");

		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();

	}

}
