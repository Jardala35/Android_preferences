package com.example.preferencias_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guardar(View view){
        EditText txt1 = findViewById(R.id.editTextText);
        EditText txt2 = findViewById(R.id.editTextText2);
        SharedPreferences sp = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(txt1.getText().toString(), txt2.getText().toString());
        editor.apply();
        txt1.setText("");
        txt2.setText("");

    }

    public void consultar(View view) throws InterruptedException {
        EditText txt = findViewById(R.id.editTextText);
        EditText txt2 = findViewById(R.id.editTextText2);
        SharedPreferences sp = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        txt2.setText(sp.getString( txt.getText().toString(), ""));


    }
}