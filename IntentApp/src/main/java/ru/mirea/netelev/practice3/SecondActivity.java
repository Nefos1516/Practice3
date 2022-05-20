package ru.mirea.netelev.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = this.findViewById(R.id.textView2);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("time"));
    }
}