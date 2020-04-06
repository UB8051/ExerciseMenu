package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingSegitiga extends AppCompatActivity {

    private EditText edtSisiA;
    private EditText edtSisiB;
    private EditText edtSisiC;
    private TextView txvKeliling;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_keliling_segitiga);
        initUI ();
        initEvent ();

    }

    private void initUI() {
        edtSisiA    = ( EditText ) findViewById (R.id.alassegi1);
        edtSisiB    = ( EditText ) findViewById (R.id.tinggisegi1);
        edtSisiC    = ( EditText ) findViewById (R.id.miringsegi1);
        txvKeliling = ( TextView ) findViewById (R.id.hasilsegi1);
        btnHitung   = ( Button ) findViewById (R.id.btnsegi1);
    }

    private void HitungKelilingSegitiga() {
        double sisiA = Double.parseDouble (edtSisiA.getText ().toString ());
        double sisiB = Double.parseDouble (edtSisiB.getText ().toString ());
        double sisiC = Double.parseDouble (edtSisiC.getText ().toString ());
        double keliling = sisiA + sisiB + sisiC;
        txvKeliling.setText (" Keliling dengan panjang A =  "+ sisiA + " Keliling dengan panjang B =  " + sisiB + " Keliling dengan panjang A =  "+ sisiC + " adalah " + keliling );
    }

    private void initEvent() {
        btnHitung.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                HitungKelilingSegitiga();
            }
        });
    }
}
