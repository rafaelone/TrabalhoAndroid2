package br.com.fiap.exercicios.listview.RM77722;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {

    ImageView imgPizza;
    TextView txtDescricao;
    TextView txtNome;
    TextView txtIngredientes;
    TextView txtAlergicos;
    RatingBar ratingbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizza pizza = (Pizza) getIntent().getExtras().get("pizza");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(pizza.getDescricao());


        imgPizza = (ImageView)findViewById(R.id.imgPizza);
        txtDescricao = (TextView)findViewById(R.id.txtDescricao);
        txtNome = (TextView)findViewById(R.id.txtNome);
        txtIngredientes = (TextView) findViewById(R.id.txtIngredientes);
        txtAlergicos = (TextView) findViewById(R.id.txtAlergicos);
        ratingbar = (RatingBar) findViewById(R.id.rank);

        imgPizza.setImageResource(pizza.getImagem());
        txtNome.setText(pizza.getNome());
        txtIngredientes.setText(pizza.getIngredientes());
        txtAlergicos.setText(pizza.getAlergicos());
        ratingbar.setRating(pizza.getRank());



    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }




}
