package com.projet.Detectify;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Définir le point de terminaison pour les WebSockets
        registry.addEndpoint("/ws").withSockJS(); // Utilisation de SockJS pour la compatibilité
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Configurer le courtier de messages
        config.enableSimpleBroker("/topic"); // Canal de diffusion pour les messages
        config.setApplicationDestinationPrefixes("/app"); // Préfixe pour les destinations des applications
    }
}
