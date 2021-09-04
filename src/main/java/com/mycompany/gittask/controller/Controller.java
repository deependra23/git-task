package com.mycompany.gittask.controller;

import com.mycompany.gittask.model.AuthorList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
    @RequestMapping("/author")
    public List<AuthorList> getAuthorList(){
        return Arrays.asList(
                new AuthorList(989095, "Deependra", "Sydney"),
                new AuthorList(988339, "Nandeshwor", "Denver")
        );
    }


}
