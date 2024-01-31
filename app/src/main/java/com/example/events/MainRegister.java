package com.example.events;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainRegister extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainregister);

        editTextName = findViewById(R.id.etName);
        editTextEmail = findViewById(R.id.etEmail);
        buttonRegister = findViewById(R.id.btnRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();

                String message = "Name: " + name + "\nEmail: " + email;

                Toast.makeText(MainRegister.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}