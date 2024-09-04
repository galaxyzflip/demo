package com.example.demo.controller;

import com.example.demo.model.BookDto;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public String book(ModelMap model){
        log.debug("controller 탐");
        List<BookDto> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);

        return "book";
    }

//    @GetMapping("/book/{title}")
//    public String bookDetail(@PathVariable("title") String title, ModelMap model){
//
//        List<BookDto> bookList = bookService.findByTitle(title);
//        model.addAttribute("list", bookList);
//
//        return "/book";
//    }
}
