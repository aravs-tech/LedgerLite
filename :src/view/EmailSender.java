package view;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
   public static void sendEmail(String recipientaddress, int newpassword) {
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", "smtp.gmail.com");
      props.put("mail.smtp.port", "587");
      Session session = Session.getInstance(props, new Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("25aravs@gmail.com", "wvea eyuo djfz uxzr");
         }
      });

      try {
         Message customeremail = new MimeMessage(session);
         customeremail.setFrom(new InternetAddress("25aravs@gmail.com"));
         customeremail.setRecipients(RecipientType.TO, InternetAddress.parse(recipientaddress));
         customeremail.setSubject("Account Suspended - Please find your new password here:");
         String randomgen = String.valueOf(newpassword);
         customeremail.setText("Your account has been suspended due to too many incorrect attempts. We have temporarily created a new password for you. Your new password is - ".concat(randomgen));
         Transport.send(customeremail);
         System.out.println("Congratualtions, your email has been sent!");
      } catch (MessagingException var6) {
         var6.printStackTrace();
      }

   }
}
