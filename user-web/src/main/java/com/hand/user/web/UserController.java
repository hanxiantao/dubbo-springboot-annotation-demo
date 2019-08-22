package com.hand.user.web;

import com.hand.user.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/8/22
 */
@RestController
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello();
    }
}
