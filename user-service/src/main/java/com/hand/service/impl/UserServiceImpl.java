package com.hand.service.impl;

import com.hand.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/8/22
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    public String sayHello() {
        return "hello world";
    }
}
