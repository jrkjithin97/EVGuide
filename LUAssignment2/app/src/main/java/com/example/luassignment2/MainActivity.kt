package com.example.luassignment2

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
        var flag = "car"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val overViewBtn: Button = findViewById(R.id.btnoverview)
        val detailsBtn: Button = findViewById(R.id.btndetails)

        val carOverviewFragment = car_overview()
        val carDetailsFragment = car_details()




        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_frame_layout, carOverviewFragment)
            commit()
        }
        overViewBtn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.main_frame_layout, carOverviewFragment)
                commit()
            }
        }
        detailsBtn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.main_frame_layout, carDetailsFragment)
                commit()
            }
        }





    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
// Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val carOverviewFragment = car_overview()
        val carDetailsFragment = car_details()
        val bikeOverviewFragment = bike_overview()
        val bikeDetailsFragment = bike_details()
        val overViewBtn: Button = findViewById(R.id.btnoverview)
        val detailsBtn: Button = findViewById(R.id.btndetails)
        val imageView: ImageView = findViewById(R.id.imageView)
        val main_headline: TextView = findViewById(R.id.main_headline)
        when(item.itemId){
            R.id.it_car ->{
                main_headline.text = "Electric Car"
                imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_electric_car_24));


                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.main_frame_layout, carOverviewFragment)
                    commit()
                }
                overViewBtn.setOnClickListener{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.main_frame_layout, carOverviewFragment)
                        commit()
                    }
                }
                detailsBtn.setOnClickListener{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.main_frame_layout, carDetailsFragment)
                        commit()
                    }
                }



            }
            R.id.it_bike -> {

                main_headline.text = "Electric Bike"
                imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.baseline_electric_bike_24));

                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.main_frame_layout, bikeOverviewFragment)
                    commit()
                }
                overViewBtn.setOnClickListener{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.main_frame_layout, bikeOverviewFragment)
                        commit()
                    }
                }
                detailsBtn.setOnClickListener{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.main_frame_layout, bikeDetailsFragment)
                        commit()
                    }
                }

            }

        }
        return true;
    }




}