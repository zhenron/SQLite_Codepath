package com.example.juliancamilomunoz.sqlite_codepath;

/**
 * Created by Xingke on 30/06/2015.
 */
public class TodoItem {
    private int id;
    private String body;
    private int priority;

    public TodoItem(String body, int priority) {
        super();
        this.body = body;
        this.priority = priority;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
