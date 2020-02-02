package com.example.libra_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class frontCamera extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView logo = findViewById(R.id.textLiBra);
        ConstraintLayout clickOuterContainer = findViewById(R.id.mainPageLiBra);

        clickOuterContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(frontCamera.this, InfoPage1.class);
                startActivity(intent);
            }
        });
    }
}
