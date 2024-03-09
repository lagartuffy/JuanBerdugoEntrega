package com.example.juanberdugoentrega;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla3Activity extends AppCompatActivity {

    private TextView senoTextView, cosenoTextView, areaTextView, perimetroTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        senoTextView = findViewById(R.id.senoTextView);
        cosenoTextView = findViewById(R.id.cosenoTextView);
        areaTextView = findViewById(R.id.areaTextView);
        perimetroTextView = findViewById(R.id.perimetroTextView);

        // Recibir los datos de la Pantalla2Activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String angulo = extras.getString("angulo");
            String lado1 = extras.getString("lado1");
            String lado2 = extras.getString("lado2");
            String lado3 = extras.getString("lado3");

            // Calcular seno y coseno del ángulo
            double anguloRad = Math.toRadians(Double.parseDouble(angulo));
            double seno = Math.sin(anguloRad);
            double coseno = Math.cos(anguloRad);

            // Mostrar los resultados
            senoTextView.setText("Seno: " + String.valueOf(seno));
            cosenoTextView.setText("Coseno: " + String.valueOf(coseno));

            // Calcular el área del triángulo
            double semiperimetro = (Double.parseDouble(lado1) + Double.parseDouble(lado2) + Double.parseDouble(lado3)) / 2;
            double area = Math.sqrt(semiperimetro * (semiperimetro - Double.parseDouble(lado1)) *
                    (semiperimetro - Double.parseDouble(lado2)) * (semiperimetro - Double.parseDouble(lado3)));

            // Calcular el perímetro del triángulo
            double perimetro = Double.parseDouble(lado1) + Double.parseDouble(lado2) + Double.parseDouble(lado3);

            // Mostrar los resultados
            areaTextView.setText("Área: " + String.valueOf(area));
            perimetroTextView.setText("Perímetro: " + String.valueOf(perimetro));
        }
    }
}
