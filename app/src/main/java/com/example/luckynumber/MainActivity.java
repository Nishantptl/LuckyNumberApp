package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edit_text);
        textView=findViewById(R.id.textView);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                String userName=editText.getText().toString();
                Intent  i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("name", userName);
                startActivity(i);
            }
        });
    }
}