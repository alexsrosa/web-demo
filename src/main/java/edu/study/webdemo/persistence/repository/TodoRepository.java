package edu.study.webdemo.persistence.repository;

import edu.study.webdemo.persistence.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
