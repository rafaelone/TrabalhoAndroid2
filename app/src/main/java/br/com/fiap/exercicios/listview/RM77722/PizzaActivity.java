package br.com.fiap.exercicios.listview.RM77722;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {

    ImageView imgPizza;
    TextView txtDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizza pizza = (Pizza) getIntent().getExtras().get("pizza");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(pizza.getDescricao());


        imgPizza = (ImageView)findViewById(R.id.imgPizza);
        txtDescricao = (TextView)findViewById(R.id.txtDescricao);

        imgPizza.setImageResource(pizza.getImagem());
        txtDescricao.setText(pizza.getDescricao());

    }


}
