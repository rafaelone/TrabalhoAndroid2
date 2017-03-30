package br.com.fiap.exercicios.listview.RM77722;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstPizzas;
    List<Pizza> pizzas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzas = GerarPizza.listaPizzas();
        PizzaAdapter pizzaAdapter = new PizzaAdapter(this, pizzas);
        lstPizzas = (ListView)findViewById(R.id.lstPizzas);
        lstPizzas.setAdapter(pizzaAdapter);

        lstPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Pizza pizza = pizzas.get(i);

                Intent it = new Intent(MainActivity.this, PizzaActivity.class);
                it.putExtra("pizza", pizza);
                startActivity(it);
            }
        });


        }
    }

