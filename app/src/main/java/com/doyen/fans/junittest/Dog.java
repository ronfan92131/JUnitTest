package com.doyen.fans.junittest;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Dog {
    private String name;
    private String description;
    private int weight;

    private String TAG = "Dog";

    //constructor
    public Dog(String n, String d, int i){
        this.name = n;
        this.description = d;
        this.weight = i;
    }

    public String getName(){
        Log.d(TAG, "getName");
        return this.name;
    }
    public String getDescription(){
        Log.d(TAG, "getDescription");
        return this.description;
    }

    public int getWeight(){
        Log.d(TAG, "getWeight");
        return this.weight;
    }

    public void showTime(Context context){
        Log.d(TAG, "showTime");
        Toast.makeText(context, "My name is " + this.name, Toast.LENGTH_SHORT).show();
    }

}
