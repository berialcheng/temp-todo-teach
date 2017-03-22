package org.nirvana.ioc.service;

import org.nirvana.ioc.bean.Person;
import org.nirvana.ioc.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhongcheng on 22/03/2017.
 */
public class ServiceB {

    @Autowired
    private PersonDAO personDAO;


    public Person getPerson(){
        return personDAO.getPerson();
    }
}
