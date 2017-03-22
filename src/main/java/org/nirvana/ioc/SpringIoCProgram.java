package org.nirvana.ioc;

import org.nirvana.ioc.bean.Person;
import org.nirvana.ioc.dao.PersonDAO;
import org.nirvana.ioc.service.ServiceA;
import org.nirvana.ioc.service.ServiceB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by zhongcheng on 22/03/2017.
 */
public class SpringIoCProgram {

    public static void main(String... args){
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        PersonDAO dao = (PersonDAO)context.getBean("personDAO");

        System.out.println(dao.getPerson().getName());
        System.out.println(dao.getPerson().getPet().getName());

        System.out.println(((ServiceA)context.getBean("serviceA")).getPerson().getName());

        System.out.println(((ServiceB)context.getBean("serviceB")).getPerson().getName());

    }
}
