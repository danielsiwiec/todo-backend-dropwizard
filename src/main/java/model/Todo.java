package model;

import lombok.Value;

@Value
public class Todo {

    private final String title;

    public Todo(){
        title = "";
    }
}
