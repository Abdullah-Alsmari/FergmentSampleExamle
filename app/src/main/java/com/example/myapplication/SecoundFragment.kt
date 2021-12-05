package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding.inflate
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.databinding.FragmentSecoundBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SecoundFragment : Fragment() {
    private lateinit var letterId: String

    private var _binding: FragmentSecoundBinding? = null
    val INFO = "info"

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(context, "SecoundFragmentx", Toast.LENGTH_SHORT).show()
        _binding = FragmentSecoundBinding.inflate(inflater, container, false)
        return binding.root

        arguments?.let {
            letterId = it.getString(INFO).toString()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val text2 = binding.text2


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(
            true

        )
    }


}