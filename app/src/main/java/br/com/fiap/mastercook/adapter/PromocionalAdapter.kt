package br.com.fiap.mastercook.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.mastercook.R
import br.com.fiap.mastercook.model.Receita
import com.bumptech.glide.Glide
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_receita_promocional.view.*
import java.lang.Exception

class PromocionalAdapter(var recipes: List<Receita>) :
    RecyclerView.Adapter<PromocionalAdapter.PromocionalHoder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromocionalHoder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_receita_promocional, parent, false)

        var lParams = view.layoutParams
        var width = (parent.context.resources.displayMetrics.widthPixels * .9).toInt()
        lParams.width = width
        view.layoutParams = lParams
        Log.d("parent width",parent.width.toString())
        Log.d("width",view.layoutParams.width.toString())

        return PromocionalHoder(view)
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    override fun onBindViewHolder(holder: PromocionalHoder, position: Int) {
        holder.itemView.tv_promocional_nome.text = recipes[position].title
        var imageURL = recipes[position].imageURL
        Glide.with(holder.itemView).load(imageURL).into(holder.itemView.iv_promocional)
        holder.itemView.tv_promocional_dificuldade.text = recipes[position].dificuldade.name
        holder.itemView.tv_promocional_rating.text = recipes[position].rating.toString()
    }


    class PromocionalHoder(itemView: View) : RecyclerView.ViewHolder(itemView)

}