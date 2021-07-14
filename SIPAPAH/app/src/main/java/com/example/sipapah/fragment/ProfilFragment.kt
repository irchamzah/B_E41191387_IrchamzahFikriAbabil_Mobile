package com.example.sipapah.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.sipapah.MainActivity
import com.example.sipapah.R
import com.example.sipapah.helper.SharedPref


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfilFragment : Fragment() {

    lateinit var sp:SharedPref
    lateinit var btnLogout:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_profil, container, false)
        btnLogout = view.findViewById(R.id.btn_logout)

        sp = SharedPref(activity!!)

        btnLogout.setOnClickListener{
            sp.setStatusLogin(false)
        }

        return view
    }

}