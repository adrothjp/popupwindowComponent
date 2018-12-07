package com.example.adrian.popupwindowdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_op = (Button) findViewById(R.id.btn_open);//link button variable with layout button id

        btn_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create an intent that starts the popup window activity
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                startActivity(i);
            }
        });
    }
}
