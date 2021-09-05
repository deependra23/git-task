package com.mycompany.gittask.controller;

import com.mycompany.gittask.model.AuthorList;
import com.mycompany.gittask.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    @Autowired
    private AuthorService authorService;

    @RequestMapping("/author")
    public List<AuthorList> getAuthorList(){
        return authorService.getAuthorlist();

   }
}
