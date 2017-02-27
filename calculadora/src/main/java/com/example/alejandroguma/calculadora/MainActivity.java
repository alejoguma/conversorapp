package com.example.alejandroguma.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.String;
public class MainActivity extends AppCompatActivity {
    EditText eOperando;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bmas,bmenos,bdiv,bmult,bpunt,bclean,bres;
    String cad= "" ;
    String operacion="";
    Double op1=0.0,op2=1.0;
    int baux=0,b2aux=0,bp=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eOperando=(EditText) findViewById(R.id.eNumero);
        b0=(Button) findViewById(R.id.bc0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        bmas=(Button) findViewById(R.id.bmas);
        bmenos=(Button) findViewById(R.id.bmenos);
        bdiv=(Button) findViewById(R.id.bdiv);
        bmult=(Button) findViewById(R.id.bmult);
        bpunt=(Button) findViewById(R.id.bpunto);
        bclean=(Button) findViewById(R.id.bclean);
        bres=(Button) findViewById(R.id.bresult);
    }
    public void click(View view){
        int id =view.getId();

        switch (id){

            case R.id.bc0:
                cad=cad.concat("0");
                eOperando.setText(cad);
            break;
            case R.id.b1:
                cad=cad.concat("1");
                eOperando.setText(cad);
                break;
            case R.id.b2:
                cad=cad.concat("2");
                eOperando.setText(cad);
                break;
            case R.id.b3:
                cad=cad.concat("3");
                eOperando.setText(cad);
                break;
            case R.id.b4:
                cad=cad.concat("4");
                eOperando.setText(cad);
                break;
            case R.id.b5:
                cad=cad.concat("5");
                eOperando.setText(cad);
                break;
            case R.id.b6:
                cad=cad.concat("6");
                eOperando.setText(cad);
                break;
            case R.id.b7:
                cad=cad.concat("7");
                eOperando.setText(cad);
                break;
            case R.id.b8:
                cad=cad.concat("8");
                eOperando.setText(cad);
                break;
            case R.id.b9:
                cad=cad.concat("9");
                eOperando.setText(cad);
                break;
            case R.id.bclean:
                cad="";
                eOperando.setText(cad);
                op1=0.0;
                break;
            case R.id.bpunto:
                if(bp==0){
                    cad=cad.concat(".");
                    eOperando.setText(cad);
                    bp=1;
                }

                break;
            case R.id.bmas:
                operacion="+";
                op1=op1+Double.parseDouble(eOperando.getText().toString());
                cad="";
                eOperando.setText(cad);
                bp=0;
                break;
            case R.id.bmenos:
                operacion="-";
                if(baux==1){
                    op1=op1-Double.parseDouble(eOperando.getText().toString());
                    cad="";
                    eOperando.setText(cad);
                }
                if(baux==0){
                    op1=Double.parseDouble(eOperando.getText().toString());
                    baux=1;
                    cad="";
                    eOperando.setText(cad);
                }
                bp=0;
                break;

            case R.id.bmult:
                operacion="*";
                op2=op2*Double.parseDouble(eOperando.getText().toString());
                cad="";
                eOperando.setText(cad);
                break;
            case R.id.bdiv:
                operacion="/";
                if(b2aux==1){
                    if(Double.parseDouble(eOperando.getText().toString())==0){
                        cad="Division por cero";
                        eOperando.setText(cad);
                    }else{
                        op1=op1/Double.parseDouble(eOperando.getText().toString());
                        cad="";
                        eOperando.setText(cad);
                    }


                }
                if(b2aux==0){
                    op1=Double.parseDouble(eOperando.getText().toString());
                    b2aux=1;
                    cad="";
                    eOperando.setText(cad);
                }
                bp=0;
                break;
            case R.id.bresult:

                if(operacion.equals("+")){
                    op1=op1+Double.parseDouble(eOperando.getText().toString());
                    cad=op1.toString();
                    eOperando.setText(cad);
                    op1=0.0;
                }
                if(operacion.equals("-")){
                    op1=op1-Double.parseDouble(eOperando.getText().toString());
                    baux=0;
                    cad=op1.toString();
                    eOperando.setText(cad);
                    op1=0.0;
                }
                if(operacion.equals("*")){
                    op2=op2*Double.parseDouble(eOperando.getText().toString());
                    cad=op2.toString();
                    eOperando.setText(cad);
                    op2=1.0;
                }
                if(operacion.equals("/")){
                    if(Double.parseDouble(eOperando.getText().toString())==0.0){
                        cad="Division por cero";
                        eOperando.setText(cad);
                    }else{
                        op1=op1/Double.parseDouble(eOperando.getText().toString());
                        cad=op1.toString();
                        eOperando.setText(cad);
                        op1=0.0;
                    }
                    b2aux=0;
                }
                bp=0;
                break;
        }
    }


}
