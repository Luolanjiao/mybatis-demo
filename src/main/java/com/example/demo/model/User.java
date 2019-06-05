package com.example.demo.model;

import java.io.Serializable;

/**
 *
 * @author Luolanjiao
 * @date 2018/10/21
 */
public class User implements Serializable {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    private String name;
    private String addr;
}
