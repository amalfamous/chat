package org.example.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker//automatise la configuration des composants nécessaires pour gérer les communications WebSocket en temps réel entre les clients et le serveur.
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
        //kan5dmo b sockJS bax ngeriw les communications websocket cote clt
    }
    /*
    utilise pour enreg un point de terminaison webSocket stomp
    => permet aux clts de se connecter au serveur websocket
    /ws =>le point de terminaison WebSocket.
    */

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
    }
    /* kanconfiguriw le broker de msg webSocket


    */
}