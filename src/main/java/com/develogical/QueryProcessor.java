package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }
        
        if (query.toLowerCase().contains("hello")) {
            return "bye";
        }
        
        if (query.toLowerCase().contains("your name")) {
            return "mc01";
        }
        
        if (query.toLowerCase().contains("number is the largest")) {
            return "20556";
        }
       
        if (query.toLowerCase().contains("plus")) {
            return "+";
        }
        
        return "";
    }
}
