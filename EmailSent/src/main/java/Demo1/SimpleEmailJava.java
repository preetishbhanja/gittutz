package Demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SimpleEmailJava {

	public static void main(String[] args) throws EmailException {
		System.out.println("++++Test Started++++");
		sendEmail();
        System.out.println("#####Email Sent Successfully#####");
	}

	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		//email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("gem.rubu@gmail.com", "srikrushn@67"));
		email.setSSLOnConnect(true);
		//email.setStartTLSEnabled(true);
		//email.setFrom("preetish.bhanja@gmail.com");
		email.setFrom("gem.rubu@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		//email.addTo("preetish1990.bhanja@gmail.com");
		email.addTo("nikhil.singh8694@gmail.com");
		email.send();
	}

}
