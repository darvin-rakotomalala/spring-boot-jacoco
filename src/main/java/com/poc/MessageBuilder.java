package com.poc;

public class MessageBuilder {
    public String getMessage(String name) {
        StringBuilder result = new StringBuilder();
        if (name == null || name.trim().length() == 0) {
            result.append("Please provide a name!");
        } else {
            result.append("Hello ").append(name);
        }
        return result.toString();
    }

}
