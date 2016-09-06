package com.abings.buildermodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abings.buildermodel.Builder.FatPeople;
import com.abings.buildermodel.Builder.PeopleDirector;
import com.abings.buildermodel.Builder.ThinPeople;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PeopleDirector peopleDirector = new PeopleDirector(new FatPeople());
        peopleDirector.createPeople();

        PeopleDirector peopleDirector1 = new PeopleDirector(new ThinPeople());
        peopleDirector1.createPeople();
    }
}
