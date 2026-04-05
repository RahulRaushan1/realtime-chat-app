package com.chat.app.model;

public class ChatMessage {
    private Long id;
    private String sender;
    private String content;

    // Getters
    public Long getId() { return id; }
    public String getSender() { return sender; }
    public String getContent() { return content; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setSender(String sender) { this.sender = sender; }
    public void setContent(String content) { this.content = content; }
}
