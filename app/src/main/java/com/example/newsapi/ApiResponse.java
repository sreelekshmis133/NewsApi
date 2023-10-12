package com.example.newsapi;

import java.util.List;

public class ApiResponse {
    public String status;
    public int totalResults;
    public List<Article> articles;

    public List<Article> getArticles(){
        return articles;
    }
}
