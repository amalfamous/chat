````markdown
# Chat Application – Spring Boot & WebSockets

Application de messagerie en temps réel utilisant **Spring Boot**, **STOMP**, **SockJS**, et une interface web statique.

## 📦 Technologies
- Spring Boot  
- WebSocket / STOMP  
- SockJS  
- HTML / CSS / JavaScript  

## ⚙️ Configuration
`application.properties`
```properties
spring.application.name=chat
server.port=8081
````

## 📁 Structure du projet

```
src/
 ├── main/java/org/example/chat/
 │    ├── ChatApplication.java
 │    ├── chat/
 │    │     ├── ChatController.java
 │    │     ├── ChatMessage.java
 │    │     ├── MessageType.java
 │    └── config/
 │          ├── WebSocketConfig.java
 │          ├── WebSocketEventListener.java
 └── resources/
      ├── application.properties
      └── static/
            ├── index.html
            ├── js/main.js
            └── css/main.css
```

## 🔌 WebSocket

* Endpoint : `/ws`
* Application prefix : `/app`
* Broker prefix : `/topic`
* Destinations utilisées :

  * Envoi d’un message : `/app/chat.sendMessage`
  * Ajout d’un utilisateur : `/app/chat.addUser`
  * Diffusion publique : `/topic/public`

## ▶️ Lancement

```bash
mvn spring-boot:run
```

Accès à l’interface :
**[http://localhost:8081](http://localhost:8081)**

