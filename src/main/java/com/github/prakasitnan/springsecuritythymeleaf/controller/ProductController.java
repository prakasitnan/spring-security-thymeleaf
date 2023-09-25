package com.github.prakasitnan.springsecuritythymeleaf.controller;

import com.github.prakasitnan.springsecuritythymeleaf.model.Comment;
import com.github.prakasitnan.springsecuritythymeleaf.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    Product product = null;

    ProductController() {
        List<Comment> commentList = new ArrayList<>();
        Comment comment1 = new Comment(1, "Comment 1");
        Comment comment2 = new Comment(2, "Comment 1");
        Comment comment3 = new Comment(3, "Comment 1");
        Comment comment4 = new Comment(4, "Comment 1");

        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JULY, 24);

        commentList.add(comment1);
        commentList.add(comment2);
        commentList.add(comment3);
        commentList.add(comment4);

        product = new Product(1, "Seed", new BigDecimal(50.99), true, cal.getTime(), commentList);
    }

    @RequestMapping("/{id}")
    String getById(@PathVariable("id") Integer id, Model model) {

        model.addAttribute("product", product);

        return "product/product";
    }
}
