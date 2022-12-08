package com.example.aziz_musaev_hw_53;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;


public class DetailsFragment extends Fragment  {
ImageView imageView2;
TextView titleTextView2;
TextView messageTextView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView2 = view.findViewById(R.id.chat_iv2);
        titleTextView2 = view.findViewById(R.id.title_tv2);
        messageTextView2 = view.findViewById(R.id.message_tv2);

        Bundle bundle = getArguments();
        Integer image = bundle.getInt("image");
        imageView2.setImageResource(image);

        String text = bundle.getString("title");
        titleTextView2.setText(text);

        String messageText = bundle.getString("message");
        messageTextView2.setText(messageText);
    }



}