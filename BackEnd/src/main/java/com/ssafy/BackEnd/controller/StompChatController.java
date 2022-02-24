//package com.ssafy.BackEnd.controller;
//
//import com.ssafy.BackEnd.dto.ChatMessageDTO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@RequiredArgsConstructor
//public class StompChatController {
//
//    private final SimpMessagingTemplate template; // 특정 broker로 메세지 전달
//
//    // "/pub/chat/enter"
//    @MessageMapping(value = "/chat/enter")
//    public void enter(ChatMessageDTO message) {
//        message.setMessage(message.getWriter() + "님이 채팅방에 참여하였습니다.");
//        template.convertAndSend("/sub/chat/room/"+message.getRoomId(), message);
//    }
//
//    @MessageMapping(value = "/chat/message")
//    public void message(ChatMessageDTO message) {
//        template.convertAndSend("/sub/chat/room/" + message.getRoomId(), message);
//    }
//}
