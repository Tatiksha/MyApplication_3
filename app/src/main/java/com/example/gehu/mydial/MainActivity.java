package com.example.gehu.mydial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText n1,n2;
    Intent i;
    RadioButton r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=new Intent(MainActivity.this,Main2Activity.class);
        b=findViewById(R.id.button);
        n1=findViewById(R.id.editText);
        n2=findViewById(R.id.editText2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg1",n1.getText().toString());
                startActivity(i);
            }
        });
    }
}
