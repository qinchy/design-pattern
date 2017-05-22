package com.design.my.chainOfResponsibilityModel.entry;

public class Request {
    private Level level;
    private Data data;

    public Request(Level level, Data data) {
        this.level = level;
        this.data = data;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
