package com.example.sipapah.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sipapah.R

/**
 * A simple [Fragment] subclass.
 * Use the [KreasiFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class KreasiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kreasi, container, false)
    }
}