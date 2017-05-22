package com.design.my.chainOfResponsibilityModelImprove.entry;

public class Request<T> {
    private Level level;
    private T date;

    public Request(Level level, T date) {
        this.level = level;
        this.date = date;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
