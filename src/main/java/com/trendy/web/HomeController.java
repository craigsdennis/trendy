package com.trendy.web;

import com.trendy.domain.TrendProfile;
import com.trendy.domain.TrendProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @Autowired
    TrendProfileRepository trendProfileRepository;

    @RequestMapping("/")
    String index(Model model) {
        Page<TrendProfile> page = trendProfileRepository.findAll(new PageRequest(0, 10));
        model.addAttribute("page", page);
        return "index";
    }
}
