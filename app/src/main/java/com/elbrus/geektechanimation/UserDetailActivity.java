package com.elbrus.geektechanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class UserDetailActivity extends AppCompatActivity {


    private ImageView imageView;
    private TextView name;
    private TextView age;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        user = (User) getIntent().getSerializableExtra("user");


        imageView = findViewById(R.id.user_image);
        name = findViewById(R.id.user_name);
        age = findViewById(R.id.user_age);

        Glide.with(this).load(user.getImageUrl()).into(imageView);
        name.setText(user.getLastName() + " " + user.getName());
        age.setText(user.getAge() + " лет" );


    }
}