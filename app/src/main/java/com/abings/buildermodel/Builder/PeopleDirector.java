package com.abings.buildermodel.Builder;

/**
 * Created by HaomingXu on 2016/9/7.
 */
public class PeopleDirector {
    public static PeopleProduct constructPeople(Builder builder){
        builder.setName();
        builder.setAge();
        builder.setSex();
        builder.setWeight();
       return builder.getPeople();
    }
}
