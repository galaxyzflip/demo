package com.example.demo.dao;

import com.example.demo.model.BookDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<BookDto> findByTitle(String title);

    List<BookDto> findAll();

    void insertLibName(String libName);

}
