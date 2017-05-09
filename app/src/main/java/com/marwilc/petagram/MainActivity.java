package com.marwilc.petagram;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent myListActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFab();
        addBtnAcess();
    }

    public void addFab(){
        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.fabMiFab);
        myFab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(getBaseContext(), getResources().getString(R.string.message),Toast.LENGTH_SHORT).show();
                Snackbar.make(v,getResources().getString(R.string.message),Snackbar.LENGTH_SHORT)
                        .setAction(getResources().getString(R.string.textAction), new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i("SNACKBAR", "Click en Snackbar");
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorPrimaryDark))
                        .show();
            }
        });
    }

    public void addBtnAcess(){
        Button myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myListActivity = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(myListActivity);
            }
        });
    }
}
