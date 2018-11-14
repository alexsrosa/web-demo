package edu.study.webdemo.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Todo {

    @Id
    private Integer id;
    private String message;
    private Integer priority;
}
