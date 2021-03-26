package com.technology.tech.controller;

import com.technology.tech.entity.Article;
import com.technology.tech.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class MainController {

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/Articles")
    public List<Article> getArticles() {
        return articleService.foundAllArticles();
    }
}
