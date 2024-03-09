package com.example.juanberdugoentrega;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla2Activity extends AppCompatActivity {

    private EditText anguloEditText, lado1EditText, lado2EditText, lado3EditText;
    private Button enviarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        anguloEditText = findViewById(R.id.anguloEditText);
        lado1EditText = findViewById(R.id.lado1EditText);
        lado2EditText = findViewById(R.id.lado2EditText);
        lado3EditText = findViewById(R.id.lado3EditText);
        enviarButton = findViewById(R.id.enviarButton);

        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String angulo = anguloEditText.getText().toString();
                String lado1 = lado1EditText.getText().toString();
                String lado2 = lado2EditText.getText().toString();
                String lado3 = lado3EditText.getText().toString();


                Intent intent = new Intent(Pantalla2Activity.this, Pantalla3Activity.class);
                intent.putExtra("angulo", angulo);
                intent.putExtra("lado1", lado1);
                intent.putExtra("lado2", lado2);
                intent.putExtra("lado3", lado3);
                startActivity(intent);
            }
        });
    }
}
