package com.example.supermarioworldguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.supermarioworldguide.R.id;
import com.example.supermarioworldguide.R.layout;

public class MainActivity extends AppCompatActivity {
    private Button sobre,historia,personagens,mundos, wiki;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.sobre = (Button)this.findViewById(id.sobre);
        this.sobre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openSobreAct();
            }
        });

        this.historia = (Button)this.findViewById(id.historia);
        this.historia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openHistoriaAct();
            }
        });

        this.personagens = (Button)this.findViewById(id.personagens);
        this.personagens.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openPersonagensAct();
            }
        });

        this.mundos = (Button)this.findViewById(id.mundos);
        this.mundos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openMundosAct();
            }
        });

        this.wiki = (Button)this.findViewById(id.wiki);
        this.wiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://www.mariowiki.com/Super_Mario_World");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(it);
            }
        });
    }


    public void openHistoriaAct() {
        Intent intent = new Intent(this, HistoriaAct.class);
        this.startActivity(intent);
    }

    public void openSobreAct() {
        Intent intent = new Intent(this, SobreAct.class);
        this.startActivity(intent);
    }

    public void openPersonagensAct() {
        Intent intent = new Intent(this, PersonagensAct.class);
        this.startActivity(intent);
    }

    public void openMundosAct() {
        Intent intent = new Intent(this, MundosAct.class);
        this.startActivity(intent);
    }

}