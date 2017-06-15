package com.example.thinh.bai3;

/**
 * Created by THINH on 6/15/2017.
 */

public class BaiHatkaraOk {
    String ma;
    String name;
    String tg;

    public BaiHatkaraOk(String ma, String name, String tg) {
        this.ma = ma;
        this.name = name;
        this.tg = tg;
    }

    public BaiHatkaraOk() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    @Override
    public String toString() {
        return this.getMa() + " - " + this.getName() + " - " + this.getTg();
    }
}
