package com.bootcamp.JPA3;

//import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//import antlr.collections.List;


public interface AuthorRepository extends CrudRepository<Author, Integer> {


}
