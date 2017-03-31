package br.com.fiap.exercicios.listview.RM77722;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by casa on 30/03/17.
 */

public class GerarPizza {

    public static List<Pizza> listaPizzas(){
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("Famosa pizza de Mussarela", R.drawable.mussarela, "R$ 10,00", "Pizza de Mussarela","Massa: \n500 g de farinha de trigo\n" +
                "2 tabletes de fermento biológico\n" +
                "1 colher de chá de sal\n" +
                "1 colher de chá de açúcar\n" +
                "1 colher de sopa de óleo\n" +
                "1 copo de água morna\n"+
                "Recheio: \n" +
                "500 g de queijo de mussarela\n" +
                "Molho de tomate a gosto\n" +
                "Tomate em rodelas a gosto\n" +
                "Orégano a gosto",
                "Se você tem alergia a alguns produtos derivados de leite, por favor não coma essa pizza", "5" ));

        pizzas.add(new Pizza("Aquela pizza de calabresa ", R.drawable.calabresa, "R$ 11,00", "Pizza de Calabresa","Massa: \n" +
                "500g de farinha de trigo\n" +
                "25 g de fermento para pão\n" +
                "1 copo de água\n" +
                "1 ovo\n" +
                "50 g de gordura\n" +
                "1 colher(sopa) fermento em pó \n" +
                "1 colher(café) de sal\n" +
                "Molho\n" +
                "300g tomate maduro\n" +
                "50g queijo parmesão ralado\n" +
                "Sal\n" +
                "Orégano\n" +
                "1 colher(sopa) azeite\n" +
                "Cobertura\n" +
                "300 g de lingui calabresa\n" +
                "2 cebolas em rodelas finas\n" +
                "1/2 xícara(chá) azeitona preta\n" +
                "1 colher(sopa) de azeite\n" +
                "1 colher(café) de orégano",
                "Se você tem alergia a alguns produtos derivados de leite, por favor não coma essa pizza", "5" ));
        pizzas.add(new Pizza("Curte pizza de catupiry ?", R.drawable.catupiry, "R$ 12,00", "Pizza de Catupiry","ingredientes", "alergicos", "5"));
        pizzas.add(new Pizza("Vai uma portuguesa ?", R.drawable.portuguesa, "R$ 13,00", "Pizza de portuguesa","ingredientes", "alergicos", "5" ));
        pizzas.add(new Pizza("Uhm... e a de chocolate ?", R.drawable.chocolate, "R$ 14,00", "Pizza de Chocolate","ingredientes", "alergicos", "5" ));
        pizzas.add(new Pizza("Topa uma de hotdog ?", R.drawable.hotdog, "R$ 15,00", "Pizza de Cachorro Quente","ingredientes", "alergicos", "5" ));

        return pizzas;
    }
}
