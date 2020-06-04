package com.example.idealspin.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.idealspin.R;

public class SignLog extends Activity {
    private Button sign,log;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signlog);
        sign = (Button) findViewById(R.id.sign);
        log = (Button) findViewById(R.id.log);

       onClick();
    }
    public void onClick(){
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(getApplicationContext(),Sign.class);
                startActivity(sign);
                finish();
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(getApplicationContext(),Log.class);
                startActivity(log);
                finish();
            }
        });
    }
}
