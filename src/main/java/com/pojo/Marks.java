package com.pojo;

public class Marks {

    public Marks () {}
    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getGerman() {
        return german;
    }

    public void setGerman(int german) {
        this.german = german;
    }

    private int english;
    private int german;

    public Marks(int english, int german) {
        this.english = english;
        this.german = german;
    }
}
