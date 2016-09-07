package com.abings.buildermodel.Builder;

/**
 * Created by HaomingXu on 2016/9/7.
 */
public class Man implements Builder {

    private PeopleProduct peopleProduct = new PeopleProduct();

    @Override
    public void setName() {
        peopleProduct.setName("小明");
    }

    @Override
    public void setAge() {
        peopleProduct.setAge("18岁");
    }

    @Override
    public void setSex() {
        peopleProduct.setSex("男");
    }

    @Override
    public void setWeight() {
        peopleProduct.setWeight("61Kg");
    }

    @Override
    public PeopleProduct getPeople() {
        return peopleProduct;
    }

}
