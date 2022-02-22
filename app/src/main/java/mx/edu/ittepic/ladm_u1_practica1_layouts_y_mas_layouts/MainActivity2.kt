package mx.edu.ittepic.ladm_u1_practica1_layouts_y_mas_layouts

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import mx.edu.ittepic.ladm_u1_practica1_layouts_y_mas_layouts.ui.main.SectionsPagerAdapter
import mx.edu.ittepic.ladm_u1_practica1_layouts_y_mas_layouts.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab

        fab.setOnClickListener { view ->
            abrirConfiguracion()
        }
    }
    fun abrirConfiguracion(){
        val otraVentana = Intent(this,SettingsActivity::class.java)
        startActivity(otraVentana)
    }
}