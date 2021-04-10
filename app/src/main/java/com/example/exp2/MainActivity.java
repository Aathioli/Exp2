package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private Button square;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText)findViewById(R.id.editTextNumber);
        square = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textView);

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(num.getText().toString());
                int squ = number * number ;
                result.setText(String.valueOf(squ));

            }
        });

    }
}