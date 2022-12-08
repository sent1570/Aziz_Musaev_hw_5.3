package com.example.aziz_musaev_hw_53;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class ListFragment extends Fragment implements ItemClickListener {
    RecyclerView chatRecyclerView;
    ChatAdapter chatAdapter;
    ExtendedFloatingActionButton addButton;
    private ArrayList<ChatModel> chats;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        chatRecyclerView = view.findViewById(R.id.chat_rv);
        chats = new ArrayList<>();
        addButton = view.findViewById(R.id.add_btn);
        setChats();
        chatRecyclerView.setAdapter(chatAdapter = new ChatAdapter(chats, this));
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chats.add(0,new ChatModel(R.drawable.jobs,"New Chat","New chat"));
                chatAdapter.notifyDataSetChanged();
            }
        });
    }

    private void setChats() {
        chats.add(new ChatModel(R.drawable.jobs, "Geektech 50-30 ", "message Kachkeev Akbar"));
        chats.add(new ChatModel(R.drawable.jobs, "GeekStudents ", "message"));
        chats.add(new ChatModel(R.drawable.jobs, "DevKg ", "Продам Playstation"));
        chats.add(new ChatModel(R.drawable.jobs, "Java ", "Java 2022"));
        chats.add(new ChatModel(R.drawable.jobs, "Книги для IT ", "Скачать книгу"));
        chats.add(new ChatModel(R.drawable.jobs, "Geektech 50-30 ", "message Kachkeev Akbar"));
        chats.add(new ChatModel(R.drawable.jobs, "GeekStudents ", "message"));
        chats.add(new ChatModel(R.drawable.jobs, "DevKg ", "Продам Playstation"));
        chats.add(new ChatModel(R.drawable.jobs, "Java ", "Java 2022"));

    }


    @Override
    public void onClickListener(ChatModel item) {
        Bundle bundle = new Bundle();
        bundle.putInt("image", item.image);
        bundle.putString("title", item.title);
        bundle.putString("message", item.message);
        DetailsFragment fragment = new DetailsFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack("").commit();
    }
}