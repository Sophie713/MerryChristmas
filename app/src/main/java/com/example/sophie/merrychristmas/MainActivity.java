package com.example.sophie.merrychristmas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void unwrap (View view){

        ImageView present = findViewById(R.id.picture);
        TextView open = findViewById(R.id.my_text);
        View layout = findViewById(R.id.layout);
        present.setImageResource(R.drawable.christmas);
        open.setVisibility(View.GONE);
        layout.setBackgroundColor(Color.DKGRAY);

    }
}
