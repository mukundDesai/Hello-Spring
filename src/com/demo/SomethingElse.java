package com.demo;

import org.springframework.stereotype.Component;

@Component
public class SomethingElse implements Say {

    @Override
    public void message() {
        System.out.println("Hey, I'm SomethingElse!");
    }
}
