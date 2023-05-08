package com.study.board.entity;


import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

;

@Entity
@Data
public class Board {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer id;
    private  String title;
    private String content;

    private String filename;

    private String filepath;


}
