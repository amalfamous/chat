package org.example.chat.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller// hna kangeriw les messages o les utilisateurs
public class ChatController {

    @MessageMapping("/chat.sendMessage")//les msgs litsifto lhad destination ratraitaw b la methode sendMessage
    @SendTo("/topic/public")//had l methode sendMessage mni kaywskha l msg katsifto lkolhom les abonnes dyal /topic/public donc kolhom l users
    public ChatMessage sendMessage(
            @Payload ChatMessage chatMessage//cad l'obj chatMessage m extri mn le corps du message recu
    ) {
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(
            @Payload ChatMessage chatMessage,// L'objet chatMessage est extrait du corps du message reçu.
            SimpMessageHeaderAccessor headerAccessor
    ) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
}
/*
    @MessageMapping=>configure les methodes bax n geriw les msgs envoyes
    aux destinations...

 */
