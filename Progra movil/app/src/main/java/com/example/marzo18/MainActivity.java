package com.example.marzo18;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.widget.GridView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

        private Switch switchExample;
        private SeekBar seekBarExample;
        private TextView textViewInsideScroll;
        private GridView gridViewExample;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Switch
            switchExample = findViewById(R.id.switchExample);
            switchExample.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Switch is ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Switch is OFF", Toast.LENGTH_SHORT).show();
                }
            });

            // SeekBar
            seekBarExample = findViewById(R.id.seekBarExample);
            seekBarExample.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    // Update progress value on screen
                    Toast.makeText(MainActivity.this, "Progress: " + progress, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {}

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {}
            });

            // GridView
            gridViewExample = findViewById(R.id.gridViewExample);
            // You can set an adapter for the GridView if you need to display data

            // Example to modify ScrollView text dynamically
            textViewInsideScroll = findViewById(R.id.textViewInsideScroll);
            textViewInsideScroll.setText("Updated content inside ScrollView");
        }
    }



