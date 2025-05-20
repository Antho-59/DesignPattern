package org.example.exo;

import org.example.creational.builder.Person;

public class House {

    private int stage;
    private boolean pool;
    private String roofType;
    private String color;

    public House(Builder builder){
        stage = builder.stage;
        pool = builder.pool;
        roofType = builder.roofType;
        color = builder.color;
    }

    public static class Builder {
        private int stage;
        private boolean pool;
        private String roofType;
        private String color;
    }

    public Builder (int stage) {
        this.stage = stage;
        return this;
    }

    public Builder(boolean pool){
        this.pool = pool;
        return this;
    }

    public Builder(String roofType){
        this.roofType=roofType;
        return this;
    }

    public Builder(String color){
        this.color=color;
        return this;
    }

    public House build(){
        return new House(this);
    }

    @Override
    public String toString() {
        return "House{" +
                "stage=" + stage +
                ", pool=" + pool +
                ", roofType='" + roofType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
