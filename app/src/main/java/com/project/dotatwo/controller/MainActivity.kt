package com.project.dotatwo.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.project.dotatwo.R
import com.project.dotatwo.controller.fragments.FragmentHeroesList
import com.project.dotatwo.controller.fragments.FragmentTeamsList
import com.project.dotatwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.navigationTeams -> {
                    val teamsFragment = FragmentTeamsList.newInstance()
                    openFragment(teamsFragment)
                    true
                }
                R.id.navigationHeroes -> {
                    val heroesFragment = FragmentHeroesList.newInstance()
                    openFragment(heroesFragment)
                    true
                }
                else -> false
            }
        }
    }

    private fun openFragment(fragment : Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}