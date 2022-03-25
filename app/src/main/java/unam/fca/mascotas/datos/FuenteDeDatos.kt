package unam.fca.mascotas.datos

import unam.fca.mascotas.*
import unam.fca.mascotas.modelo.Animal
import unam.fca.mascotas.modelo.Ave
import unam.fca.mascotas.modelo.Gato
import unam.fca.mascotas.modelo.Perro

class FuenteDeDatos {
    fun getPerros(): MutableList<Animal> {
        return mutableListOf(
            Perro(R.mipmap.presa, "Presa canario", "1000"),
            Perro(R.mipmap.pastor, "Pastor aleman", "2000"),
            Perro(R.mipmap.boston, "Boston terrier", "3000"),
            Perro(R.mipmap.husky, "Husky siveriano", "4000"),
            Perro(R.mipmap.golden, "Golden retriever", "5000"),
            Perro(R.mipmap.pitbull, "Pitbull", "6000"),
            Perro(R.mipmap.pug, "Pug", "7000"),
            Perro(R.mipmap.sabueso, "Sabueso", "8000"),
            Perro(R.mipmap.poodle, "Poodle", "9000"),
            Perro(R.mipmap.rottweiler, "Rottweiler", "10000")
        )

    }

    fun getGatos(): MutableList<Animal> {
        return mutableListOf(
            Gato(R.mipmap.egipcio, "Egipcio", "1000"),
            Gato(R.mipmap.abisinio, "Abisinio", "2000"),
            Gato(R.mipmap.burmes, "Burmes", "3000"),
            Gato(R.mipmap.esfinge, "Esfinge", "4000"),
            Gato(R.mipmap.siberiano, "Siberiano", "5000"),
            Gato(R.mipmap.siames, "Siames", "6000"),
            Gato(R.mipmap.ocicat, "Ocicat", "7000"),
            Gato(R.mipmap.japones, "Japones", "8000"),
            Gato(R.mipmap.somali, "Somali", "9000"),
            Gato(R.mipmap.korata, "Korata", "10000")
        )
    }

    fun getAves(): MutableList<Animal> {
        return mutableListOf(
            Ave(R.mipmap.lechuza, "Lechuza", "1000"),
            Ave(R.mipmap.ganzo, "Ganzo", "2000"),
            Ave(R.mipmap.koel, "Koel", "3000"),
            Ave(R.mipmap.garza, "Garza", "4000"),
            Ave(R.mipmap.urraca, "Urraca", "5000"),
            Ave(R.mipmap.golondrina, "Golondrina", "6000"),
            Ave(R.mipmap.canario, "Canario", "7000"),
            Ave(R.mipmap.frailecillo, "Frailecillo", "8000"),
            Ave(R.mipmap.condor, "Condor", "9000"),
            Ave(R.mipmap.loro, "Loro", "10000")
        )
    }
}