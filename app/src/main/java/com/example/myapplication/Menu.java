package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Menu extends AppCompatActivity {
    TextView nama;
    TextView email;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        nama=(TextView)findViewById(R.id.txtnama);
        email=(TextView)findViewById(R.id.txtemail);
        logo=(ImageView)findViewById(R.id.ivgambar);
        //get shared preference
        SharedPreferences mSettings = getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        String cookieName = mSettings.getString("datanama", "datanama");
        String cookieEmail = mSettings.getString("dataemail", "dataemail");
        //set to UI
        nama.setText(cookieName);
        email.setText(cookieEmail);

    }
}
