package com.example.myjpa;

import java.util.List;


public interface MyTableCustomRepository {
    List<String> findCustomAllMyValue();
    List<MyTableEntity> findCustomAll();
    void saveCuston(MyTableEntity myTableEntity);
}
