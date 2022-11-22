package com.example.myjpa;

import org.springframework.data.jpa.repository.JpaRepository;



public interface MyTableRepository extends JpaRepository<MyTableEntity,Long>, MyTableCustomRepository{
    

}
