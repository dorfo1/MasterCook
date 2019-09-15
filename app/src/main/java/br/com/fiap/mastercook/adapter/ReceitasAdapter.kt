package br.com.fiap.mastercook.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.mastercook.R
import br.com.fiap.mastercook.model.Receita
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_receita.view.*
import kotlinx.android.synthetic.main.row_receita_promocional.view.*

class ReceitasAdapter(var receitas: List<Receita>) :
    RecyclerView.Adapter<ReceitasAdapter.ReceitasHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitasHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_receita, parent, false)
        return ReceitasHolder(view)
    }

    override fun getItemCount(): Int {
        return receitas.size
    }

    override fun onBindViewHolder(holder: ReceitasHolder, position: Int) {
        holder.itemView.receita_nome.text = receitas[position].title
        var imageURL = receitas[position].imageURL
        Glide.with(holder.itemView).load(imageURL).into(holder.itemView.receita_iv)
        holder.itemView.receita_rating.text = receitas[position].rating.toString()
    }


    class ReceitasHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}