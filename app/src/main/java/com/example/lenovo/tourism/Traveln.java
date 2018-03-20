package com.example.lenovo.tourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Traveln extends AppCompatActivity {

    Button b1;
    RadioGroup rg;
    RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveln);
        b1=(Button)findViewById(R.id.b1);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        r1=(RadioButton)findViewById(R.id.rb1);
        r2=(RadioButton)findViewById(R.id.rb2);
        r3=(RadioButton)findViewById(R.id.rb3);
        r4=(RadioButton)findViewById(R.id.rb4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(r1.isChecked())
                {
                    Intent i1=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.goibibo.com/flights/"));
                    startActivity(i1);
                }
                else if(r2.isChecked()) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.irctc.co.in/eticketing/loginHome.jsf"));
                    startActivity(i);
                }
                else if(r3.isChecked()) {
                    Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.redbus.in/"));
                    startActivity(i);
                }
                else if(r4.isChecked()){
                    Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.olacabs.com/"));
                    startActivity(i);
                }


            }
        });




    }

    }

