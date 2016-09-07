package com.abings.buildermodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.abings.buildermodel.Builder.Man;
import com.abings.buildermodel.Builder.PeopleDirector;
import com.abings.buildermodel.Builder.PeopleProduct;
import com.abings.buildermodel.Builder.Woman;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PeopleProduct woman = PeopleDirector.constructPeople(new Woman());
        Log.i("Tag",woman.toString());

        PeopleProduct man = PeopleDirector.constructPeople(new Man());
        Log.i("Tag",man.toString());
    }
}
