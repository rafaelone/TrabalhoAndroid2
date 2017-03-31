package br.com.fiap.exercicios.listview.RM77722;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by casa on 30/03/17.
 */

public class GerarPizza {

    public static List<Pizza> listaPizzas(){
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("Famosa pizza de Mussarela", R.drawable.mussarela, "R$ 10,00", "Pizza de Mussarela",
                "Queijo de mussarela\n" +
                        "\n" +
                "Tomate\n" +
                        "\n" +
                "Azeitona verde\n" +
                        "\n" +
                "Orégano",
                "Se você tem alergia a alguns produtos derivados de leite, por favor não coma essa pizza", 4 ));

        pizzas.add(new Pizza("Aquela pizza de calabresa ", R.drawable.calabresa, "R$ 11,00", "Pizza de Calabresa",

                "Tomate \n" +
                        "\n" +
                "Queijo Parmesão Ralado\n" +
                        "\n" +
                "Sal\n" +
                        "\n" +
                "Orégano\n" +
                        "\n" +
                "Linguiça Calabresa\n" +
                        "\n" +
                "Cebola\n" +
                        "\n" +
                "Azeitona Preta\n",
                "Se você tem alergia a alguns produtos derivados de leite, por favor não coma essa pizza", 3 ));

        pizzas.add(new Pizza("Curte pizza de catupiry ?", R.drawable.catupiry, "R$ 12,00", "Pizza de Catupiry",
                " Orégano\n" +
                "\n" +
                "Pimenta do reino\n" +
                "\n" +
                "Queijo catupiry\n" +
                "\n" +
                "Sal\n" +
                "\n" +
                "Tomate\n" +
                "\n" +
                "Azeitonas pretas ",
                "Se você tem alergia a alguns produtos derivados de leite, por favor não coma essa pizza", 5));

        pizzas.add(new Pizza("Vai uma portuguesa ?", R.drawable.portuguesa, "R$ 13,00", "Pizza de portuguesa",
                "Queijo mussarela\n" +
                        "\n" +
                        "Presunto\n" +
                        "\n" +
                        "Tomate\n" +
                        "\n" +
                        "Ovo\n" +
                        "\n" +
                        "Cebola\n" +
                        "\n" +
                        "Azeitona",
                "Se você tem algum problema quando come presunto, por favor, retire o presunto na hora de comer", 5 ));
        pizzas.add(new Pizza("Uhm... e a de chocolate ?", R.drawable.chocolate, "R$ 14,00", "Pizza de Chocolate",
                "Creme de leite\n" +
                        "\n" +
                        "Chocolate meio amargo", "Se você tem alergia a alguns produtor derivados do leite, por favor não coma essa pizza", 3 ));
        pizzas.add(new Pizza("Topa uma de hotdog ?", R.drawable.hotdog, "R$ 15,00", "Pizza de Cachorro Quente",
                "Pure de batatas\n" +
                        "\n" +
                        "Tomate\n" +
                        "\n" +
                        "Oregano\n" +
                        "\n" +
                        "Queijo\n" +
                        "\n" +
                        "Catupiry\n" +
                        "\n" +
                        "Salsichas\n" +
                        "\n" +
                        "Batata palha",
                        "Se você tem alergia a alguns produtos derivados do leite, por favor não coma essa pizza", 1 ));

        return pizzas;
    }
}
