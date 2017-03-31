package br.com.fiap.exercicios.listview.RM77722;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {

    ImageView imgPizza;
    TextView txtDescricao;
    TextView txtNome;
    TextView txtIngredientes;
    TextView txtAlergicos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizza pizza = (Pizza) getIntent().getExtras().get("pizza");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(pizza.getDescricao());


        imgPizza = (ImageView)findViewById(R.id.imgPizza);
        txtDescricao = (TextView)findViewById(R.id.txtDescricao);
        txtNome = (TextView)findViewById(R.id.txtNome);
        txtIngredientes = (TextView) findViewById(R.id.txtIngredientes);
        txtAlergicos = (TextView) findViewById(R.id.txtAlergicos);

        imgPizza.setImageResource(pizza.getImagem());
        txtNome.setText(pizza.getNome());
        txtIngredientes.setText(pizza.getIngredientes());
        txtAlergicos.setText(pizza.getAlergicos());




    }


}
