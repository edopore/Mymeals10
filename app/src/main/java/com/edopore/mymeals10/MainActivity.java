package com.edopore.mymeals10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menup,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.reg){

            Intent intent = new Intent(MainActivity.this, Perfil.class);
            //intent.putExtra("usuario", usuario);
            //intent.putExtra("contrasena", password);
            startActivityForResult(intent,369);

        }else if (id == R.id.out){

            Intent intent = new Intent(MainActivity.this, Login.class);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
