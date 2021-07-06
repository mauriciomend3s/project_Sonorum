package com.mm.sonorum;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;


public class SplashActivity extends Activity {

    private ProgressBar mProgress;
    private ImageView animationSonorum;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        mProgress = (ProgressBar) findViewById(R.id.carregamento);
        //start lengthy operation in a background thread
        animationSonorum = (ImageView) findViewById(R.id.animationSonorum);
        animationSonorum.setBackgroundResource(R.drawable.sequenciaanimacao);
        AnimationDrawable anima = (AnimationDrawable) animationSonorum.getBackground();
        anima.start();


        new Thread(new Runnable() {
            //  @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();
    }

    private void doWork() {
        for (int progress = 0; progress < 100; progress += 10) {
            try {
                Thread.sleep(500);
                mProgress.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

    private void startApp() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
