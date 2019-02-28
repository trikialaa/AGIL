package com.looboo.agil

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import com.looboo.agil.Utils.EffectuerCommandeFragment

class MainViewPager internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm){
    private val COUNT = 3

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = AccueilFragment()
        }

        return fragment
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }


}