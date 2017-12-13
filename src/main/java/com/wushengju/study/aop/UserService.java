package com.wushengju.study.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 用户Service，用于测试AOP
 *
 * @author Sunny
 * @version 1.0
 * @className UserService
 * @date 2017/12/12 下午7:32
 */
@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private String userName = "hello world!";

    /**
     * 返回当前userName
     * @return
     */
    public String getUserName(){
        logger.info("userName:{}",userName);
        return userName;
    }
}
