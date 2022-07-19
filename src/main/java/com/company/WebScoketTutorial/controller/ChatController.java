package com.company.WebScoketTutorial.controller;

import com.company.WebScoketTutorial.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import java.util.Objects;

@Controller
public class ChatController {
    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public ChatMessage chatMessage(@Payload final ChatMessage chatMessage){
        return chatMessage;
    }

    @MessageMapping("/chat.newUser")
    @SendTo("/topic/public")
    public ChatMessage newUser(@Payload final ChatMessage chatMessage,
                               SimpMessageHeaderAccessor simpMessageHeaderAccessor){
        Objects.requireNonNull(simpMessageHeaderAccessor.getSessionAttributes()).put("username",chatMessage.getSender());
        return chatMessage;
    }
}
