package org.nirvana.ioc;

import org.nirvana.ioc.bean.Person;
import org.nirvana.ioc.bean.Pet;

/**
 * Created by zhongcheng on 22/03/2017.
 */
public class PlainJavaProgram {

    public static void main(String... args){
        Pet pet = new Pet();
        pet.setName("Doggie");

        Person p = new Person();
        p.setName("Good");
        p.setPet(pet);

        System.out.println(p.getPet().getName());
    }
}
