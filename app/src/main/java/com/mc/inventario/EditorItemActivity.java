package com.mc.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EditorItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_item);

        /* Going back */
        FloatingActionButton goBackfab = findViewById(R.id.fabGoBack);
        goBackfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditorItemActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        /* Saving item */
        FloatingActionButton savefab = findViewById(R.id.fabSaveItem);
        savefab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditorItemActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}