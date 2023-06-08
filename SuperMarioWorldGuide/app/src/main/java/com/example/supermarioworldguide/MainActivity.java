package com.example.supermarioworldguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.supermarioworldguide.R.id;
import com.example.supermarioworldguide.R.layout;

public class MainActivity extends AppCompatActivity {
    private Button sobre;

    public MainActivity() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_main);
        this.sobre = (Button)this.findViewById(id.sobre);
        this.sobre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.openSobreAct();
            }
        });
    }

    public void openSobreAct() {
        Intent intent = new Intent(this, SobreAct.class);
        this.startActivity(intent);
    }
}