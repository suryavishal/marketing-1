package com.marketing.Utill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailServices {

	 @Autowired
	 private JavaMailSender javaMailSender;
	 
	@Override
	public void sentMail(String to, String sub, String body) {
	
	
	        // Try block to check for exceptions
	        try {
	 
	            // Creating a simple mail message
	       SimpleMailMessage mailMessage = new SimpleMailMessage();
	 
	            // Setting up necessary details
            mailMessage.setTo(to);
            mailMessage.setText(body);
            mailMessage.setSubject(sub);
	 
	            // Sending the mail
	         javaMailSender.send(mailMessage);
	            
	        }
	 
	        catch (Exception e) {
            e.printStackTrace();	        }
	    }

	}


