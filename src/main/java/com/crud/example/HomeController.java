package com.crud.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        // 'BoardController'의 'boardList' 메서드로 리다이렉트
        return "redirect:/board/posts";
    }
}
