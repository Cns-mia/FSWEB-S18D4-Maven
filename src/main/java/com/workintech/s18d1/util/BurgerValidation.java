package com.workintech.s18d1.util;

import com.workintech.s18d1.entity.Burger;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void checkId(Long id) {
        if (id == null || id <= 0) {
            throw new BurgerException("Id is not valid: " + id, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkName(Burger burger) {
        if (burger == null || burger.getName() == null || burger.getName().isBlank()) {
            throw new BurgerException("Burger name can not be empty", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkPrice(Integer price) {
        if (price == null || price < 0) {
            throw new BurgerException("Price is not valid: " + price, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkContent(String content) {
        if (content == null || content.isBlank()) {
            throw new BurgerException("Content can not be empty", HttpStatus.BAD_REQUEST);
        }
    }
}
