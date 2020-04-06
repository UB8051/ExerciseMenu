package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText Nama, Pass;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btnok);
        Nama = findViewById(R.id.editUN);
        Pass = findViewById(R.id.editPass);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nama.getText().toString().equals("admin") &&
                        Pass.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
                    Intent login =  new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(login);
                } else Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG).show();
            }
        });
    }
}
