package com.example.mymultifragapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymultifragapplication.databinding.FragmentInputBinding

class InputFragment() : Fragment() {
    var text: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }*/
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentInputBinding.inflate(inflater, container, false)
        binding.editText.setText(text)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(str: String) =
            InputFragment().apply {
                arguments = Bundle().apply {
                    putString("Text",str)
                }
            }
    }
}