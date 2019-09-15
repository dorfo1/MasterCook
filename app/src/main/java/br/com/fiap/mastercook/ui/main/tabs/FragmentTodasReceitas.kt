package br.com.fiap.mastercook.ui.main.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.fiap.mastercook.R
import br.com.fiap.mastercook.adapter.PromocionalAdapter
import br.com.fiap.mastercook.adapter.ReceitasAdapter
import br.com.fiap.mastercook.model.Dificuldade
import br.com.fiap.mastercook.model.Receita
import kotlinx.android.synthetic.main.fragment_todas_receitas.*

class FragmentTodasReceitas : Fragment() {

    lateinit var promocionalAdapter: PromocionalAdapter
    lateinit var receitasAdapter: ReceitasAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_todas_receitas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var receitas: List<Receita> = gerarListaPromocionais()

        promocionalAdapter = PromocionalAdapter(receitas)
        rv_receitas_promocionais.adapter = promocionalAdapter
        rv_receitas_promocionais.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        receitasAdapter = ReceitasAdapter(gerarListaGosto())
        rv_receitas_gosto.adapter = receitasAdapter
        rv_receitas_gosto.layoutManager = LinearLayoutManager(context)

    }

    private fun gerarListaPromocionais(): List<Receita> {
        return ArrayList<Receita>(
            arrayListOf(
                Receita(
                    "Pavê de nutella",
                    4.5,
                    Dificuldade.Fácil,
                    "https://guiadacozinha.com.br/wp-content/uploads/2016/01/pave-nutella.jpg"
                ),
                Receita(
                    "Bolo de prestígio",
                    4.7,
                    Dificuldade.Médio,
                    "https://img.itdg.com.br/tdg/images/recipes/000/051/484/111099/111099_original.jpg?mode=crop&width=710&height=400"
                ),
                Receita(
                    "Pavê de nutella",
                    4.8,
                    Dificuldade.Médio,
                    "https://guiadacozinha.com.br/wp-content/uploads/2016/01/pave-nutella.jpg"
                )
            )
        )
    }


    private fun gerarListaGosto(): List<Receita> {
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
                    "Frango à passarinho",
                    4.8,
                    Dificuldade.Médio,
                    "https://img.itdg.com.br/tdg/images/recipes/000/111/643/295059/295059_original.jpg?mode=crop&width=710&height=400"
                )
            )
        )
    }


}