package model;

import lombok.Value;

@Value
public class Todo {

    private final String title;
    private boolean completed = false;

    public Todo(){
        title = "";
    }
}
