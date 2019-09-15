package br.com.fiap.mastercook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.mastercook.R
import br.com.fiap.mastercook.model.Ingrediente
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_ingrediente.view.*

class IngredienteAdapter(var ingredientes:List<Ingrediente>) : RecyclerView.Adapter<IngredienteAdapter.IngredienteViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredienteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_ingrediente,parent,false)
        return IngredienteViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ingredientes.size
    }

    override fun onBindViewHolder(holder: IngredienteViewHolder, position: Int) {
        var ingrediente = ingredientes[position]
        holder.itemView.ingrediente_nome.text = ingrediente.nome
        Glide.with(holder.itemView).load(ingrediente.imageURL).into(holder.itemView.ingrediente_iv)
    }

    class IngredienteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}