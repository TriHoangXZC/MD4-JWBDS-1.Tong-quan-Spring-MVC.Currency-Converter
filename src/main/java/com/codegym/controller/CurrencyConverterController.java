package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/converter")
public class CurrencyConverterController {
    @GetMapping("")
    public ModelAndView showFormConverter(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("/usdToVnd")
    public ModelAndView showResult(@RequestParam float usd, float rate) {
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("usd", usd);
        modelAndView.addObject("rate", rate);
        float result = usd * rate;
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
