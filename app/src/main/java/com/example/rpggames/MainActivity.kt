package com.example.rpggames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rpggames.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerViewCharacters: RecyclerView =
            binding.rvActivityMainCharacters //pega o modelo pelo binding

        adapter = Adapter() //inicializa a instancia de Adapter criada

        recyclerViewCharacters.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        ) //define o modelo de lista

        recyclerViewCharacters.setHasFixedSize(true) //da mais desempenho na lista

        recyclerViewCharacters.adapter = adapter //vinculando o adapter ao recyclerview criado

        adapter.setData(list) //Passo os dados pra o adapter
    }

    val list = listOf<CharacterAttributes>(
        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.mage,
            hp = 500,
            defense = 10

        ),
        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.necromancer,
            hp = 500,
            defense = 10
        ),

        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.imageswarrior,
            hp = 500,
            defense = 10
        ),

        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.archer,
            hp = 500,
            defense = 10
        ),
        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.mage,
            hp = 500,
            defense = 10

        ),
        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.necromancer,
            hp = 500,
            defense = 10
        ),

        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.imageswarrior,
            hp = 500,
            defense = 10
        ),

        CharacterAttributes(
            name = "Big Felipe",
            vocation = R.drawable.archer,
            hp = 500,
            defense = 10
        ),
        )
}