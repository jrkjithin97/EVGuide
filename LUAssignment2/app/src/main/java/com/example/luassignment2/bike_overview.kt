package com.example.luassignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.luassignment2.databinding.BikeOverviewLayoutBinding
import com.example.luassignment2.databinding.CarOverviewLayoutBinding


class bike_overview : Fragment(R.layout.bike_overview_layout) {

    private var _binding: BikeOverviewLayoutBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BikeOverviewLayoutBinding.inflate(inflater, container, false)
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


                    temp = "Electric bikes, or e-bikes, combine traditional pedaling with an electric motor to assist with propulsion. "+
                            "They come in various styles, including city, mountain, and folding bikes, and typically feature a battery "+
                            "that powers the motor. Riders can adjust the level of assistance, making e-bikes suitable for commuting, "+
                            "recreation, and tackling hilly terrain. They offer a more eco-friendly alternative to cars and can help "+
                            "reduce commuting time. E-bikes vary in range, speed, and price, but all aim to enhance the cycling experience "+
                            "with added power and convenience."

                    binding.overviewText.text = temp

                }
                else {

                    temp = "1. City E-Bikes:\n"+
                            "Example: Rad Power Bikes RadCity\n"+
                            "\n2. Mountain E-Bikes:\n"+
                            "Example: Trek Powerfly\n"+
                            "\n3. Road E-Bikes:\n"+
                            "Example: Specialized Turbo Creo SL\n"+
                            "\n4. Folding E-Bikes:\n"+
                            "Example: Brompton Electric\n"+
                            "\n5. Cargo E-Bikes:\n"+
                            "Example: Yuba Mundo\n"+
                            "\n6. Hybrid E-Bikes:\n"+
                            "Example: Giant Quick E+"

                    binding.overviewText.text = temp

                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }


        binding.searchBtn.setOnClickListener{
            search_string = binding.searchBox.text.toString()
            if(search_string=="Introduction"){

                temp = "Electric bikes, or e-bikes, combine traditional pedaling with an electric motor to assist with propulsion. "+
                        "They come in various styles, including city, mountain, and folding bikes, and typically feature a battery "+
                        "that powers the motor. Riders can adjust the level of assistance, making e-bikes suitable for commuting, "+
                        "recreation, and tackling hilly terrain. They offer a more eco-friendly alternative to cars and can help "+
                        "reduce commuting time. E-bikes vary in range, speed, and price, but all aim to enhance the cycling experience "+
                        "with added power and convenience."

                binding.overviewText.text = temp

            }
            else if(search_string=="Types"){

                temp = "1. City E-Bikes:\n"+
                        "Example: Rad Power Bikes RadCity\n"+
                        "\n2. Mountain E-Bikes:\n"+
                        "Example: Trek Powerfly\n"+
                        "\n3. Road E-Bikes:\n"+
                        "Example: Specialized Turbo Creo SL\n"+
                        "\n4. Folding E-Bikes:\n"+
                        "Example: Brompton Electric\n"+
                        "\n5. Cargo E-Bikes:\n"+
                        "Example: Yuba Mundo\n"+
                        "\n6. Hybrid E-Bikes:\n"+
                        "Example: Giant Quick E+"

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


