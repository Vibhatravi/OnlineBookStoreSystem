package com.example.OnlineBookStoreSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String mainPage() throws IOException {
        return getResourceAsString("templates/index.html");
    }

    @GetMapping("/books")
    public String viewBooks() throws IOException {
        return getResourceAsString("templates/book/book-list.html");
    }

    @GetMapping("/cart")
    public String viewCart() throws IOException {
        return getResourceAsString("templates/cart/cart-details.html");
    }
    
    @GetMapping("/addBook")
    public String addBook() throws IOException {
        return getResourceAsString("templates/book/book-form.html");
    }

    @GetMapping("/user")
    public String viewUser() throws IOException {
        return getResourceAsString("templates/user/user-details.html");
    }

    @GetMapping("/order")
    public String viewOrder() throws IOException {
        return getResourceAsString("templates/order/order-details.html");
    }

    private String getResourceAsString(String resourcePath) throws IOException {
        ClassPathResource resource = new ClassPathResource(resourcePath);
        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
    }
}
