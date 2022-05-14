package devDevilz.guham.config;

import devDevilz.guham.handler.ChatWebSocketHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

//websockethandler이용가능하도록 설정
@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketConfigurer {

    private final static String CHAT_ENDPOINT = "/chat";

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
        /*
         * withSockJS()
         * 는 웹소켓을 지원하지 않는 브라우저에
         * 폴백 옵션을 활성화하는데 사용됩니다.
         * */
    }

    @Bean
    public ChatWebSocketHandler getChatWebSocketHandler(){
        return new ChatWebSocketHandler();
    }
}