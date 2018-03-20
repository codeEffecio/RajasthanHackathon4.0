package com.example.lenovo.tourism;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th=new Thread(){
            public void run(){
                try{
                    sleep(3000);

                    actmain();


                }
                catch(Exception e)
                {}
                finally {
                    finish();
                }
            }
        };
        th.start();

    }

    public void actmain()
    {
            Intent i=new Intent(Splash.this,MainActivity.class);
            startActivity(i);
        }

    }


