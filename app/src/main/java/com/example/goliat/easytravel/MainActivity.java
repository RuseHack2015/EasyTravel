package com.example.goliat.easytravel;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity implements View.OnClickListener  {
    private ImageView choose;
    private ImageView contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        choose=(ImageView)findViewById(R.id.choose);
        choose.setOnClickListener(this);

        contacts=(ImageView)findViewById(R.id.contacts);
        contacts.setOnClickListener(this);



    }


    public void onClick(View v) {
        if (v.getId() == choose.getId()) {
            startActivity(new Intent(this,buses.class));
            finish ();
        }
        if (v.getId() == contacts.getId()) {
            startActivity(new Intent(this,contacts.class));
            finish ();
        }

    }

    public void onBackPressed()
    {
        finish ();
    }

}
