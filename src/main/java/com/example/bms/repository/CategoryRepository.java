package com.example.bms.repository;

import com.example.bms.entity.Book;
import com.example.bms.entity.Category;
//import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "categories",path = "categories")
public interface CategoryRepository extends JpaRepository<Category,Integer> {


}
