package com.example.hp.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.database.SQL.DataBaseHelper;

public class MainActivity extends AppCompatActivity {

    DataBaseHelper myDb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this) ;
    }
}
