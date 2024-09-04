package com.example.demo.controller;

import com.example.demo.model.BookDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BookRestController {

    @GetMapping("/1")
    public ResponseEntity<BookDto> test(){
        BookDto book = new BookDto();
        book.setAuthor("최창선");
        book.setTitle("Spring");
        book.setRegNo("EM00001");

        return ResponseEntity.ok(book);
    }
    @GetMapping("/2")
    public String test2(){
        return "222";
    } @GetMapping("/3")
    public String test3(){
        return "333";
    } @GetMapping("/4")
    public String test4(){
        return "444";
    }
}
