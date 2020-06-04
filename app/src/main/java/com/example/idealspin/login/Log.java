package com.example.idealspin.login;

import android.app.Activity;
import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.idealspin.R;

public class Log extends Activity {
    EditText pseudo, pass;
    Button go;
    SQLiteDatabase db;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        pseudo = (EditText) findViewById(R.id.pseudoLog);
        pass = (EditText) findViewById(R.id.passLog);
        go = (Button) findViewById(R.id.enterLog);
        db  = this.openOrCreateDatabase("idealSpin",MODE_PRIVATE,null);
        db.execSQL("Create TABLE if Not exists Buddy " + "(pseudo VARCHAR primary key, pass VARCHAR);");
        onClick();
    }
    //TODO hash the pass,create intent to main menu
    private void onClick(){
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pse = pseudo.getText().toString();
                String pas = pass.getText().toString();
                boolean check = checkDataBase(pse,pas);
                if(check){

                }
                else{
                    Toast.makeText(getApplicationContext(),"Error 420:Buddy not found",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    //check if our buddy is in our database

    public boolean checkDataBase(String pse,String pas){
        Cursor cursor = db.rawQuery("Select pseudo from Buddy where ('pseudo' = '" + pse + "' AND 'pass'='"+ pas +"');",null);
        return cursor.getCount() == 1;
    }
}
