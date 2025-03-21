package org.example.chat.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor//kan generiw wahd le constructeur avec parametres pour kola champ de la classe
@NoArgsConstructor//kan generiw wahd le constructeur sans parametres
@Builder//Génère un constructeur de type "builder" pour la classe. Le pattern builder permet de créer des instances de la classe de manière flexible et lisible.
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

}