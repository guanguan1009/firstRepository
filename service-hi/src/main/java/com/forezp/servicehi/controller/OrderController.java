package com.forezp.servicehi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {

    @GetMapping("/servicehi/orders")
    public Object getOrders(){
        HashMap<String, String> map = new HashMap<>();
        map.put("orderNo", "RC0001");
        System.out.println("16");
        System.out.println("1616");
        System.out.println("1717");
        System.out.println("guanguan1009");
        System.out.println("guanguan1994");
        List<String> list = new ArrayList<>();
        List<String> collect = list.stream().filter(t -> "0".equals(t)).collect(Collectors.toList());
        System.out.println("25");
        System.out.println("26");
        System.out.println("27");
        return map;
    }

}
