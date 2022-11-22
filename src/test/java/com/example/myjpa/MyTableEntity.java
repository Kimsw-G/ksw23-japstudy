package com.example.myjpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity(name = "mytable")
@Getter
@Setter
@Table(name="mytable")
public class MyTableEntity {
    @Id
    private int mypk;
    
    private String myvalue;

    @Override
    public String toString(){
        return this.mypk+" "+this.myvalue;
    }
}
