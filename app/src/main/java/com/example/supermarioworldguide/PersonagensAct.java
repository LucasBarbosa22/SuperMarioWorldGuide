package com.example.supermarioworldguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonagensAct extends AppCompatActivity {

    private Button voltar2;

    public PersonagensAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_personagens);
        this.voltar2 = (Button)this.findViewById(R.id.voltar2);
        this.voltar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { PersonagensAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}