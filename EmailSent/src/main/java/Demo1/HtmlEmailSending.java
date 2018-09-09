package Demo1;



import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class HtmlEmailSending {

	public static void main(String[] args) throws EmailException, MalformedURLException {
		HtmlEmail email = new HtmlEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("preetish.bhanja@gmail.com", "+++++"));
		  email.setSSLOnConnect(true);
		  email.addTo("preetish1990.bhanja@gmail.com", "preetish kumar bhanjadeo");
		  email.setFrom("preetish.bhanja@gmail.com", "Preetish Bhanja");
		  email.setSubject("Test email with inline image");
		  
		  // embed the image and get the content id
		  URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
		  String cid = email.embed(url, "Apache logo");
		  
		  // set the html message
		  email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");

		  // set the alternative message
		  email.setTextMsg("Your email client does not support HTML messages");

		  // send the email
		  email.send();

	}

}
