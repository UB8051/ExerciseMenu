package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingLingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);
        final EditText edtNilaiJari=(EditText) findViewById(R.id.jari1);
        final Button btnHitung=(Button) findViewById(R.id.btnling1);
        final TextView txtKeliling = (TextView) findViewById(R.id.hasilling1);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                int valNilaiJari= Integer.parseInt(edtNilaiJari.getText().toString());
                int keliiling=(int) (3.14*2*valNilaiJari);
                txtKeliling.setText("Keliling dengan jari = " + valNilaiJari + " adalah " + keliiling);

            }
        });
    }

}
