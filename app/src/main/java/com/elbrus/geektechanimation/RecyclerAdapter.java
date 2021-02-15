package com.elbrus.geektechanimation;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.UserViewHolder> {

    private ArrayList<User> items = new ArrayList();
    private Listener listener;

    public RecyclerAdapter(ArrayList<User> items,  Listener listener) {
        this.items = items;
        this.listener = listener;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = items.get(position);
        holder.userName.setText(user.getLastName() + " " + user.getName());
        holder.userAge.setText(String.valueOf(user.getAge()));
        Glide.with(holder.itemView.getContext()).load(user.getImageUrl()).into(holder.userImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(user, holder.userImage, holder.userName, holder.userAge);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    class UserViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView userImage;
        private TextView userName;
        private TextView userAge;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.user_name);
            userAge = itemView.findViewById(R.id.user_age);
            userImage = itemView.findViewById(R.id.user_image);
        }
    }


    interface Listener{
        void onItemClick(User user, ImageView imageView, TextView name, TextView age);
    }
}
