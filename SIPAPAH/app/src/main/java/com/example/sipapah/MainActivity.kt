package com.example.sipapah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.sipapah.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val fragmentHome: Fragment = HomeFragment()
    private val fragmentKreasi: Fragment = KreasiFragment()
    private val fragmentLayanan: Fragment = LayananFragment()
    private val fragmentNotifikasi: Fragment = NotifikasiFragment()
    private val fragmentProfil: Fragment = ProfilFragment()
    private val fm: FragmentManager = supportFragmentManager
    private var activeFragment: Fragment = fragmentHome

    private lateinit var menu: Menu
    private lateinit var menuItem: MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpBottomNav()
    }

    fun setUpBottomNav(){
        fm.beginTransaction().add(R.id.container, fragmentHome).show(fragmentHome).commit()
        fm.beginTransaction().add(R.id.container, fragmentKreasi).hide(fragmentKreasi).commit()
        fm.beginTransaction().add(R.id.container, fragmentLayanan).hide(fragmentLayanan).commit()
        fm.beginTransaction().add(R.id.container, fragmentNotifikasi).hide(fragmentNotifikasi).commit()
        fm.beginTransaction().add(R.id.container, fragmentProfil).hide(fragmentProfil).commit()

        bottomNavigationView = findViewById(R.id.nav_view)
        menu = bottomNavigationView.menu
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->

            when(item.itemId) {
                R.id.navigation_home->{
                    panggilFragment(0, fragmentHome)
                }
                R.id.navigation_layanan->{
                    panggilFragment(1, fragmentLayanan)
                }
                R.id.navigation_kreasi->{
                    panggilFragment(2, fragmentKreasi)
                }
                R.id.navigation_notifikasi->{
                    panggilFragment(3, fragmentNotifikasi)
                }
                R.id.navigation_profil->{
                    panggilFragment(4, fragmentProfil)
                }
            }

            false
        }
    }

    fun panggilFragment(int: Int, fragment: Fragment){
        menuItem = menu.getItem(int)
        menuItem.isChecked = true
        fm.beginTransaction().hide(activeFragment).show(fragment).commit()
        activeFragment = fragment
    }
}