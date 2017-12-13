package com.wushengju.study.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring工具类
 *
 * @author Sunny
 * @version 1.0
 * @className SpringUtil
 * @date 2017/12/12 下午7:36
 */
public class SpringUtil {

    /**
     * 根据配置文件获取context
     * @param filePath
     * @return
     */
    public static ApplicationContext getApplicationContext(String filePath){
        ApplicationContext context = new ClassPathXmlApplicationContext(filePath);
        return context;
    }
}
