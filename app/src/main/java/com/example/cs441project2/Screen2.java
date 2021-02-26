package com.example.cs441project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2 extends AppCompatActivity {

    Button screen_swap_button_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        screen_swap_button_two = findViewById(R.id.screen_swap_button_two);
    }

    public void swap_to_screen_3(View view)
    {
        Intent swap_action = new Intent(this, Screen3.class);
        startActivity(swap_action);
    }
}