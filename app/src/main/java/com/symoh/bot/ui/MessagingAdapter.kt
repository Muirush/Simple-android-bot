package com.symoh.bot.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.symoh.bot.R
import com.symoh.bot.data.Message
import com.symoh.bot.utils.Constants.SEND_ID

class MessagingAdapter :RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>(){
    var messageList = mutableListOf<Message>()

    inner  class  MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener(){
                messageList.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return  MessageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.message_item,parent,false))
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = messageList[position]

        when(currentMessage.id){
            SEND_ID -> {
                //itemView.tv_message cannot be recognize, shows an error
                holder.itemView.tv_message.apply{

                }
            }
        }
    }

    override fun getItemCount(): Int {
        return  messageList.size
    }

}




