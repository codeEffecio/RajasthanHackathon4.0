package com.example.lenovo.tourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class food extends AppCompatActivity {

    RadioButton r1,r2,r3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
       b1=(Button)findViewById(R.id.b);
        r1=(RadioButton)findViewById(R.id.rb1);
        r2=(RadioButton)findViewById(R.id.rb2);
        r3=(RadioButton)findViewById(R.id.rb3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked())
                {
                Intent i1=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.mcdonalds.com/us/en-us.html"));
                startActivity(i1);
            }
            else if(r2.isChecked()) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/"));
                    startActivity(i);
                }
                else if(r3.isChecked()) {
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.swiggy.com/"));
                startActivity(i);
                }


            }
        });



    }
}
