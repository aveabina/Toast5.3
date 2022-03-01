package com.example.toast53;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnToast);
    };

    public void onClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "TextMessage with Toast", Toast.LENGTH_SHORT);
        toast.show();
    };

}
