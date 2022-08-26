package com.example.restapi.controller;


import com.example.restapi.model.Message;
import com.example.restapi.service.MessageService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MessageController {

    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping("/all-messages")
    public String getAllMessages() {
        Iterable<Message> messages = messageService.getAllMessages();

        // builder er slet ikke nødvendigt, men kun for at huske at den findes
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        String jsonToBeSent = gson.toJson(messages);

        return jsonToBeSent;
    }

    @RequestMapping("/get-message/{id}")
    public String getMessageById(@PathVariable("id") Long id) {
        Optional optional = messageService.getMessageById(id);

        String result = "No message with that ID found";

        if (optional.isPresent()) {
            Message message = (Message) optional.get();
            Gson json = new Gson();

            result = json.toJson(message);
        }
        return result;
    }
}

