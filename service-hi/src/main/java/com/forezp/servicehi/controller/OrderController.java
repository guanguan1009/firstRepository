package com.forezp.servicehi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {

    @GetMapping("/servicehi/orders")
    public Object getOrders(){
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNo", "RC0001");
        System.out.println("1616");
        System.out.println("1717");
        System.out.println("guanguan1009");
        return map;
    }

}
