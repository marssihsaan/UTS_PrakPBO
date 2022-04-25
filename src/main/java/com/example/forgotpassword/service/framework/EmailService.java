package com.example.forgotpassword.service.framework;

import com.example.forgotpassword.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
