package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profile);

            TextView userEmailTextView = findViewById(R.id.userEmail);
            TextView userIdTextView = findViewById(R.id.userId);

            String userEmail = getIntent().getStringExtra("userEmail");
            String userId = getIntent().getStringExtra("userId");

            userEmailTextView.setText(userEmail);
            userIdTextView.setText(userId);
        }
    }