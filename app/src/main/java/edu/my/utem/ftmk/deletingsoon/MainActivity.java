package edu.my.utem.ftmk.deletingsoon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import edu.my.utem.ftmk.deletingsoon.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
    }


    public void showGreeting(View view) {
        String name = String.valueOf(binding.txtfName.getText());
        binding.txtHeader.setText("Hello " + name);
    }
}