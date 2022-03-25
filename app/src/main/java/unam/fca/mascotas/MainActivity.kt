package unam.fca.mascotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import unam.fca.mascotas.adaptador.AdaptadorGrid
import unam.fca.mascotas.datos.FuenteDeDatos
import unam.fca.mascotas.modelo.Ave
import unam.fca.mascotas.modelo.Gato
import unam.fca.mascotas.modelo.Perro

class MainActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private lateinit var gridPerros: GridView
    private lateinit var gridGatos: GridView
    private lateinit var gridAves: GridView
    private val listaDePerros = FuenteDeDatos().getPerros()
    private val listaDeGatos = FuenteDeDatos().getGatos()
    private val listaDeAves = FuenteDeDatos().getAves()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinVista)
        gridPerros = findViewById(R.id.gridPerro)
        gridGatos = findViewById(R.id.gridGato)
        gridAves = findViewById(R.id.gridAve)

        iniciarSpinner()
        iniciarGridPerros()
        iniciarGridGatos()
        iniciarGridAves()
    }

    private fun iniciarSpinner() {
        spinner.adapter = ArrayAdapter(
            this,
            androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
            resources.getStringArray(R.array.categoria)
        )

        spinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    when (p2) {
                        0 -> {
                            gridPerros.visibility = View.VISIBLE
                            gridGatos.visibility = View.INVISIBLE
                            gridAves.visibility = View.INVISIBLE
                        }
                        1 -> {
                            gridPerros.visibility = View.INVISIBLE
                            gridGatos.visibility = View.VISIBLE
                            gridAves.visibility = View.INVISIBLE
                        }
                        2 -> {
                            gridPerros.visibility = View.INVISIBLE
                            gridGatos.visibility = View.INVISIBLE
                            gridAves.visibility = View.VISIBLE
                        }
                    }
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {}
            }
    }


    private fun iniciarGridPerros() {
        gridPerros.adapter = AdaptadorGrid(this, listaDePerros)
        gridPerros.setOnItemClickListener { adapterView, view, i, l ->
            val perro = adapterView.getItemAtPosition(i) as Perro
            Toast.makeText(
                this, "Perro: " + perro.nombre + ", " +
                        perro.numero, Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun iniciarGridGatos() {
        gridGatos.adapter = AdaptadorGrid(this, listaDeGatos)
        gridGatos.setOnItemClickListener { adapterView, view, i, l ->
            val gato = adapterView.getItemAtPosition(i) as Gato
            Toast.makeText(
                this, "Gato: " + gato.nombre + ", " +
                        gato.numero, Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun iniciarGridAves() {
        gridAves.adapter = AdaptadorGrid(this, listaDeAves)
        gridAves.setOnItemClickListener { adapterView, view, i, l ->
            val ave = adapterView.getItemAtPosition(i) as Ave
            Toast.makeText(
                this, "Ave: " + ave.nombre + ", " +
                        ave.numero, Toast.LENGTH_LONG
            ).show()
        }
    }
}