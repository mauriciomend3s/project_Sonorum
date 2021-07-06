package com.mm.sonorum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;



public class MainActivity extends AppCompatActivity {
    private ImageView animationSonorumActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //

        animationSonorumActivity = (ImageView) findViewById(R.id.animationSonorum);
        animationSonorumActivity.setBackgroundResource(R.drawable.sequenciaanimacao);
        AnimationDrawable anima = (AnimationDrawable) animationSonorumActivity.getBackground();
        anima.start();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }

    public void clicaChuva(View view) {
        //DISPARA SOM
        MediaPlayer somChuva = MediaPlayer.create(this, R.raw.chuva);
        somChuva.start();
        Toast toast = Toast.makeText(MainActivity.this, "CHUVA!", Toast.LENGTH_SHORT);
        toast.show();

    }

    public void clicaUivo(View view) {
        //DISPARA SOM
        MediaPlayer somUivo = MediaPlayer.create(this, R.raw.uivo);
        somUivo.start();
        Toast toast = Toast.makeText(MainActivity.this, "AUUUUUU!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaPalmas(View view) {
        //DISPARA SOM
        MediaPlayer somPalmas = MediaPlayer.create(this, R.raw.palmas);
        somPalmas.start();
        Toast toast = Toast.makeText(MainActivity.this, "PALMAS!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaExterminador(View view) {
        //DISPARA SOM
        MediaPlayer somExterminador = MediaPlayer.create(this, R.raw.exterminador);
        somExterminador.start();
        Toast toast = Toast.makeText(MainActivity.this, "HASTA LA VISTA, BABY!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaSabre(View view) {
        //DISPARA SOM
        MediaPlayer somSabre = MediaPlayer.create(this, R.raw.sabre);
        somSabre.start();
        Toast toast = Toast.makeText(MainActivity.this, "ZIUUUM, ZIUUUM!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaGalo(View view) {
        //DISPARA SOM
        MediaPlayer somGalo = MediaPlayer.create(this, R.raw.galo);
        somGalo.start();
        Toast toast = Toast.makeText(MainActivity.this, "COCOROCOCOU!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaGoku(View view) {
        //DISPARA SOM
        MediaPlayer somGoku = MediaPlayer.create(this, R.raw.goku);
        somGoku.start();
        Toast toast = Toast.makeText(MainActivity.this, "É, EU SOU MAIS FORTE QUE VOCÊ!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaRisadinha(View view) {
        //DISPARA SOM
        MediaPlayer somRisadinha = MediaPlayer.create(this, R.raw.risadinha);
        somRisadinha.start();
        Toast toast = Toast.makeText(MainActivity.this, "HÁHÁHÁHÁ!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaIronMan(View view) {
        //DISPARA SOM
        MediaPlayer somIronman = MediaPlayer.create(this, R.raw.ironman);
        somIronman.start();
        Toast toast = Toast.makeText(MainActivity.this, "EU SOU O HOMEM DE FERRO!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clicaXaropinho(View view) {
        //DISPARA SOM
        MediaPlayer somXaropinho = MediaPlayer.create(this, R.raw.xaropinho);
        somXaropinho.start();
        Toast toast = Toast.makeText(MainActivity.this, "RAAPAAAAZ!", Toast.LENGTH_SHORT);
        toast.show();
    }

}
