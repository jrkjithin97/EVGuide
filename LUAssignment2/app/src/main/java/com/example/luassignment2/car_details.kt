package com.example.luassignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.luassignment2.databinding.CarDetailsLayoutBinding
import com.example.luassignment2.databinding.CarOverviewLayoutBinding


class car_details : Fragment(R.layout.car_details_layout) {

    private var _binding: CarDetailsLayoutBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CarDetailsLayoutBinding.inflate(inflater, container, false)
        val view = binding.root
        var temp=""

        temp="Electric car engines, known as electric motors, convert electrical energy stored in a " +
                "battery into mechanical energy to drive the vehicle. Unlike internal combustion engines, " +
                "electric motors produce instant torque, providing smooth and rapid acceleration. " +
                "They operate quietly and have fewer moving parts, resulting in lower maintenance costs. " +
                "The battery pack, typically lithium-ion, is charged through external power sources or " +
                "regenerative braking. Electric vehicles (EVs) are more efficient and environmentally friendly, " +
                "producing zero tailpipe emissions, contributing to reduced air pollution and dependence on fossil fuels."

        binding.detailsinfo.text= temp

        binding.detailsRadioGrp.setOnCheckedChangeListener{group,checkedId ->

                when(checkedId){
                    R.id.engine_option ->{
                        temp="Electric car engines, known as electric motors, convert electrical energy stored in a " +
                                "battery into mechanical energy to drive the vehicle. Unlike internal combustion engines, " +
                                "electric motors produce instant torque, providing smooth and rapid acceleration. " +
                                "They operate quietly and have fewer moving parts, resulting in lower maintenance costs. " +
                                "The battery pack, typically lithium-ion, is charged through external power sources or " +
                                "regenerative braking. Electric vehicles (EVs) are more efficient and environmentally friendly, " +
                                "producing zero tailpipe emissions, contributing to reduced air pollution and dependence on fossil fuels."

                        binding.detailsinfo.text= temp

                    }

                    R.id.charging_option ->{

                        temp="Electric car charging involves replenishing the battery's energy through an external power source. "+
                                "There are three main types of charging: Level 1 (standard 120V household outlets), "+
                                "Level 2 (240V outlets found in homes and public stations), and DC Fast Charging (high-powered chargers "+
                                "at public stations providing rapid charging). Charging times vary, with Level 1 taking the longest and "+
                                "DC Fast Charging the shortest. Most electric vehicles (EVs) support multiple charging levels, and "+
                                "charging infrastructure is expanding, including home installations, workplace chargers, and public networks." +
                                "Efficient charging is crucial for EV convenience, range, and overall adoption."

                        binding.detailsinfo.text= temp

                    }
                }
            }




        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val spinnervar: Spinner = findViewById(R.id.spinner_overview)
//        val optionsInp = arrayOf("cm","m")
//        inputunit.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsInp)
//
//    }

//    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
//
//        val spinnervar: Spinner = find
//        val optionsInp = arrayOf("cm","m")
//        inputunit.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsInp)
//
//
//    }


