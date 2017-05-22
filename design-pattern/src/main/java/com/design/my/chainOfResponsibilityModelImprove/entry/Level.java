package com.design.my.chainOfResponsibilityModelImprove.entry;

/**
 * Created by kuo.sun on 2017/3/28.
 */
public class Level {
    private Integer integer;

    public Level(Integer integer) {
        this.integer = integer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Level level = (Level) o;

        return integer.equals(level.integer);
    }

    @Override
    public int hashCode() {
        return integer.hashCode();
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
