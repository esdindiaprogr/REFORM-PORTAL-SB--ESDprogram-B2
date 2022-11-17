package com.example.accessingdatajpa.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.accessingdatajpa.AccessingDataJpaApplication;
import com.example.accessingdatajpa.model.User;


/**
 * 
 * @author Kailash Chandra Dimri
 *
 */
@Service
public class MailService {
}