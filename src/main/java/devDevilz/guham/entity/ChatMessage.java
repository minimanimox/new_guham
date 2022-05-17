package devDevilz.guham.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    public enum MessageType {
        ENTER, TALK
    }

    private MessageType type;
    @Id
    //채팅방 ID
    private String roomId;
    //보내는 사람
    private String sender;
    //내용
    private String message;
}