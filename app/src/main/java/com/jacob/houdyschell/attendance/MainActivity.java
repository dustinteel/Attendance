package com.jacob.houdyschell.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart(Bundle savedInstanceState) {
        ;
    }


    protected void onRestart(Bundle savedInstanceState) {
        ;
    }

    protected void onPause(Bundle savedInstanceState) {
        ;
    }

    protected void onStop(Bundle savedInstanceState) {
        ;
    }

    protected void onDestroy(Bundle savedInstanceState) {
        ;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void attend(View v){
        Intent intent = new Intent(this, Attend2Activity.class);
        startActivity(intent);
    }

    public void addClass(View v){
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }

    public void dropClass(View v){
        Intent intent = new Intent(this, DropActivity.class);
        startActivity(intent);
    }

    public void checkAttendance(View v){
        Intent intent = new Intent(this, CheckActivity.class);
        startActivity(intent);
    }
}