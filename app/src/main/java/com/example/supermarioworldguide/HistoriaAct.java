package com.example.supermarioworldguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoriaAct extends AppCompatActivity {

    private Button voltar3;

    public HistoriaAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_historia);
        this.voltar3 = (Button)this.findViewById(R.id.voltar3);
        this.voltar3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { HistoriaAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}