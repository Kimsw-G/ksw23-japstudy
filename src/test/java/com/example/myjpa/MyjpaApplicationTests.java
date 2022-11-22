package com.example.myjpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MyjpaApplicationTests {

	@Autowired
	MyTableRepository myTableRepository;

	@Test
	@Rollback(false)
	void testRepository() {
	
		MyTableEntity tableEntity = new MyTableEntity();
		tableEntity.setMyvalue("bananana");
		
		myTableRepository.save(tableEntity);

		List<MyTableEntity> allTable = myTableRepository.findAll();
		for (MyTableEntity myTableEntity : allTable) {
			System.out.println(myTableEntity);
		}
	}

	@Test
	@Rollback(false)
	void testCustomRepository(){
		List<String> myValues = myTableRepository.findCustomAllMyValue();
		for (String myValue : myValues) {
			System.out.println(myValue);
		}

		List<MyTableEntity> myTables = myTableRepository.findCustomAll();
		for (MyTableEntity myTable : myTables){
			System.out.println(myTable);
		}
	}

}
