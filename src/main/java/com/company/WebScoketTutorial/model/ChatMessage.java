package com.company.WebScoketTutorial.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChatMessage {
    private MessgeType type;

    public String content;

    public String sender;

    public String time;
}
