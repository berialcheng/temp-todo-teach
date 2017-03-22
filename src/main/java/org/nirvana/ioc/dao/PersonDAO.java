package org.nirvana.ioc.dao;

import org.nirvana.ioc.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhongcheng on 22/03/2017.
 */

public class PersonDAO {

    @Autowired
    Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
