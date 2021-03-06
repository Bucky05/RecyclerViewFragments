package com.codingblocks.recyclerviewfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_learn.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [learn.newInstance] factory method to
 * create an instance of this fragment.
 */
class learn : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<recyclerAdapter.ViewHolder>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        //recyclerview.layoutManager = LinearLayoutManager(activity,RecyclerView.HORIZONTAL,false)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_learn, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val topics:ArrayList<String> = ArrayList()
        for(i in 1..100)
        {
            topics.add("Bike # $i")
        }
            recyclerview.apply {
                // set a LinearLayoutManager to handle Android
                // RecyclerView behavior
                layoutManager = LinearLayoutManager(activity,RecyclerView.HORIZONTAL,false)
                // set the custom adapter to the RecyclerView
                adapter = recyclerAdapter(topics)}
        }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment learn.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            learn().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}