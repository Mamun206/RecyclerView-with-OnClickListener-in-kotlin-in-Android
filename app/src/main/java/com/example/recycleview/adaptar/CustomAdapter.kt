package com.example.recycleview.adaptar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.Model
import com.example.recycleview.MyDataClass
import com.example.recycleview.R
import de.hdodenhof.circleimageview.CircleImageView

class CustomAdapter(private val data:ArrayList<MyDataClass>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    private var mOnClickListener: OnClickListener?= null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile: CircleImageView = itemView.findViewById(R.id.image)
        val name: TextView = itemView.findViewById(R.id.name)
        val number: TextView = itemView.findViewById(R.id.number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.sample_layout,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val singleData = data[position]
        holder.name.text = singleData.name
        holder.number.text = singleData.number
        Glide.with(holder.profile.context).load(singleData.profile).into(holder.profile)

        holder.itemView.setOnClickListener {
            if (mOnClickListener!= null){
                mOnClickListener!!.onClick(position,singleData)
            }

        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface OnClickListener{
        fun onClick(position: Int, model: MyDataClass)
    }
    fun setOnClickListener(onClickListener: OnClickListener){
        this.mOnClickListener = onClickListener
    }
}