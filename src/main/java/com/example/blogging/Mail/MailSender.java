package com.example.blogging.Mail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Component
public class MailSender {

    @Autowired
    private JavaMailSender mailSender;

   public void sendTo(String emailTo, String subject,String message){

       SimpleMailMessage mailMessage=new SimpleMailMessage();
       String me="mankasssbots@gmail.com";
       mailMessage.setFrom(me);
       mailMessage.setTo(emailTo);
       mailMessage.setSubject(subject);
       mailMessage.setText(message);



   }

}
