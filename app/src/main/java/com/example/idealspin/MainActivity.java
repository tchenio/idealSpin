package com.example.idealspin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.idealspin.roll.*;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.test);
        //TEST ROLL
        Roll r = new Roll();
        r.add(new Item("a",0.5));
        r.add(new Item("a",0.5));
        t.setText( r.checkSum()+"");
    }
}
