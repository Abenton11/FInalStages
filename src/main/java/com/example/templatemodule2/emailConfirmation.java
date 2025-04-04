package com.example.templatemodule2;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class emailConfirmation {

    // check https://mailtrap.io/inboxes/3575740/messages/4803883466
    // to find the email confrmation

    public static void sendConfirmationEmail(String toEmail) {
        String to = "yuxuanyong1663@gmail.com";
        String from = "yongyuxuan369@gmail.com";

        final String username = "8e0ad6c1064a40";
        final String password = "eb4821db509905";

        String host = "sandbox.smtp.mailtrap.io";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "2525");

        Session session = Session.getInstance(props,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Confirmation Email from Event Registration");
            message.setText("Registration Confirmed!");

            Transport.send(message);

            System.out.println("Email Sent Successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
