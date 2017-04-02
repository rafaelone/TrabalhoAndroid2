package br.com.fiap.exercicios.listview.RM77722;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        sp = getSharedPreferences("PizzariaPreferences", MODE_PRIVATE);

        int splashTime = sp.getInt("splashTime", 3000);
        boolean disable = sp.getBoolean("disableSplash", false);

        if( !disable ) {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    loadMainActivity();
                }
            }, splashTime);
        } else {
            loadMainActivity();
        }
    }

    public void loadMainActivity() {
        Intent it = new Intent(SplashScreenActivity.this, MainActivity.class);
        startActivity(it);

        finish();
    }
    }



