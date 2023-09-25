package com.github.prakasitnan.springsecuritythymeleaf.model;

public class Comment {
    private Integer id;
    private String text;

    public Comment() {
    }

    public Comment(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
