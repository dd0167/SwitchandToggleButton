package com.example.switchandtogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout LinearLayout;
    Switch Switch;
    ToggleButton ToggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout=(LinearLayout) findViewById(R.id.LinearLayout);
        Switch=(Switch) findViewById(R.id.Switch);
        ToggleButton=(ToggleButton) findViewById(R.id.ToggleButton);
    }

    public void button(View view) {
        if (Switch.isChecked() && ToggleButton.isChecked()) {
            LinearLayout.setBackgroundColor(Color.RED);
        }
        else if (Switch.isChecked() && !ToggleButton.isChecked()) {
            LinearLayout.setBackgroundColor(Color.YELLOW);
        }
        else if (!Switch.isChecked() && ToggleButton.isChecked()) {
            LinearLayout.setBackgroundColor(Color.GREEN);
        }
        else if (!Switch.isChecked() && !ToggleButton.isChecked()) {
            LinearLayout.setBackgroundColor(Color.BLUE);
        }
    }
    public void Switch(View view) {
        Toast.makeText(this, "You clicked me", Toast.LENGTH_SHORT).show();
    }

    public void tbclick(View view) {
        Toast.makeText(this, "You clicked me", Toast.LENGTH_SHORT).show();
    }
}
