package com.zylm.service.controller;

import com.zylm.service.common.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description UserController
 * @Author zy
 * @Date 2023/11/2 15:44
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping
    public Response<Map<String, Object>> get() {
        Response<Map<String, Object>> response = new Response<>();
        Map<String, Object> user = new HashMap<>();
        user.put("name", "demo");
        user.put("age", 25);
        response.setData(user);
        return response;
    }
}
