package com.example.supermarioworldguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobreAct extends AppCompatActivity {

    private Button voltar;

    public SobreAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_sobre);
        this.voltar = (Button)this.findViewById(R.id.voltar);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SobreAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}