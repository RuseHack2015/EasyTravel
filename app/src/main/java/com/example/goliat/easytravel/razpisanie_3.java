package com.example.goliat.easytravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class razpisanie_3 extends Activity   {
    private TextView result;
    private WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.razpisanie_3);

        result=(TextView)findViewById(R.id.result);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        String strDate = sdf.format(c.getTime());

        String hour = strDate.substring(0, 2);
        String min = strDate.substring(3, 5);

        int h = Integer.parseInt(hour);
        int m = Integer.parseInt(min);

        int now=h*60+m;
        int trugvane=915;
        int s= now-trugvane;

        if (s<=0)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/458/8145458x.png");
            result.setText("Автобусът все още не е тръгнал.");
        }
        if (s>0 && s<=2)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/458/8145458x.png");
            result.setText("Автобусът е бил последно на първата спирка.");
        }
        if (s>2 && s<=4)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/459/8145459j.png");
            result.setText("Автобусът е бил последно на втората спирка.");
        }
        if (s>4 && s<=6)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/460/8145460e.png");
            result.setText("Автобусът е бил последно на третата спирка.");
        }
        if (s>6 && s<=8)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/461/8145461x.png");
            result.setText("Автобусът е бил последно на четвъртата спирка.");
        }
        if (s>8 && s<=10)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/462/8145462A.png");
            result.setText("Автобусът е бил последно на петата спирка.");
        }
        if (s>10 && s<=12)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/463/8145463p.png");
            result.setText("Автобусът е бил последно на шестата спирка.");
        }
        if (s>12)
        {
            WebView myWebView = (WebView) findViewById(R.id.web1);
            myWebView.loadUrl("http://prikachi.com/images/464/8145464u.png");
            result.setText("Автобусът е на последната спирка.");
        }



     
    }



    public void onBackPressed()
    {
        startActivity(new Intent(this, razpisaniq_45.class));
        finish ();
    }

}
