package com.example.goliat.easytravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class contacts extends Activity   {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);






    }





    public void onBackPressed()
    {
        startActivity(new Intent(this, MainActivity.class));
        finish ();
    }

}
