package com.shan.askforleave.pojo;

public class LeaveStatus {
    private int id;
    private int lfid;
    private int uid;

    private int isShort;
    private int isFirst;
    private int isSecond;
    private int status;
    private String reason;


    @Override
    public String toString() {
        return "LeaveStatus{" +
                "id=" + id +
                ", lfid=" + lfid +
                ", uid=" + uid +
                ", isShort=" + isShort +
                ", isFirst=" + isFirst +
                ", isSecond=" + isSecond +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLfid() {
        return lfid;
    }

    public void setLfid(int lfid) {
        this.lfid = lfid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getIsShort() {
        return isShort;
    }

    public void setIsShort(int isShort) {
        this.isShort = isShort;
    }

    public int getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(int isFirst) {
        this.isFirst = isFirst;
    }

    public int getIsSecond() {
        return isSecond;
    }

    public void setIsSecond(int isSecond) {
        this.isSecond = isSecond;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
