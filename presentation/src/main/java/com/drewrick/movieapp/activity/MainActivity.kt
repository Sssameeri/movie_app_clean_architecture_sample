package com.drewrick.movieapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.drewrick.movieapp.R
import com.drewrick.movieapp.databinding.ActivityMainBinding
import com.drewrick.movieapp.fragment.FavouritesFragment
import com.drewrick.movieapp.fragment.FilmsFragment
import com.google.android.material.tabs.TabLayoutMediator
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        val pagerAdapter = PagerAdapter(this)

        binding.vpMovies.adapter = pagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.vpMovies) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.films)
                }
                else -> {
                    tab.text = getString(R.string.favourites)
                }
            }
        }.attach()

    }

    class PagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {

        private val fragmentsList = arrayListOf(
            FilmsFragment.getInstance(),
            FavouritesFragment.getInstance()
        )

        override fun getItemCount() = fragmentsList.size

        override fun createFragment(position: Int) = fragmentsList[position]
    }
}