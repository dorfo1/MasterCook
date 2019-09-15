package br.com.fiap.mastercook.ui.main.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import br.com.fiap.mastercook.R
import br.com.fiap.mastercook.adapter.IngredienteAdapter
import br.com.fiap.mastercook.adapter.ReceitasAdapter
import br.com.fiap.mastercook.model.Dificuldade
import br.com.fiap.mastercook.model.Ingrediente
import br.com.fiap.mastercook.model.Receita
import kotlinx.android.synthetic.main.fragment_geladeira.*


class GeladeiraFragment : Fragment() {

    lateinit var ingredienteAdapter: IngredienteAdapter
    lateinit var receitasAdapter: ReceitasAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_geladeira, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        ingredienteAdapter = IngredienteAdapter(gerarIngredientes())
        rv_ingredientes.adapter = ingredienteAdapter
        rv_ingredientes.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        receitasAdapter = ReceitasAdapter(gerarReceitas())
        rv_receitas.adapter = receitasAdapter
        rv_receitas.layoutManager = LinearLayoutManager(context)
    }

    private fun gerarReceitas(): List<Receita> {
        return ArrayList<Receita>(
            arrayListOf(
                Receita(
                    "Panqueca americana",
                    4.5,
                    Dificuldade.Médio,
                    "https://img.itdg.com.br/tdg/images/recipes/000/013/110/283895/283895_original.jpg?mode=crop&width=710&height=400"
                ),
                Receita(
                    "Bolo de cenoura",
                    4.7,
                    Dificuldade.Médio,
                    "https://img.itdg.com.br/tdg/images/recipes/000/000/023/323619/323619_original.jpg?mode=crop&width=710&height=400"
                ),
                Receita(
                    "Bolo Gelado",
                    4.3,
                    Dificuldade.Médio,
                    "https://img.itdg.com.br/tdg/images/recipes/000/002/313/325143/325143_original.jpg?mode=crop&width=710&height=400"
                )
            )
        )
    }

    private fun gerarIngredientes(): List<Ingrediente> {
        return ArrayList<Ingrediente>(
            arrayListOf(
                Ingrediente("Ovos","https://static1.conquistesuavida.com.br/ingredients/0/54/26/70/@/24727--ingredient_detail_ingredient-2.png"),
                Ingrediente("Farinha branca","https://www.brasbol.com.br/img/Farinha-de-Quinoa-300x300.png"),
                Ingrediente("Manteiga","https://img2.gratispng.com/20180324/vzq/kisspng-butter-spread-food-clip-art-butter-png-transparent-images-5ab6fbcbb42a35.615822191521941451738.jpg")
            )
        )
    }


}
