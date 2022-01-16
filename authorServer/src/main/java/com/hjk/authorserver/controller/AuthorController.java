package com.hjk.authorserver.controller;

import com.hjk.authorserver.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @CrossOrigin
    @RequestMapping("/findAuthorByName")
    public String findAuthorByName(@RequestParam("title") String title) {
        return authorService.findAuthorByTitle(title);
    }

}
