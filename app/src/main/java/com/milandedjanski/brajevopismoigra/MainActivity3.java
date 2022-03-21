package com.milandedjanski.brajevopismoigra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    TextView slovo;
    TextView tv;
    List<Character> slova = Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N'
            ,'O','P','Q','R','S','T','U','V','W','X','Y','Z');
    String unetoSlovo;

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
        setContentView(R.layout.activity_main3);

        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
        cb6=findViewById(R.id.cb6);

        tv = findViewById(R.id.textView);
        slovo=findViewById(R.id.slovo);

        unetoSlovo = ucitajTacke();
    }

    private String ucitajTacke() {
        Parovi par =  parovi.get(new Random().nextInt(parovi.size()));
        boolean c1 = par.isCb1();
        boolean c2 = par.isCb2();
        boolean c3 = par.isCb3();
        boolean c4 = par.isCb4();
        boolean c5 = par.isCb5();
        boolean c6 = par.isCb6();

        cb1.setChecked(c1);
        cb2.setChecked(c2);
        cb3.setChecked(c3);
        cb4.setChecked(c4);
        cb5.setChecked(c5);
        cb6.setChecked(c6);

        String a = par.getSlovo() + "";
        return a;
    }

    public void next(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    private void restartujIgru() {
        unetoSlovo = ucitajTacke();
        slovo.setText("");
    }

    public void uporedi(View view) {
        String uneto = String.valueOf(slovo.getText());
        if(uneto.toUpperCase().equals(unetoSlovo)){
            restartujIgru();
        }
    }
}