package com.example.extendedproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewpagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(supportFragmentManager) {

        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        TODO("Not yet implemented")

        return mFragmentList[position]
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
        return mFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }

    fun addFragment(fragment:Fragment,title:String){
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

}