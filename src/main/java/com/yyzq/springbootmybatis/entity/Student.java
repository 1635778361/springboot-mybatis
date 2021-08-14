package com.yyzq.springbootmybatis.entity;

public class Student {
    private int id;
    private String name;
    private String say;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", say='" + say + '\'' +
                '}';
    }
}
