package com.abings.buildermodel.Builder;

/**
 * Created by HaomingXu on 2016/9/6.
 */
public class PeopleDirector {
    private PeopleBuilder peopleBuilder;
    public PeopleDirector(PeopleBuilder peopleBuilder){
        this.peopleBuilder = peopleBuilder;
    }
    public void createPeople(){
        peopleBuilder.head();
        peopleBuilder.body();
        peopleBuilder.hand();
        peopleBuilder.foot();
    }
}
