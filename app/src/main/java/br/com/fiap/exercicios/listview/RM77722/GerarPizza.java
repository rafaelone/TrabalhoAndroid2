package br.com.fiap.exercicios.listview.RM77722;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by casa on 30/03/17.
 */

public class GerarPizza {

    public static List<Pizza> listaPizzas(){
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("Pizza de Mussarela", R.drawable.mussarela, "R$ 10,00" ));
        pizzas.add(new Pizza("Pizza de Calabresa", R.drawable.calabresa, "R$ 11,00" ));
        pizzas.add(new Pizza("Pizza de Catupiry", R.drawable.catupiry, "R$ 12,00" ));
        pizzas.add(new Pizza("Pizza de Portuguesa", R.drawable.portuguesa, "R$ 13,00" ));
        pizzas.add(new Pizza("Pizza de chocolate", R.drawable.chocolate, "R$ 14,00" ));
        pizzas.add(new Pizza("Pizza de cachorro quente", R.drawable.hotdog, "R$ 15,00" ));

        return pizzas;
    }
}
