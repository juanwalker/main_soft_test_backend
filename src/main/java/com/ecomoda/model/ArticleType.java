package com.ecomoda.model;

import java.io.Serializable;

public class ArticleType  implements Serializable {

    public ArticleType(){

    }

    public ArticleType(String id, String name, String cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    private String id;
    private String name;
    public String cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
