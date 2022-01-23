package com.example.blogging.Config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.port}")
    private int port;


    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.protocol}")
    private String protocol;

    @Value("${spring.mail.password}")
    private String password;

    @Value("${mail.smtp.debug}")
    private String debug;


    @Bean
    public JavaMailSender getJavaMailSender() {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();


        mailSender.setHost(host);
        mailSender.setPassword(password);
        mailSender.setUsername(username);
        mailSender.setPort(port);

        Properties properties = new Properties();

        properties.put("mail.transport.protocol", protocol);
        properties.put("mail.debug", debug);
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        mailSender.setJavaMailProperties(properties);

        return mailSender;
    }



}
