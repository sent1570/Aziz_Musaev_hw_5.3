package com.example.aziz_musaev_hw_53;

import java.io.Serializable;

public class ChatModel implements Serializable {
    int image;
    String title;
    String message;
    public ChatModel(int image,String title,String message){
        this.image = image;
        this.title = title;
        this.message = message;
    }
}
