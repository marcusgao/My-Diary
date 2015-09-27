package com.raygao;

import android.app.Application;

import com.parse.Parse;


public class MyApplication extends Application {




    @Override
    public void onCreate() {
        super.onCreate();


        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "TyenHYVczhzLFlFqVvQhd1Lu0HJitmOAtKqdGjq8", "c3wwNaNQmfJ7U8m4vlWFdj959o1U6RsSJAQIX2AP");
        


    }

}