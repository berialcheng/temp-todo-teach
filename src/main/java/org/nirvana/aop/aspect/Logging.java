package org.nirvana.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by zhongcheng on 22/03/2017.
 */
@Component
@Aspect
public class Logging {

    //指定织入的方法。
    @Before("execution(* *())")
    public void beforeMethod(){
        System.out.println("method start!");
    }

    @After("execution(* *())")
    public void endMethod(){
        System.out.println("method end!");
    }


}
