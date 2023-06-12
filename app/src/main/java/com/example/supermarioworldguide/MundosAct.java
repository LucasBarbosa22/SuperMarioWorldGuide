package com.example.supermarioworldguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MundosAct extends AppCompatActivity {

    private Button voltar4;

    public MundosAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_mundos);
        this.voltar4 = (Button)this.findViewById(R.id.voltar4);
        this.voltar4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { MundosAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}