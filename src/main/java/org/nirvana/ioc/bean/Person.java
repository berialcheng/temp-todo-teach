package org.nirvana.ioc.bean;

/**
 * Created by zhongcheng on 22/03/2017.
 */
public class Person {

    private String name;

    private Pet pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
