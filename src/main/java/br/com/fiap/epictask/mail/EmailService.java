package br.com.fiap.epictask.mail;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

//    @RabbitListener(queues = "email-queue")
//    public void sendEmail(String message){
//        SimpleMailMessage mail = new SimpleMailMessage();
//        mail.setTo("fiap@gmail.com");
//        mail.setSubject("Tarefa cadastrada");
//        mail.setText(message);
//    }

}
