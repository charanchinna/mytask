package com.mytask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mytask.data.model.Module
import com.mytask.databinding.ItemModuleBinding

class ModulesAdapter(private val modules: List<Module>,
                     private val onItemClick: (Module) -> Unit
) : RecyclerView.Adapter<ModulesAdapter.ModuleViewHolder>() {

    class ModuleViewHolder(val itemView: ItemModuleBinding) : RecyclerView.ViewHolder(itemView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val binding = ItemModuleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModuleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = modules[position]
        holder.itemView.tvModuleTitle.text = module.title
        holder.itemView.card.setOnClickListener { onItemClick(module) }
    }

    override fun getItemCount() = modules.size
}
