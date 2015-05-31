package com.example.goliat.easytravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class buses extends Activity implements View.OnClickListener  {
    private ImageView liniq_45;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buses);


        liniq_45=(ImageView)findViewById(R.id.liniq_45);
        liniq_45.setOnClickListener(this);




    }


    public void onClick(View v) {
        if (v.getId() == liniq_45.getId()) {
            startActivity(new Intent(this,razpisaniq_45.class));
            finish ();

        }

    }

    public void onBackPressed()
    {
        startActivity(new Intent(this,MainActivity.class));
        finish ();
    }

}
