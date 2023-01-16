package com.example.fragmentvversion1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentvversion1.databinding.AdditionfragmentViewBinding

class AdditionFragment: Fragment() {
    private lateinit var binding: AdditionfragmentViewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=AdditionfragmentViewBinding.inflate(inflater)
        binding.button.setOnClickListener(View.OnClickListener {
            var one= Integer.parseInt(binding.edtOne.text.toString())
            var two=Integer.parseInt(binding.edtTwo.text.toString())
            var result=one +two
            binding.textView.text= result.toString()
        })
        return binding.root
    }

   /* private lateinit var edtOne:EditText
    private lateinit var edtTwo:EditText
    private lateinit var textView:TextView
    private lateinit var button:Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var additionFragment=inflater.inflate(R.layout.additionfragment_view,null)
        initView(additionFragment)
        initListener()
        return additionFragment
    }

    private fun initListener() {
        button.setOnClickListener(View.OnClickListener {
            textView.text=""+ edtOne.text+edtTwo.text
        })
    }

    private fun initView(view: View) {
        edtOne=view.findViewById(R.id.edtOne)
        edtTwo=view.findViewById(R.id.edtTwo)
        textView=view.findViewById(R.id.textView)
        button=view.findViewById(R.id.button)

    }*/
}