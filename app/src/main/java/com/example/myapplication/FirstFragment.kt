package com.example.myapplication

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.FragmentFirstBinding
import org.w3c.dom.Text



class FirstFragment : Fragment() {
    private var binding:FragmentFirstBinding ? = null
    private lateinit var button: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(context, "one fragment", Toast.LENGTH_SHORT).show()
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button = binding!!.button
        button.setOnClickListener {     val action = FirstFragmentDirections.actionFirstFragment2ToSecoundFragment("abdullah" )
            view.findNavController().navigate(action) }


    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null


    }
    companion object{
        const val INFO="info"
    }

}