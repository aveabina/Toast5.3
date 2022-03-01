package com.example.toast53;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
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
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, findViewById(R.id.panel));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    };

}
