package com.example.luassignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.luassignment2.databinding.BikeDetailsLayoutBinding
import com.example.luassignment2.databinding.CarDetailsLayoutBinding
import com.example.luassignment2.databinding.CarOverviewLayoutBinding


class bike_details : Fragment(R.layout.bike_details_layout) {

    private var _binding: BikeDetailsLayoutBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BikeDetailsLayoutBinding.inflate(inflater, container, false)
        val view = binding.root
        var temp=""

        temp="Electric bike engines, or motors, assist with pedaling by providing extra power, making riding "+
                "easier and more efficient. These motors are typically hub-mounted, either in the front or rear "+
                "wheel, or mid-drive, located near the bike's crankset. Hub motors provide direct power to the "+
                "wheel, offering a smoother ride, while mid-drive motors leverage the bike’s gears for better "+
                "performance on hills. Motor power is measured in watts, with common ranges between 250 to 750 watts. "+
                "They work in conjunction with a battery that supplies energy, and riders can adjust the level of "+
                "assistance through controls on the handlebar."

        binding.detailsinfo.text= temp

        binding.detailsRadioGrp.setOnCheckedChangeListener{group,checkedId ->

                when(checkedId){
                    R.id.engine_option ->{
                        temp="Electric bike engines, or motors, assist with pedaling by providing extra power, making riding "+
                                "easier and more efficient. These motors are typically hub-mounted, either in the front or rear "+
                                "wheel, or mid-drive, located near the bike's crankset. Hub motors provide direct power to the "+
                                "wheel, offering a smoother ride, while mid-drive motors leverage the bike’s gears for better "+
                                "performance on hills. Motor power is measured in watts, with common ranges between 250 to 750 watts. "+
                                "They work in conjunction with a battery that supplies energy, and riders can adjust the level of "+
                                "assistance through controls on the handlebar."

                        binding.detailsinfo.text= temp

                    }

                    R.id.charging_option ->{

                        temp="Electric bike charging involves powering the bike’s battery through an electrical outlet. "+
                                "Most e-bike batteries are removable, allowing for convenient off-bike charging. To charge, "+
                                "simply connect the battery to a charger, which plugs into a standard wall socket. Charging "+
                                "times vary based on battery size and charger type, typically ranging from 3 to 8 hours "+
                                "for a full charge. Many modern e-bikes have smart chargers that prevent overcharging and "+
                                "ensure battery longevity. It’s important to follow manufacturer guidelines for charging to" +
                                "maintain battery health and efficiency. Charging infrastructure and accessibility are "+
                                "improving, making e-bike use more practical for daily commutes."

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


