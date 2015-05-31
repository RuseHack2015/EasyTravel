package com.example.goliat.easytravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class razpisaniq_45 extends Activity implements View.OnClickListener  {
    private ImageView razpisanie_1;
    private ImageView razpisanie_2;
    private ImageView razpisanie_3;
    private ImageView razpisanie_4;
    private ImageView razpisanie_5;
    private ImageView razpisanie_6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liniq_45);


        razpisanie_1=(ImageView)findViewById(R.id.razpisanie_1);
        razpisanie_1.setOnClickListener(this);

        razpisanie_2=(ImageView)findViewById(R.id.razpisanie_2);
        razpisanie_2.setOnClickListener(this);

        razpisanie_3=(ImageView)findViewById(R.id.razpisanie_3);
        razpisanie_3.setOnClickListener(this);

        razpisanie_4=(ImageView)findViewById(R.id.razpisanie_4);
        razpisanie_4.setOnClickListener(this);

        razpisanie_5=(ImageView)findViewById(R.id.razpisanie_5);
        razpisanie_5.setOnClickListener(this);

        razpisanie_6=(ImageView)findViewById(R.id.razpisanie_6);
        razpisanie_6.setOnClickListener(this);


    }


    public void onClick(View v) {
        if (v.getId() == razpisanie_1.getId()) {
            startActivity(new Intent(this, razpisanie_1.class));
            finish ();
        }
        if (v.getId() == razpisanie_2.getId()) {
            startActivity(new Intent(this, razpisanie_2.class));
            finish ();
        }
        if (v.getId() == razpisanie_3.getId()) {
            startActivity(new Intent(this, razpisanie_3.class));
            finish ();
        }
        if (v.getId() == razpisanie_4.getId()) {
            startActivity(new Intent(this, razpisanie_4.class));
            finish ();
        }
        if (v.getId() == razpisanie_5.getId()) {
            startActivity(new Intent(this, razpisanie_5.class));
            finish ();
        }
        if (v.getId() == razpisanie_6.getId()) {
            startActivity(new Intent(this, razpisanie_6.class));
            finish ();
        }

    }

    public void onBackPressed()
    {
        startActivity(new Intent(this, buses.class));
        finish ();
    }

}
