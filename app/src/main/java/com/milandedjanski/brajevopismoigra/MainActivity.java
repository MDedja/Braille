package com.milandedjanski.brajevopismoigra;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    TextView slovo;
    TextView tv;
    List<Character> slova = Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N'
                                        ,'O','P','Q','R','S','T','U','V','W','X','Y','Z');

    // true su popunjene tackice. Posmatrao si sa leva na desno!
    // 1 2
    // 3 4
    // 5 6
    List<Parovi> parovi = Arrays.asList(new Parovi('A',true,false,false,false,false,false),
            new Parovi('B',true,false,true,false,false,false),
            new Parovi('C',true,true,false,false,false,false),
            new Parovi('D',true,true,false,true,false,false),
            new Parovi('E',true,false,false,true,false,false),
            new Parovi('F',true,true,true,false,false,false),
            new Parovi('G',true,true,true,true,false,false),
            new Parovi('H',true,false,true,true,false,false),
            new Parovi('I',false,true,true,false,false,false),
            new Parovi('J',false,true,true,true,false,false),
            new Parovi('K',true,false,false,false,true,false),
            new Parovi('L',true,false,true,false,true,false),
            new Parovi('M',true,true,false,false,true,false),
            new Parovi('N',true,true,false,true,true,false),
            new Parovi('O',true,false,false,true,true,false),
            new Parovi('P',true,true,true,false,true,false),
            new Parovi('Q',true,true,true,true,true,false),
            new Parovi('R',true,false,true,true,true,false),
            new Parovi('S',false,true,true,false,true,false),
            new Parovi('T',false,true,true,true,true,false),
            new Parovi('U',true,false,false,false,true,true),
            new Parovi('V',true,false,true,false,true,true),
            new Parovi('W',false,true,true,true,false,true),
            new Parovi('X',true,true,false,false,true,true),
            new Parovi('Y',true,true,false,true,true,true),
            new Parovi('Z',true,false,false,true,true,true));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
        cb6=findViewById(R.id.cb6);

        tv = findViewById(R.id.textView);
        slovo=findViewById(R.id.slovo);
        slovo.setText(randomSlovo());

        slusajPromene();

    }

    private String randomSlovo(){
        return slova.get(new Random().nextInt(slova.size())).toString();
    }

    void slusajPromene(){
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logika();
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logika();
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logika();
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logika();
            }
        });
        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logika();
            }
        });
        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logika();
            }
        });

    }

    void logika(){
        boolean b1 = false;
        boolean b2= false;
        boolean b3= false;
        boolean b4= false;
        boolean b5= false;
        boolean b6= false;

        if(cb1.isChecked()) b1=true;
        if(cb2.isChecked()) b2=true;
        if(cb3.isChecked()) b3=true;
        if(cb4.isChecked()) b4=true;
        if(cb5.isChecked()) b5=true;
        if(cb6.isChecked()) b6=true;

        Parovi p = new Parovi(slovo.getText().charAt(0),b1,b2,b3,b4,b5,b6);

        for(int i =0;i<parovi.size();i++){
            if(p.equals(parovi.get(i))){
                restartujIgru();
            }
        }
    }

    void restartujIgru(){
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cb5.setChecked(false);
        cb6.setChecked(false);

        slovo.setText(randomSlovo());
    }

    public void next(View view) {
        Intent i = new Intent(this,MainActivity3.class);
        startActivity(i);
    }
}