package com.example.luassignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.luassignment2.databinding.CarOverviewLayoutBinding


class car_overview : Fragment(R.layout.car_overview_layout) {

    private var _binding: CarOverviewLayoutBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CarOverviewLayoutBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.overviewText.text = ""

        var flagInp = "Introduction"
        var search_string=""
        var temp = ""
        var spinnerVar: Spinner = binding.spinnerOverview
        var sp_options = arrayOf("Introduction", "Types")
        spinnerVar.adapter =
            ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1, sp_options)


        spinnerVar.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flagInp = sp_options.get(p2)
                if (flagInp == "Introduction") {


                    temp = "Electric cars, or electric vehicles (EVs), are powered by" +
                            " electric motors and use electricity stored in batteries as " +
                            "their primary energy source. They are known for being quieter, " +
                            "more efficient, and producing zero tailpipe emissions compared to " +
                            "traditional internal combustion engine vehicles. EVs come in various forms, " +
                            "including battery electric vehicles (BEVs) and plug-in hybrids (PHEVs). " +
                            "The global market for EVs is rapidly growing, with significant sales increases " +
                            "and government incentives promoting their adoption."

                    binding.overviewText.text = temp

                }
                else {

                    temp = "1. Battery Electric Vehicles (BEVs)\n" +
                            "Example: Tesla Model S\n"+
                            "\n2. Plug-in Hybrid Electric Vehicles (PHEVs)\n"+
                            "Example: Toyota Prius Prime\n" +
                            "\n3. Hybrid Electric Vehicles (HEVs)\n"+
                            "Examples: Toyota Prius\n"+
                            "\n4. Extended Range Electric Vehicles (EREVs)\n"+
                            "Examples: BMW i3 REx\n"+
                            "\n5. Fuel Cell Electric Vehicles (FCEVs)\n"+
                            "Examples: Toyota Mirai"

                    binding.overviewText.text = temp

                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }


        binding.searchBtn.setOnClickListener{
            search_string = binding.searchBox.text.toString()
            if(search_string=="Introduction"){

                temp = "Electric cars, or electric vehicles (EVs), are powered by" +
                        " electric motors and use electricity stored in batteries as " +
                        "their primary energy source. They are known for being quieter, " +
                        "more efficient, and producing zero tailpipe emissions compared to " +
                        "traditional internal combustion engine vehicles. EVs come in various forms, " +
                        "including battery electric vehicles (BEVs) and plug-in hybrids (PHEVs). " +
                        "The global market for EVs is rapidly growing, with significant sales increases " +
                        "and government incentives promoting their adoption."

                binding.overviewText.text = temp

            }
            else if(search_string=="Types"){

                temp = "1. Battery Electric Vehicles (BEVs)\n" +
                        "Example: Tesla Model S\n"+
                        "\n2. Plug-in Hybrid Electric Vehicles (PHEVs)\n"+
                        "Example: Toyota Prius Prime\n" +
                        "\n3. Hybrid Electric Vehicles (HEVs)\n"+
                        "Examples: Toyota Prius\n"+
                        "\n4. Extended Range Electric Vehicles (EREVs)\n"+
                        "Examples: BMW i3 REx\n"+
                        "\n5. Fuel Cell Electric Vehicles (FCEVs)\n"+
                        "Examples: Toyota Mirai"

                binding.overviewText.text = temp
            }
            else{

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


