package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);
        final EditText edtNilaiJari=(EditText) findViewById(R.id.jari2);
        final Button btnHitung=(Button) findViewById(R.id.btnling2);
        final TextView txtLuas = (TextView) findViewById(R.id.hasilling2);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                int valNilaiJari= Integer.parseInt(edtNilaiJari.getText().toString());
                int luas=(int) (3.14*valNilaiJari*valNilaiJari);
                txtLuas.setText("Luas dengan jari = " + valNilaiJari + " adalah " + luas);

            }
        });
    }

}
