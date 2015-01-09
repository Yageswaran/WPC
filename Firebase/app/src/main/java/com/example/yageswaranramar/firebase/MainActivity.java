package com.example.yageswaranramar.firebase;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.firebase.client.Firebase;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);

        Firebase myFirebaseRef = new Firebase("https://dazzling-heat-7789.firebaseio.com/");
       // myFirebaseRef.child("users").setValue("Yages");

        Firebase hopperRef = myFirebaseRef.child("Yageswaran");
        Map<String, Object> test = new HashMap<String, Object>();
        test.put("Username", "Yages");
        test.put("Email", "amosramar@yahoo.com");
        test.put("id", "12345");
        hopperRef.updateChildren(test);




    }




}
