package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@Controller
public class InfoController {
    private final Random random = new Random();
    private final DecimalFormat df = new DecimalFormat("#.00");

    @GetMapping("/uuid")
    @ResponseBody
    public Map<String, String> getUuid(){
        Map<String, String> response = new HashMap<>();
        response.put("uuid", UUID.randomUUID().toString());
        return response;
    }

    @GetMapping("/exchange")
    @ResponseBody
    public Map<String, String> getExchangeRate(){
        double rate = 20 + (100-20) * random.nextDouble();
        Map<String, String> response = new HashMap<>();
        response.put("rate", df.format(rate));
        return response;
    }

    @GetMapping("/exchange/{currency}")
    @ResponseBody
    public Map<String, Object> getCurrencyRate(@PathVariable String currency){
        double rate = 20 + (100-20) * random.nextDouble();
        Map<String, Object> response = new HashMap<>();
        response.put("currency", currency.toUpperCase());
        response.put("rate", df.format(rate));
        return response;
    }
}