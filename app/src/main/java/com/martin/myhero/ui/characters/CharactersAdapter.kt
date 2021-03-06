package com.martin.myhero.ui.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.martin.myhero.R
import com.martin.myhero.databinding.ViewHeroItemBinding
import com.martin.myhero.data.models.Character
import com.martin.myhero.ui.base.BaseAdapter

class CharactersAdapter : BaseAdapter<Character, CharactersAdapter.CharactersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder =
        CharactersViewHolder(
            ViewHeroItemBinding.bind(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.view_hero_item,
                    parent,
                    false
                )
            ), onClickListener
        )

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class CharactersViewHolder(
        private val binding: ViewHeroItemBinding,
        private val onClickListener: ((Character) -> Unit)?
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Character) = with(itemView) {
            binding.character = item
            binding.root.setOnClickListener {
                onClickListener?.invoke(item)
            }
        }
    }
}