package com.x_sm.myapp.exampleapp.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view){
        Log.i("Info","Button pressed!");

        EditText nameEditText = (EditText)findViewById(R.id.nameEditText);
        EditText passwordEditText = (EditText)findViewById(R.id.passwordEditTesxt);

        Toast.makeText(this, "Hello " + nameEditText.getText().toString() + "!", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "text", 0).show();

        Log.i("Values","Username: " + nameEditText.getText().toString());
        Log.i("Values","Passowrd: " + passwordEditText.getText().toString());
    }
}
