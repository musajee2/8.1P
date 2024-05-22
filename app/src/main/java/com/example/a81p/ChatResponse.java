package com.example.a81p;

import com.google.gson.annotations.SerializedName;

public class ChatResponse {
    @SerializedName("message")
    private String message;

    public ChatResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
