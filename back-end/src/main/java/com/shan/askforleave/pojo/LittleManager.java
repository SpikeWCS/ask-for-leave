package com.shan.askforleave.pojo;

public class LittleManager {
    private int id;
    private int uid;


    @Override
    public String toString() {
        return "LittleManager{" +
                "id=" + id +
                ", uid=" + uid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
