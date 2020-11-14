package com.Ajit.Modal;

public class Audit {
    private static long UUID = 0;
    protected final long id;

    public Audit() {
        this.id = ++UUID;
    }

    public long getId() {
        return id;
    }
}
