package com.example.uts201804007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rycleview_card.*

class RycleviewCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rycleview_card)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Adidas", "Jamaica Uk 42", R.drawable.sepatu1))
        arrayList.add(Model("Adidas", "SL72 Uk 41", R.drawable.sepatu2))
        arrayList.add(Model("Adidas", "SL72 Uk 42", R.drawable.sepatu3))
        arrayList.add(Model("Adidas", "Spezial Uk 41", R.drawable.sepatu4))
        arrayList.add(Model("Adidas", "Jeans Uk 43", R.drawable.sepatu5))
        arrayList.add(Model("Adidas", "Jeans Uk 44", R.drawable.sepatu6))
        arrayList.add(Model("Adidas", "Jeans Uk 45", R.drawable.sepatu7))
        arrayList.add(Model("Adidas", "Jeans Uk 42", R.drawable.sepatu8))
        arrayList.add(Model("Adidas", "Jeans Uk 39", R.drawable.sepatu9))
        arrayList.add(Model("Adidas", "Jeans Uk 44", R.drawable.sepatu10))
        arrayList.add(Model("Adidas", "Jeans Uk 38", R.drawable.sepatu11))

        val  myAdapter = MyAdapter(arrayList, this)

        recyleview.layoutManager = LinearLayoutManager(this)
        recyleview.adapter = myAdapter
    }
}