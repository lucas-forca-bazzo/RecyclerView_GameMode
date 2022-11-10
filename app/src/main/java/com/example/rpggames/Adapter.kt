package com.example.rpggames

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rpggames.databinding.CharacterCardBinding

class Adapter : RecyclerView.Adapter<Adapter.CharacterViewHolder>() {
    private var listOfCharacters: List<CharacterAttributes> = listOf()

    fun setData(list: List<CharacterAttributes>) {
        listOfCharacters = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val itemBinding =
            CharacterCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(itemBinding)

    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val listUpdated: CharacterAttributes = listOfCharacters[position]
        holder.bind(listUpdated)

    }

    override fun getItemCount(): Int = listOfCharacters.size


    interface ClickAttack{
        fun clickAttack{}

    }

    inner class CharacterViewHolder(val binding: CharacterCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(listOfCharacters: CharacterAttributes) {

            binding.tvCharacterName.text = listOfCharacters.name
            binding.tvCharacterHp.text = listOfCharacters.hp.toString()
            val defense: Int = listOfCharacters.defense
            binding.ivCharacterCardIcon.setImageResource(listOfCharacters.vocation)

        }
    }

}