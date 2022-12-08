package com.example.aziz_musaev_hw_53;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {

    ImageView chatImageView;
    TextView chatTitleTextView;
    TextView chatMessageTextView;

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
        chatImageView = itemView.findViewById(R.id.chat_iv);
        chatTitleTextView = itemView.findViewById(R.id.title_tv);
        chatMessageTextView = itemView.findViewById(R.id.message_tv);
    }

    public void bind(ChatModel model) {
        chatImageView.setImageResource(model.image);
        chatTitleTextView.setText(model.title);
        chatMessageTextView.setText(model.message);

    }
}