package com.example.nwuser.cameratest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDisplay = (Button) findViewById((R.id.button));

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            // ボタンの処理
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button:

                        Intent intent = new Intent(getApplicationContext(), CameraEx.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }


}
