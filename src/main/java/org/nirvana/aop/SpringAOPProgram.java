package org.nirvana.aop;

import org.nirvana.aop.service.ServiceC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by zhongcheng on 22/03/2017.
 */
public class SpringAOPProgram {

    public static void main(String ... args){
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans-aop.xml");

        ServiceC serviceC = context.getBean(ServiceC.class);
        System.out.println(serviceC.hello());
    }
}
