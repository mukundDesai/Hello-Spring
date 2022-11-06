package com.demo;

//import org.springframework.stereotype.Component;

//@Component
public class CustomMessage {
    private String msg;

    public CustomMessage() {
    }

    public CustomMessage(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "CustomMessage{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
