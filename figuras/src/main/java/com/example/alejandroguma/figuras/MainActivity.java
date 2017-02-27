package com.example.alejandroguma.figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    LinearLayout vCuadrado,vCirculo,vTriangulo,vCubo;
   // Button bCalcuadrado,bCaltriangulo,bCalcirculo,bCalcubo;
    EditText eLadocuadrado,eLadocubo,eBasetriangulo,eAlturatriangulo,eRadiocirculo,eLadoAtriangulo,eLadoCtriangulo;
    EditText ePericuadrado,eAreacuadrado,ePericirculo,eAreacirculo,ePeritriangulo,eAreatriangulo,ePericubo,eAreacubo,eVolumencubo;
    Double pcuadrado=0.0,acuadrado=0.0,ptriangulo=0.0,atriangulo=0.0,pcirculo=0.0,acirculo=0.0,pcubo=0.0,acubo=0.0,vcubo=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Vistas(LinearLayaouts)
        vCuadrado=(LinearLayout)findViewById(R.id.vistacuadrado);
        vCirculo=(LinearLayout)findViewById(R.id.vistacirculo);
        vTriangulo=(LinearLayout)findViewById(R.id.vistatriangulo);
        vCubo=(LinearLayout)findViewById(R.id.vistacubo);
        /*Botones de calculo para cada vista
        bCalcuadrado=(Button) findViewById(R.id.bCalcularC);
        bCaltriangulo=(Button) findViewById(R.id.bCalcularT);
        bCalcirculo=(Button) findViewById(R.id.bCalcularCirc);
        bCalcubo=(Button) findViewById(R.id.bCalcularCubo);*/
        //editText para los datos de las figuras geometricas
        eLadocuadrado=(EditText)findViewById(R.id.ladocuadrado);
        eAlturatriangulo=(EditText)findViewById(R.id.alturatriangulo);
        eBasetriangulo=(EditText)findViewById(R.id.basetriangulo);
        eLadocubo=(EditText)findViewById(R.id.ladocubo);
        eRadiocirculo=(EditText)findViewById(R.id.radiocirculo);
        eLadoAtriangulo=(EditText) findViewById(R.id.ladoAtriangulo);
        eLadoCtriangulo=(EditText) findViewById(R.id.ladoCtriangulo);
        //editText para mostrar los resultados de los calculos
        ePericuadrado=(EditText)findViewById(R.id.ePericuadrado);
        eAreacuadrado=(EditText)findViewById(R.id.eAreacuadrado);
        ePeritriangulo=(EditText)findViewById(R.id.ePeritriangulo);
        eAreatriangulo=(EditText)findViewById(R.id.eAreatriangulo);
        ePericirculo=(EditText)findViewById(R.id.ePericirculo);
        eAreacirculo=(EditText)findViewById(R.id.eAreacirculo);
        ePericubo=(EditText)findViewById(R.id.ePericubo);
        eAreacubo=(EditText)findViewById(R.id.eAreacubo);
        eVolumencubo=(EditText)findViewById(R.id.eVolumencubo);

    }


    //case para elegir la vist a mostrar dependiendo de el radiobutton
    public void onRadioButtonClicked(View view) {
        boolean marcado=((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.cuadrado:
                if(marcado){
                    mostrarParticular(0);
                    eLadocuadrado.setText("");
                    ePericuadrado.setText("");
                    eAreacuadrado.setText("");
                }
            break;
            case R.id.circulo:
                if(marcado){
                    mostrarParticular(1);
                    eRadiocirculo.setText("");
                    eAreacirculo.setText("");
                    ePericirculo.setText("");
                }
            break;
            case R.id.triangulo:
                if(marcado){
                    mostrarParticular(2);
                    eBasetriangulo.setText("");
                    eAlturatriangulo.setText("");
                    eLadoAtriangulo.setText("");
                    eLadoCtriangulo.setText("");
                    ePeritriangulo.setText("");
                    eAreatriangulo.setText("");
                }
             break;
            case R.id.cubo:
                if(marcado){
                    mostrarParticular(3);
                    eLadocubo.setText("");
                    ePericubo.setText("");
                    eAreacubo.setText("");
                    eVolumencubo.setText("");
                }
            break;

        }
    }
    //metodo de visibilidad de las vistas
    private void mostrarParticular(int b) {
        switch (b){
            case 0:
                vCuadrado.setVisibility(View.VISIBLE);
                vTriangulo.setVisibility(View.GONE);
                vCirculo.setVisibility(View.GONE);
                vCubo.setVisibility(View.GONE);

            break;
            case 1:
                vCuadrado.setVisibility(View.GONE);
                vTriangulo.setVisibility(View.GONE);
                vCirculo.setVisibility(View.VISIBLE);
                vCubo.setVisibility(View.GONE);
            break;
            case 2:
                vCuadrado.setVisibility(View.GONE);
                vTriangulo.setVisibility(View.VISIBLE);
                vCirculo.setVisibility(View.GONE);
                vCubo.setVisibility(View.GONE);
            break;
            case 3:
                vCuadrado.setVisibility(View.GONE);
                vTriangulo.setVisibility(View.GONE);
                vCirculo.setVisibility(View.GONE);
                vCubo.setVisibility(View.VISIBLE);
            break;

        }


    }
//metodo de los botones de calcular
    public void onButtonclicked(View view) {
        Double pi=3.14159265359;
            switch (view.getId()){
                case R.id.bCalcularC:
                    if(!TextUtils.isEmpty(eLadocuadrado.getText().toString()) ){
                        pcuadrado=Double.parseDouble(eLadocuadrado.getText().toString())*4;
                        acuadrado=Double.parseDouble(eLadocuadrado.getText().toString())*Double.parseDouble(eLadocuadrado.getText().toString());
                        ePericuadrado.setText(pcuadrado.toString());
                        eAreacuadrado.setText(acuadrado.toString());
                    }else{
                        Toast.makeText(this, "Ingrese un valor para el lado del cuadrado", Toast.LENGTH_SHORT).show();
                    }

                break;
                case R.id.bCalcularT:
                    if(!eBasetriangulo.getText().toString().equals("")&&!eAlturatriangulo.getText().toString().equals("")&&!eLadoAtriangulo.getText().toString().equals("")&&!eLadoCtriangulo.getText().toString().equals("")){
                        ptriangulo=Double.parseDouble(eBasetriangulo.getText().toString())+Double.parseDouble(eLadoAtriangulo.getText().toString())+Double.parseDouble(eLadoCtriangulo.getText().toString());
                        atriangulo=(Double.parseDouble(eBasetriangulo.getText().toString())*Double.parseDouble(eAlturatriangulo.getText().toString()))/2;
                        ePeritriangulo.setText(ptriangulo.toString());
                        eAreatriangulo.setText(atriangulo.toString());
                    }else{
                        Toast.makeText(this, "Ingrese un valor para la altura y los lados del triangulo", Toast.LENGTH_SHORT).show();
                    }

                break;
                case R.id.bCalcularCirc:
                    if(!eRadiocirculo.getText().toString().equals("")){
                        pcirculo=Double.parseDouble(eRadiocirculo.getText().toString())*2*pi;
                        acirculo=pi*Double.parseDouble(eRadiocirculo.getText().toString())*Double.parseDouble(eRadiocirculo.getText().toString());
                        ePericirculo.setText(pcirculo.toString());
                        eAreacirculo.setText(acirculo.toString());
                    }else{
                        Toast.makeText(this, "Ingrese un valor para el radio del circulo", Toast.LENGTH_SHORT).show();
                    }

                break;
                case R.id.bCalcularCubo:
                    if(!eLadocubo.getText().toString().equals("")){
                        pcubo=Double.parseDouble(eLadocubo.getText().toString())*Double.parseDouble(eLadocubo.getText().toString());
                        acubo=Double.parseDouble(eLadocubo.getText().toString())*Double.parseDouble(eLadocubo.getText().toString())*6;
                        vcubo=Double.parseDouble(eLadocubo.getText().toString())*Double.parseDouble(eLadocubo.getText().toString())*Double.parseDouble(eLadocubo.getText().toString());
                        ePericubo.setText(pcubo.toString());
                        eAreacubo.setText(acubo.toString());
                        eVolumencubo.setText(vcubo.toString());

                    }else{
                        Toast.makeText(this, "Ingrese un valor para el lado del cubo", Toast.LENGTH_SHORT).show();
                    }

                break;
            }
    }
}
