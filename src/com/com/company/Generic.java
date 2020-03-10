package com.company;

public class Generic<T1,T2> {
    private T1 key;
    private T2 value;

    public Generic(T1 key, T2 value) {
        this.key = key;
        this.value = value;
    }

    public <T> void print(){
        System.out.println("key:" + key + "\nvalue:" + value);
    }
}
