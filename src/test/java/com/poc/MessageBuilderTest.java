package com.poc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageBuilderTest {
    @Test
    public void testNameDarvin() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello Darvin", obj.getMessage("Darvin"));
    }

    @Test
    public void testNameEmpty() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));
    }

    @Test
    public void testNameNull() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));
    }
}
