package mx.edu.ittepic.ladm_u1_practica1_layouts_y_mas_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_layouts_y_mas_layouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Como se activa el Binding
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.listamenu.setOnItemClickListener { parent, view, posicion, id ->
            //Position = contiene  el indice del renglon que diste click
            when (posicion) {
                0 -> {
                    abrirConfiguracion()
                }
                1 -> {
                    abrirMasDetalles()
                }
                2 -> {
                    //EL objeto AlertDialog es ESTATICO , igual que JoptionPane no requiere variable
                    AlertDialog.Builder(this)
                        .setTitle("ACERCA DE...")
                        .setMessage("(C) Reservados Carlos Eduardo. Instituto Tecnologico de Tepic")
                        .setPositiveButton("Aceptar",{d,i -> d.dismiss()})
                        .setNegativeButton("Cerrar",{d,i -> d.cancel()})
                        .show()
                }
                3 -> {finish() }
            }
        }
    }


    fun abrirConfiguracion(){
        val otraVentana = Intent(this,SettingsActivity::class.java)
        startActivity(otraVentana)
    }
    fun abrirMasDetalles(){
        val otraVentana = Intent(this,MainActivity2::class.java)
        startActivity(otraVentana)
    }
}