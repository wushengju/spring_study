package com.wushengju.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * UserService切面
 *
 * @author Sunny
 * @version 1.0
 * @className UserServiceAspect
 * @date 2017/12/12 下午7:46
 */
@Component
@Aspect
public class UserServiceAspect {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceAspect.class);

    /**
     * 切入点定义
     */
    @Pointcut("execution(* com.wushengju.study..*(..))")
    public void test(){}

    /**
     * 前通知
     */
    @Before("test()")
    public void before(){
        logger.info("before pointcut execute");
    }

    /**
     * 后通知
     */
    @After("test()")
    public void after(){
        logger.info("after pointcut execute");
    }

    /**
     * 返回通知
     */
    @AfterReturning("test()")
    public void afterReturning(){
        logger.info("after pointcut execute returning");
    }

    /**
     * 环绕通知
     */
    @Around("test()")
    public void around(ProceedingJoinPoint pjp){
        logger.info("Method around ,before pointcut execute");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
           logger.error("e:", throwable);
        }
        logger.info("Method around ,after pointcut execute");
    }
}
