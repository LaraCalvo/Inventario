package com.mc.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EditorItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_item);

        /* Going back */
        FloatingActionButton goBackfab = findViewById(R.id.fabGoBack);
        goBackfab.setOnClickListener(v -> {
            Intent intent = new Intent(EditorItemActivity.this, MainActivity.class);
            startActivity(intent);
        });

        /* Saving item */
        EditText itemNameEditText = findViewById(R.id.editTextItemName);
        String itemName = itemNameEditText.getText().toString();
        EditText itemQuantityEditText = findViewById(R.id.editTextItemQuantity);
        String itemQuantity = itemQuantityEditText.getText().toString();
        FloatingActionButton savefab = findViewById(R.id.fabSaveItem);
        savefab.setOnClickListener(v -> {
            /* Store data */

            Intent intent = new Intent(EditorItemActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}