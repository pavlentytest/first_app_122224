package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn;
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR","onCreate()");
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","onDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","onRestart()");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {
            // явное намерение
          /*  Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra(KEY, "Message!");
           startActivity(intent);

           */

            // неявное намерение
           // Intent intent = new Intent(Intent.ACTION_VIEW);
           // String str = "https://mirea.ru";
          //  intent.setData(Uri.parse(str));
          //  startActivity(intent);

           // Toast.makeText(this,"Message!",Toast.LENGTH_LONG).show();
            Snackbar.make(findViewById(R.id.root), R.string.message,Snackbar.LENGTH_SHORT).show();
        } else {

        }
    }
}