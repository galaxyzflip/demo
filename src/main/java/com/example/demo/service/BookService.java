package com.example.demo.service;

import com.example.demo.dao.BookMapper;
import com.example.demo.model.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookMapper bookMapper;

    public List<BookDto> findByTitle(String title){
        return bookMapper.findByTitle(title);
    }

    public List<BookDto> findAll(){
        return bookMapper.findAll();
    }
}
