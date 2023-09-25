package com.github.prakasitnan.springsecuritythymeleaf.controller;

import com.github.prakasitnan.springsecuritythymeleaf.model.Comment;
import com.github.prakasitnan.springsecuritythymeleaf.model.Product;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    String home(Model model) {


        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        model.addAttribute("userDetails", userDetails);



        List<Comment> commentList = new ArrayList<>();
        Comment comment1 = new Comment(1, "Comment 1");
        Comment comment2 = new Comment(2, "Comment 1");
        Comment comment3 = new Comment(3, "Comment 1");
        Comment comment4 = new Comment(4, "Comment 1");


        commentList.add(comment1);
        commentList.add(comment2);
        commentList.add(comment3);
        commentList.add(comment4);

        List<Product> productList = new ArrayList<>();

        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JULY, 24);

        Product product_1 = new Product(1, "Seed", new BigDecimal(50.99), true, cal.getTime());
        Product product_2 = new Product(2, "Peanut", new BigDecimal(100.99), true, cal.getTime());
        Product product_3 = new Product(3, "Apple", new BigDecimal(56.44), false, cal.getTime(),commentList);
        Product product_4 = new Product(4, "Banana", new BigDecimal(1.99), true, cal.getTime(),commentList);
        Product product_5 = new Product(5, "seed", new BigDecimal(0.99), false, cal.getTime());

        productList.add(product_1);
        productList.add(product_2);
        productList.add(product_3);
        productList.add(product_4);
        productList.add(product_5);

        model.addAttribute("product_1",product_1);

        model.addAttribute("productList", productList);

        return "homepage/home";
    }
}
