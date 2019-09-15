package br.com.fiap.mastercook.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabsAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){

    private var tabsFrag : MutableList<Fragment> = ArrayList()
    private var titles : MutableList<String> = ArrayList()


    fun add(tab:Fragment,title:String){
        tabsFrag.add(tab)
        titles.add(title)
    }

    override fun getItem(position: Int): Fragment {
       return tabsFrag[position]
    }

    override fun getCount(): Int {
       return tabsFrag.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }


}