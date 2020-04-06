package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView txPopup1 = findViewById(R.id.hitungpersegi),
                txPopup2 = findViewById(R.id.hitunglingkaran),
                txPopup3 = findViewById(R.id.hitungpersegipnj),
                txPopup4 = findViewById(R.id.hitungsegitiga),
                txPopup5 = findViewById(R.id.hitungtrapesium),
                txPopup6 = findViewById(R.id.power);

        txPopup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu ppMenu = new PopupMenu(SecondActivity.this, v);
                ppMenu.getMenuInflater().inflate(R.menu.popup1, ppMenu.getMenu());

                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.menu2:
                                Intent kelilingpersegi = new Intent(SecondActivity.this, KelilingPersegi.class);
                                startActivity(kelilingpersegi);
                            case R.id.menu1:
                                Intent luaspersegi = new Intent(SecondActivity.this, LuasPersegi.class);
                                startActivity(luaspersegi);
                        }
                        return false;
                    }
                });
                ppMenu.show();
            }
        });
        txPopup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu ppMenu = new PopupMenu(SecondActivity.this, v);
                ppMenu.getMenuInflater().inflate(R.menu.popup2, ppMenu.getMenu());

                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.menu4:
                                Intent kelilingling = new Intent(SecondActivity.this, KelilingLingkaran.class);
                                startActivity(kelilingling);
                            case R.id.menu3:
                                Intent luasling = new Intent(SecondActivity.this, LuasLingkaran.class);
                                startActivity(luasling);
                        }
                        return false;
                    }
                });
                ppMenu.show();
            }
        });
        txPopup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu ppMenu = new PopupMenu(SecondActivity.this, v);
                ppMenu.getMenuInflater().inflate(R.menu.popup3, ppMenu.getMenu());

                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.menu6:
                                Intent kelilingpp = new Intent(SecondActivity.this, KelilingPersegiPanjang.class);
                                startActivity(kelilingpp);
                            case R.id.menu5:
                                Intent luaspp = new Intent(SecondActivity.this, LuasPersegiPanjang.class);
                                startActivity(luaspp);
                        }
                        return false;
                    }
                });
                ppMenu.show();
            }
        });
        txPopup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu ppMenu = new PopupMenu(SecondActivity.this, v);
                ppMenu.getMenuInflater().inflate(R.menu.popup4, ppMenu.getMenu());

                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.menu8:
                                Intent kelilingtiga = new Intent(SecondActivity.this, KelilingSegitiga.class);
                                startActivity(kelilingtiga);
                            case R.id.menu7:
                                Intent luastiga = new Intent(SecondActivity.this, LuasSegitiga.class);
                                startActivity(luastiga);
                        }
                        return false;
                    }
                });
                ppMenu.show();
            }
        });
        txPopup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu ppMenu = new PopupMenu(SecondActivity.this, v);
                ppMenu.getMenuInflater().inflate(R.menu.popup5, ppMenu.getMenu());

                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.menu10:
                                Intent kelilingTR = new Intent(SecondActivity.this, KelilingTrapesium.class);
                                startActivity(kelilingTR);
                            case R.id.menu9:
                                Intent luasTR = new Intent(SecondActivity.this, LuasTrapesium.class);
                                startActivity(luasTR);
                        }
                        return false;
                    }
                });
                ppMenu.show();
            }
        });
        txPopup6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}
