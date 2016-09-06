package com.abings.buildermodel.Builder;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/6.
 */
public class ThinPeople extends PeopleBuilder {
    @Override
    public void head() {
        Log.i("Tag", "瘦人的大头");
    }

    @Override
    public void body() {
        Log.i("Tag","瘦人的身体");

    }

    @Override
    public void hand() {
        Log.i("Tag","瘦人的手");
    }

    @Override
    public void foot() {
        Log.i("Tag","瘦人的脚");
    }
}
