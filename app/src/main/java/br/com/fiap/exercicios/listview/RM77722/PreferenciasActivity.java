package br.com.fiap.exercicios.listview.RM77722;


import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;


public class PreferenciasActivity extends AppCompatActivity {

    SharedPreferences sp;
    EditText splashScreen;
    Switch desabilidarSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        splashScreen = (EditText) findViewById(R.id.splashScreenField);
        desabilidarSplash = (Switch) findViewById(R.id.disableSplash);
        sp = getSharedPreferences("PizzariaPreferences", MODE_PRIVATE);


        splashScreen.setText(String.valueOf(sp.getInt("splashTime", 3000)));
        desabilidarSplash.setChecked(sp.getBoolean("disableSplash", false));

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.preferences));
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
    public void savePreferences(View view) {
        int time = Integer.valueOf( splashScreen.getText().toString() );
        boolean disable = desabilidarSplash.isChecked();

        SharedPreferences.Editor e = sp.edit();
        e.putBoolean("disableSplash", disable);
        e.putInt("splashTime", time);
        e.commit();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
