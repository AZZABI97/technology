package com.technology.tech.service;

import com.technology.tech.entity.Article;
import com.technology.tech.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public List<Article> foundAllArticles() {
        return articleRepository.findAll();
    }
}
