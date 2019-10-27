package com.gzeinnumer.universalcontext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp.getContext();

        Toast.makeText(MyApp.getContext(), "Context call", Toast.LENGTH_SHORT).show();
    }
}
