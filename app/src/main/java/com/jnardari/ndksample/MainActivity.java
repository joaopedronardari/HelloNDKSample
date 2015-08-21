package com.jnardari.ndksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloLabel = (TextView) findViewById(R.id.helloLabel);
        helloLabel.setText("Testing NDK: " + NativeCode.calculateNumbers(10000L));
    }
}
