package com.example.adrian.popupwindowdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;

public class PopActivity extends Activity {

    /*In the manifest file you need to call this java file as an activity.
    not necesarry but i changed some settings in the styles.xml to close if i
    touch outside the window, and also set the background around the popup to be
    translucent so you can see the background of the main activity.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);

        //A structure describing information about the width and height of the popup window
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        //declaring variable for width and height to the display metrics
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        //setting the layout to the specified width and height by percentage
        getWindow().setLayout((int)(width*.7), (int)(height*.6));

        //getting the window to an exact location on the screen and gravity of said window
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        //setting the popup parameters
        getWindow().setAttributes(params);
    }
}
