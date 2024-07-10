package com.example.recyclerview_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view.ItemModel
import com.example.recycler_view.MyAdapter
import com.example.recyclerview_task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList : List<ItemModel> = listOf(
            ItemModel(
                "background 1",
                "@drawable/img_1"
            ),
            ItemModel(
                "background 2",
                "@drawable/img_2"
            ),
            ItemModel(
                "background 3",
                "@drawable/img_3"
            ),
            ItemModel(
                "background 4",
                "@drawable/img_4"
            ),
            ItemModel(
                "background 5",
                "@drawable/img_5"
            ),
            ItemModel(
                "background 6",
                "@drawable/img_6"
            )

        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(itemList)



    }
}
