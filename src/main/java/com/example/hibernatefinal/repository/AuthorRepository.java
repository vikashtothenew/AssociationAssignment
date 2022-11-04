package com.example.hibernatefinal.repository;

import com.example.hibernatefinal.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}