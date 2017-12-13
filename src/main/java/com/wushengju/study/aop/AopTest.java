package com.wushengju.study.aop;

import com.wushengju.study.util.SpringUtil;
import org.springframework.context.ApplicationContext;


/**
 * AOP测试类
 *
 * @author Sunny
 * @version 1.0
 * @className AopTest
 * @date 2017/12/12 下午7:39
 */
public class AopTest {
    private static String filePath = "classpath:applicationContext.xml";

    public static void main(String[] args) {
        ApplicationContext context = SpringUtil.getApplicationContext(filePath);
        UserService userService = (UserService) context.getBean("userService");
        userService.getUserName();
    }
}
