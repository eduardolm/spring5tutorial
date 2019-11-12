package com.naturalprogrammer.spring5tutorial.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MailConfig {

    @Bean   // Pode-se utilizar o Bean aqui para substituir o uso do @Component utilizado no construtor da classe MockMailSender
    @Primary
    public MailSender mockMailSender() {
        return new MockMailSender();
    }

    @Bean
    public MailSender smtpMailSender() {
        return new SmtpMailSender();
    }
}
