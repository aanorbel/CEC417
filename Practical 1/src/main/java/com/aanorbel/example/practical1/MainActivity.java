package com.aanorbel.example.practical1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.aanorbel.example.cec417.intents.extra.MESSAGE";
    protected int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView counter = findViewById(R.id.counter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> {
                    count++;
                    counter.setText(String.valueOf(count));
                });
            }
        }, 1000, 3000);

    }

    public void sendHello(View view) {

        Intent intent = new Intent(this, HelloActivity.class);

        intent.putExtra(EXTRA_MESSAGE, count);
        startActivity(intent);
    }
}
