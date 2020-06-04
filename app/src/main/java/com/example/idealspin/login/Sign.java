package com.example.idealspin.login;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.idealspin.R;

public class Sign extends Activity {
    //def check user name not in data base
    EditText pseudo, pass;
    Image tof;
    Button go;
    SQLiteDatabase db;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        pseudo = (EditText) findViewById(R.id.pseudoSign);
        pass = (EditText) findViewById(R.id.passSign);
        go = (Button) findViewById(R.id.enterSign);
        db  = this.openOrCreateDatabase("idealSpin",MODE_PRIVATE,null);
        onClick();
    }

    private void onClick(){
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameNotin()){
                    addToDataBase();//tof
                }
                else{
                    Toast.makeText(getApplicationContext(),"name taken",Toast.LENGTH_SHORT);
                }
            }
        });
    }
    //TODO check name not in data
    public boolean nameNotin(){
        String ps = pseudo.getText().toString();
        Cursor cursor = db.rawQuery("Select pseudo from Buddy where ('pseudo' = '" + ps+"');",null);
        return (cursor == null || cursor.getCount() ==0);

    }
    //TODO add to data base image
    private void addToDataBase(){
        String ps = pseudo.getText().toString();
        String pa = pass.getText().toString();
        db.execSQL("INSERT INTO Buddy(pseudo, pass) VALUES('"+ ps +"','"+ pa + "');" );
    }
}
