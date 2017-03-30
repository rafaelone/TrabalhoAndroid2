package br.com.fiap.exercicios.listview.RM77722;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by casa on 30/03/17.
 */

public class PizzaAdapter extends BaseAdapter{
    private Context context;
    private List<Pizza> pizzas;

    public PizzaAdapter(Context context, List<Pizza> pizzas){
        this.context = context;
        this.pizzas = pizzas;
    }

    @Override
    public int getCount() {
        return this.pizzas.size();
    }

    @Override
    public Object getItem(int i) {
        return this.pizzas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        Pizza pizza = this.pizzas.get(i);
        View v = inflater.inflate(R.layout.listview_pizzas, null);

        ImageView imgPizza = (ImageView) v.findViewById(R.id.imgPizza);
        TextView txtDescricao = (TextView) v.findViewById(R.id.txtDescricao);
        TextView txtValor = (TextView) v.findViewById(R.id.txtValor);

        imgPizza.setImageResource(pizza.getImagem());
        txtDescricao.setText(pizza.getDescricao());
        txtValor.setText(pizza.getValor());

        return v;


    }
}
