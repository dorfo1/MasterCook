package br.com.fiap.mastercook.ui.main.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter

import br.com.fiap.mastercook.R
import br.com.fiap.mastercook.adapter.TabsAdapter
import br.com.fiap.mastercook.ui.main.tabs.FragmentTabLista
import br.com.fiap.mastercook.ui.main.tabs.FragmentTodasReceitas
import kotlinx.android.synthetic.main.fragment_receitas.*


class ReceitasFragment : Fragment() {

    private lateinit var adapter: TabsAdapter;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_receitas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        adapter = fragmentManager?.let { TabsAdapter(it) }!!
        adapter.add(FragmentTodasReceitas(),resources.getString(R.string.tab_todas))
        adapter.add(FragmentTabLista(),resources.getString(R.string.tab_novidades))
        adapter.add(FragmentTabLista(),resources.getString(R.string.tab_populares))
        adapter.add(FragmentTabLista(),resources.getString(R.string.tab_saudavel))
        viewpager.adapter = adapter
        tabLayout.setupWithViewPager(viewpager)
    }


}
