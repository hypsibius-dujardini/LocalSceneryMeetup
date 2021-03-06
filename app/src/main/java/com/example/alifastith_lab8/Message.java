package com.example.alifastith_lab8;

import com.google.firebase.database.ServerValue;

public class Message {

    public String sender;
    public String receiver;
    public String message;
    public Object timestamp;

    public Message() { }

    public Message(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.timestamp = ServerValue.TIMESTAMP;
    }

    public Object getTimestamp() { return timestamp; }
}
