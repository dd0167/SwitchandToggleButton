package com.example.switchandtogglebutton;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;
    Switch sw;
    ToggleButton tb;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll=(LinearLayout) findViewById(R.id.ll);
        sw=(Switch) findViewById(R.id.sw);
        tb=(ToggleButton) findViewById(R.id.tb);
       b=(Button) findViewById(R.id.b);

    }

    public void click(View view) {
        if (sw.isChecked() && tb.isChecked()) {
            ll.setBackgroundColor(Color.RED);
        }
        else if (sw.isChecked() && !tb.isChecked()) {
            ll.setBackgroundColor(Color.YELLOW);
        }
        else if (!sw.isChecked() && tb.isChecked()) {
            ll.setBackgroundColor(Color.GREEN);
        }
        else if (!sw.isChecked() && !tb.isChecked()) {
            ll.setBackgroundColor(Color.BLUE);
        }
    }
    public void swclick(View view) {
        Toast.makeText(this, "You clicked me", Toast.LENGTH_SHORT).show();
    }

    public void tbclick(View view) {
        Toast.makeText(this, "You clicked me", Toast.LENGTH_SHORT).show();
    }
}
