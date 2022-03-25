package unam.fca.mascotas.adaptador

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import unam.fca.mascotas.modelo.Animal
import unam.fca.mascotas.R

class AdaptadorGrid(
    private val context: Context,
    private val animales: MutableList<Animal>

) : BaseAdapter() {

    override fun getCount(): Int {
        return animales.size
    }

    override fun getItem(p0: Int): Any {
        return animales[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = p1
        val holder: ItemHolder
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item, null)
            holder = ItemHolder(view)
            view.tag = holder
        } else {
            holder = view.tag as ItemHolder
        }

        val animal: Animal = animales[p0]
        holder.imagen.setImageResource(animal.imagen)
        holder.nombre.text = animal.nombre
        holder.numero.text = animal.numero

        return view as View
    }

    internal class ItemHolder(view: View) {
        var imagen: ImageView = view.findViewById(R.id.imagen)
        var nombre: TextView = view.findViewById(R.id.nombre)
        var numero: TextView = view.findViewById(R.id.numero)
    }

}