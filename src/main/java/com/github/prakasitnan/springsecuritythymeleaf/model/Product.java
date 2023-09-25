package com.github.prakasitnan.springsecuritythymeleaf.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Product {
    private Integer id;
    private String name;
    private BigDecimal price;
    private boolean inStock;
    private Date stockDate;
    private List<Comment> comments;

    public Product() {
    }

    public Product(Integer id, String name, BigDecimal price, boolean inStock, Date stockDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.stockDate = stockDate;
    }

    public Product(Integer id, String name, BigDecimal price, boolean inStock, Date stockDate, List<Comment> comments) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.stockDate = stockDate;
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Date getStockDate() {
        return stockDate;
    }

    public void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
