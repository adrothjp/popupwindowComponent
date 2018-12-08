package com.example.adrian.popupwindowdemo;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    /*
    button to open up the popup.
    PopupWindow Widget
    layout inflater
    and a relative layout linked to the popwindow.xml
     */
    private Button btn;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference button and layout in on create method
        btn = (Button) findViewById(R.id.btn_open);
        relativeLayout = (RelativeLayout) findViewById(R.id.Relative);

        //creates the view when the button is pressed
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //initialize the layout inflater
                layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                //create the new layout for the window
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.popwindow, null);

                //create window, pass layout, width, height and if you can close the window if you touch oustside
                popupWindow = new PopupWindow(container, 400, 400, true);
                //places the window at the specific location and gravity
                popupWindow.showAtLocation(relativeLayout, Gravity.NO_GRAVITY,500,500);

                //this instructions is to close the window if we click outside of it
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        //dismisses the popupWindow
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });
    }
}
