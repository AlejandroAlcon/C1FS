package com.lex.alcon.alejandro.lex.c1fs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtvTitulo;
    EditText etxtNombre;
    Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvTitulo=findViewById(R.id.textViewTittle);
        etxtNombre=findViewById(R.id.editTextName);
        btnOk=findViewById(R.id.buttonOk);
    }
    public void evento(View view)
    {
        String Name=etxtNombre.getText().toString();
        Toast.makeText(this,R.string.bienvenido,Toast.LENGTH_LONG).show();
        txtvTitulo.setText(Name);
    }



}
