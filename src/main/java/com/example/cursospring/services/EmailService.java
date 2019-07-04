package com.example.cursospring.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.cursospring.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
