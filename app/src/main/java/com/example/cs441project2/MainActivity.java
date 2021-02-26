package com.example.cs441project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button screen_swap_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen_swap_button = findViewById(R.id.screen_swap_button);

    }

    public void swap_to_screen_2(View view)
    {
        Intent swap_action = new Intent(this, Screen2.class);
        startActivity(swap_action);
    }
}