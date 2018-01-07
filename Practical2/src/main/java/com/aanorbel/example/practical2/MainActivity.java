package com.aanorbel.example.practical2;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.image_1:
                return true;
            case R.id.show_alert:
                DialogFragment newFragment = FireMissilesDialogFragment.newInstance();
                newFragment.show(getSupportFragmentManager(), FireMissilesDialogFragment.FRAGMENT_TAG);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
