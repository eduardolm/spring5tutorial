package com.naturalprogrammer.spring5tutorial.controllers;

import com.naturalprogrammer.spring5tutorial.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    public MailController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    private MailSender mailSender;

    @RequestMapping("/mail")
    public String mail() {

        mailSender.send("mail@example.com", "A test e-mail", "Body of a test e-mail");

        return "E-mail sent";
    }

}
