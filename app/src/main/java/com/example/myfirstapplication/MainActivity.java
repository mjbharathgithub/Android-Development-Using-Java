package com.example.myfirstapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void setDisable(View v){
//        v.setEnabled(false);
//        System.out.println("SetDisabled method is working fine Joseph...");
//        Log.d("msg","Log.d is working fine Joseph...");
//
//        Button button = (Button) v;
//        button.setText("Disabled");
        View myView = findViewById(R.id.buttonOne);
        myView.setEnabled(false);

        Button button1=(Button) myView;
        button1.setText("Button1disabled");
        button1.setBackgroundColor(Color.parseColor("#1A1A1D"));
        button1.setTextColor(Color.parseColor("#FAF6E3"));
    }

    public void insertText(View v){
        String input = ((TextView)(findViewById(R.id.textOne))).getText().toString();
        //Note We can also use EditText class for more specific operations
        Log.d("textMsg","Your message Joseph : "+input);
        ((TextView) findViewById(R.id.textTwo)).setText(input);
        Toast.makeText(this,"Your message : "+input,Toast.LENGTH_LONG).show();
    }
}