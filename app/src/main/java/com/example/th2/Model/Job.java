package com.example.th2.Model;

import java.util.Date;

public class Job {
    private int image;
    private int code;
    private String name;
    private String content;
    private String date;
    private String action;
    private String collab;

    public Job(int image, int code, String name, String content, String date, String action, String collab) {
        this.image = image;
        this.code = code;
        this.name = name;
        this.content = content;
        this.date = date;
        this.action = action;
        this.collab = collab;
    }
    public Job(int image, String name, String content, String date, String action, String collab) {
        this.image = image;
        this.name = name;
        this.content = content;
        this.date = date;
        this.action = action;
        this.collab = collab;
    }
    public Job(){
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCollab() {
        return collab;
    }

    public void setCollab(String collab) {
        this.collab = collab;
    }
}
