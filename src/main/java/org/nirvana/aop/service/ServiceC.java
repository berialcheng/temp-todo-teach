package org.nirvana.aop.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by zhongcheng on 22/03/2017.
 */
@Component
public class ServiceC {

    public String hello(){
        return "Hello";
    }
}
