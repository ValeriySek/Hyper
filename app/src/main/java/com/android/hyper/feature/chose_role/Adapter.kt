package com.android.hyper.feature.chose_role

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.hyper.R
import com.android.hyper.databinding.ItemChoseRoleVpBinding
import com.squareup.picasso.Picasso

class Adapter : RecyclerView.Adapter<Adapter.Holder>() {

    private val roles = listOf(
        Role("Соискатель", "Ищу интересные вакансии.", R.drawable.img_chose_role_men),
        Role("Работодатель", "Ищу крутых специалистов.", R.drawable.img_chose_role_women)
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(ItemChoseRoleVpBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(roles[position])
    }

    override fun getItemCount() = roles.size

    class Holder(private val view: ItemChoseRoleVpBinding) : RecyclerView.ViewHolder(view.root) {

        fun bind(role: Role) {
            view.apply {
                itemChoseRoleTitleTv.text = role.title
                itemChoseRoleSubtitleTv.text = role.subtitle
                Picasso.get().load(role.image).into(itemChoseRoleIv)
            }
        }
    }
}