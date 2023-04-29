package com.sti.kimwelbeller.labexer.swapperandchecker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.edtxt1);
        EditText editText2 = findViewById(R.id.edtxt2);
        Button btnSwap = findViewById(R.id.btnSwap);
        Button btnCheck = findViewById(R.id.btnCheck);

        btnSwap.setOnClickListener(view -> {
            String text1 = editText1.getText().toString();
            String text2 = editText2.getText().toString();
            editText1.setText(text2);
            editText2.setText(text1);
        });

        btnCheck.setOnClickListener(view -> {
            String result = editText1.getText().toString().equals(editText2.getText().toString()) ? "SAME" : "NOT THE SAME";
            Intent intent = new Intent(MainActivity.this, MessageActivity.class);
            intent.putExtra("message", result);
            startActivity(intent);
        });
    }
}