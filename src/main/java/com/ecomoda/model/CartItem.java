package com.ecomoda.model;

import java.io.Serializable;

public class CartItem  implements Serializable {


    public CartItem() {

    }

    public CartItem(String id, ArticleType articleType, int amount) {
        this.id = id;
        this.articleType = articleType;
        this.amount = amount;
    }

    private String id;
    private ArticleType articleType;
    private int amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArticleType getArticle() {
        return articleType;
    }

    public void setArticle(ArticleType articleType) {
        this.articleType = articleType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
