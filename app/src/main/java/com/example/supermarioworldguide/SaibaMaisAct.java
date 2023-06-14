package com.example.supermarioworldguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.supermarioworldguide.R.id;
import com.example.supermarioworldguide.R.layout;

public class SaibaMaisAct extends AppCompatActivity {

    private Button voltar5, comprar, lojas, wiki;

    public SaibaMaisAct() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_saiba_mais);
        this.voltar5 = (Button) this.findViewById(id.voltar5);
        this.voltar5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SaibaMaisAct.this.openMainActivity();
            }
        });

        comprar = (Button) this.findViewById(id.comprar);
        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.nintendo.com/pt-br/store/games/mario-games/");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

        lojas = (Button) this.findViewById(id.lojas);
        lojas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location = Uri.parse("geo:0,0?q=lojas+onde+vendem+jogos+da+nintendo");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });

        wiki = (Button) this.findViewById(id.wiki);
        wiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.mariowiki.com/Super_Mario_World");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}