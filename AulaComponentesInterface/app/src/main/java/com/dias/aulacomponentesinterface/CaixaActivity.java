package com.dias.aulacomponentesinterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class CaixaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caixa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Evento de click com função lambda - Capturar quando o botão for clicado
        Button botao = findViewById(R.id.botao_salvar);
        // Capturar o texto que foi digitado no TextInputEditText
        TextInputEditText email = findViewById(R.id.edit_email);
        botao.setOnClickListener(view -> {
                // Capturar o texto que foi digitado e salvar na STRING
                String emailUsuario = email.getText().toString();
                System.out.println("Email selecionado: " + emailUsuario);
                }
        );
    }

    /*public void executar(View view) {

    }*/
}