package com.example.restapi.service;

import com.example.restapi.model.Message;
import com.example.restapi.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {

    private MessageRepository messageRepository;


    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    public Iterable<Message> getAllMessages() {
       return messageRepository.findAll();
    }
    public Optional<Message> getMessageById(Long id) {
        return messageRepository.findById(id);
    }
}
