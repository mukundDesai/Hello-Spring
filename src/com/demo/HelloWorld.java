package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements Say {

    @Autowired
    private CustomMessage customMessage;

    public CustomMessage getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(CustomMessage customMessage) {
        this.customMessage = customMessage;
    }

    @Override
    public void message() {
        System.out.println("Hey, I'm HelloWorld!" + customMessage);
    }
}
