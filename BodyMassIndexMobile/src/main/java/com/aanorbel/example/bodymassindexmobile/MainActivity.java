package com.aanorbel.example.bodymassindexmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mWeightEditText, mHeightEditText;
    private TextView mBMITextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeightEditText = findViewById(R.id.weight);
        mHeightEditText = findViewById(R.id.height);
    }

    public void calculateBodyMassIndex(View view) {

    }
}
