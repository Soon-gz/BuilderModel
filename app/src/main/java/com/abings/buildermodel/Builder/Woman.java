package com.abings.buildermodel.Builder;

/**
 * Created by HaomingXu on 2016/9/7.
 */
public class Woman implements Builder {

    private PeopleProduct peopleProduct = new PeopleProduct();

    @Override
    public void setName() {
        peopleProduct.setName("小红");
    }

    @Override
    public void setAge() {
        peopleProduct.setAge("19岁");
    }

    @Override
    public void setSex() {
        peopleProduct.setSex("女");
    }

    @Override
    public void setWeight() {
        peopleProduct.setWeight("41Kg");
    }

    @Override
    public PeopleProduct getPeople() {
        return peopleProduct;
    }

}
