package com.aanorbel.example.practical1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Intent intent = getIntent();
        int message = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        TextView textView = findViewById(R.id.message_display);
        textView.setText(String.valueOf(message));
    }
}
