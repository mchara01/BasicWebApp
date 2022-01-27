package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
    
    @Test
    public void knowsAboutHello() throws Exception {
        assertThat(queryProcessor.process("Hello"),
                containsString("bye"));
    }
    
    public void knowsYourName() throws Exception {
        assertThat(queryProcessor.process("your name"),
                containsString("mc01"));
    }
    
    public void knowsLargestNum() throws Exception {
        assertThat(queryProcessor.process("numbers is the largest"),
                containsString("20556"));
    }
    
    public void knowsPlus() throws Exception {
        assertThat(queryProcessor.process("plus"),
                containsString("+"));
    }
    
}
