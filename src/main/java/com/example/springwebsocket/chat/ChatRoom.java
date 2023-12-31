package com.example.springwebsocket.chat;

import lombok.Getter;
/**
 * pub/sub 방식을 이용하면 구독자 관리가 알아서 되므로 웹소켓 세션 관리 필요 x
 * 발송의 구현도 알아서 해결
 */

import java.util.UUID;

@Getter
public class ChatRoom {
    private String roomId;
    private String name;

    public static ChatRoom create(String name){
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }
}
