package com.example.smsreceive;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.camerakit.CameraKitView;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private Button btn;
    private int num = 0;
    private boolean show = true;
    Timer timer;
    Thread thread;


    private boolean farshad = true;

    private static final int REQUEST_PERMISSION_CODE = 1658;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
        btn = (Button) findViewById(R.id.btn);


        //private boolean show = true; balaye bala inam bezan
        final Handler handler = new Handler(); //to sarasari tarif kon khastam bbini
        Runnable runnable=new Runnable() {
            @Override
            public void run() {

                handler.postDelayed(this,100);

                if (show)
                {
                    txt.setVisibility(View.INVISIBLE);
                    show=false;
                }else {
                    txt.setVisibility(View.VISIBLE);
                    show=true;
                }

            }
        };
        handler.post(runnable);









    }
}


    /*



       ======================================

  Runnable r=new Runnable(){

            @Override
            public void run() {
                handler.postDelayed(this, 2000);

                 if (show)
               {
                   txt.setVisibility(View.INVISIBLE);
                   show=false;
               }else {
                   txt.setVisibility(View.VISIBLE);
                   show=true;
               }

        };
        handler=new Handler();
        handler.post(r);


Handler handler=new Handler();
   handler.postDelayed(new Runnable() {
       @Override
       public void run() {
           txt.setVisibility(View.VISIBLE);
       }
   },2000);

     */