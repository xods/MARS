package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_txt);

        TextView txtLogo = findViewById(R.id.txtVLogo);
        Button login = findViewById(R.id.btnLogIn);
        Button signIn = findViewById(R.id.btnSignIn);
        Button play = findViewById(R.id.btnPlayGuest);

        txtLogo.setAnimation(animation);
        login.setAnimation(animation);
        signIn.setAnimation(animation);
        play.setAnimation(animation);

        login.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, LogInActivity.class)));
    }
}