package com.example.primeiroandroid;

import static android.app.ProgressDialog.show;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this, "Helber Fernandes Rodrigues",Toast.LENGTH_LONG).show();
        //TextView aluno = new TextView(this);
        //aluno.setText("Helber Fernandes Rodrigues");
        setContentView(R.layout.activity_main);
    }
}
