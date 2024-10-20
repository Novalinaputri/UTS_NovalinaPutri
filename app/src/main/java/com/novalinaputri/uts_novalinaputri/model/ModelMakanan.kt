package com.novalinaputri.uts_novalinaputri.model

import com.novalinaputri.uts_novalinaputri.R

data class ModelMakanan(
    val image: Int,
    val judul: String,
    val harga: String
)
object Mocklist{
    fun getModel(): List<ModelMakanan>{
        val item1 = ModelMakanan(
            R.drawable.makananlima, judul = "Seblak", harga = "RP.20.000/Porsi"
        )
        val item2 = ModelMakanan(
            R.drawable.mieayam, judul="Mie Ayam", harga = "RP.15.000/Porsi"
        )
        val item3 = ModelMakanan(
            R.drawable.makananempat, judul ="Rendang", harga = "RP.20.000/Porsi"
        )
        val item4 = ModelMakanan(
            R.drawable.sateayam, judul="Sate Ayam",  harga = "RP.20.000/Porsi"
        )

        val itemList:ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        return itemList

    }
}