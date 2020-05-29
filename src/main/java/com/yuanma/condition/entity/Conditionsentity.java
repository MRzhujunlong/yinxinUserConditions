package com.yuanma.condition.entity;

public class Conditionsentity {
    private Integer Cid;
    private String  Address;
    private String  Times;
    private String  Chanpin;
    private String  Conditions;
    private String  Way;
    private String  Operator;
    private String  Followpeople;


    @Override
    public String toString() {
        return "Conditionsentity{" +
                "Cid=" + Cid +
                ", Address='" + Address + '\'' +
                ", Times='" + Times + '\'' +
                ", Chanpin='" + Chanpin + '\'' +
                ", Conditions='" + Conditions + '\'' +
                ", Way='" + Way + '\'' +
                ", Operator='" + Operator + '\'' +
                ", Followpeople='" + Followpeople + '\'' +
                '}';
    }

    public Integer getCid() {
        return Cid;
    }

    public void setCid(Integer cid) {
        Cid = cid;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTimes() {
        return Times;
    }

    public void setTimes(String times) {
        Times = times;
    }

    public String getChanpin() {
        return Chanpin;
    }

    public void setChanpin(String chanpin) {
        Chanpin = chanpin;
    }

    public String getConditions() {
        return Conditions;
    }

    public void setConditions(String conditions) {
        Conditions = conditions;
    }

    public String getWay() {
        return Way;
    }

    public void setWay(String way) {
        Way = way;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public String getFollowpeople() {
        return Followpeople;
    }

    public void setFollowpeople(String followpeople) {
        Followpeople = followpeople;
    }
}
