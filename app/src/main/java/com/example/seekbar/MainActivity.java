package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindLayoutView();
        setOnSeekBarListener();
    }
    public void bindLayoutView(){
        seekBar=(SeekBar) findViewById(R.id.seekBar);
    }
    public void setOnSeekBarListener(){

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                showLongToast("seekBar progress");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                showLongToast("seekBar Touch Started");
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
               showLongToast("seekBar Touch Stopped");
            }
        });
    }
    public void showLongToast(String massage){
        Toast.makeText(getApplicationContext(),massage,Toast.LENGTH_SHORT).show();
    }
}