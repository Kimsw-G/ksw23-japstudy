package com.example.myjpa;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

public class MyTableCustomRepositoryImpl implements MyTableCustomRepository{
    @Autowired
    EntityManager entityManager;
    
    @Override
    public List<String> findCustomAllMyValue() {
        String sql = "SELECT myvalue FROM mytable";
        return entityManager.createQuery(sql,String.class).getResultList();
    }

    @Override
    public void saveCuston(MyTableEntity myTableEntity) {
        
    }

    @Override
    public List<MyTableEntity> findCustomAll() {
        // String sql = "SELECT m FROM mytable as m";
        String sql = "SELECT mytable FROM mytable";
        return entityManager.createQuery(sql,MyTableEntity.class).getResultList();
    }

    
}
