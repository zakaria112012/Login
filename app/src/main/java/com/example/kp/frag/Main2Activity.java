package com.example.kp.frag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kp on 17/01/2017.
 */

public class Main2Activity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);





        Intent intent = getIntent();

        TextView nameView=(TextView) findViewById(R.id.resultat);

        nameView.setText(intent.getExtras().getString("mee"));



    }




}
