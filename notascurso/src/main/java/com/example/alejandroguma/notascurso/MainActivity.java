package com.example.alejandroguma.notascurso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    Button bcalculo;
    EditText practicas,avance1,avance2,avance3,appfinal;
    Double res=0.0,n1,n2,n3,n4,n5;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bcalculo=(Button)findViewById(R.id.bcalculo);
        resultado=(TextView)findViewById(R.id.resultado);
        practicas=(EditText) findViewById(R.id.practicas);
        avance1=(EditText)findViewById(R.id.avance1);
        avance2=(EditText)findViewById(R.id.avance2);
        avance3=(EditText)findViewById(R.id.avance3);
        appfinal=(EditText)findViewById(R.id.apfinal);



    bcalculo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1=Double.parseDouble(practicas.getText().toString());
            n2=Double.parseDouble(avance1.getText().toString());
            n3=Double.parseDouble(avance2.getText().toString());
            n4=Double.parseDouble(avance3.getText().toString());
            n5=Double.parseDouble(appfinal.getText().toString());

             if ((n1>=0&&n1<=5)&&(n2>=0&&n2<=5)&&(n3>=0&&n3<=5)&&(n4>=0&&n4<=5)&&(n5>=0&&n5<=5)){
                 res=(n1*0.6)+(n2*0.05)+(n3*0.07)+(n4*0.08)+(n5*0.2);
                 resultado.setText(res.toString());
                 if(res>=0 && res<=1){
                     Toast.makeText(MainActivity.this, "Estas en el lugar equivocado", Toast.LENGTH_SHORT).show();
                 }else if (res>=1.1 && res<=2){
                     Toast.makeText(MainActivity.this, "Remal", Toast.LENGTH_SHORT).show();
                 }else if (res>=2.1 && res<=3){
                     Toast.makeText(MainActivity.this, "Es posible recuperarse", Toast.LENGTH_SHORT).show();
                 }else if (res>=3.1 && res<=4){
                     Toast.makeText(MainActivity.this, "Normalito", Toast.LENGTH_SHORT).show();
                 }else if (res>=4.1 && res<=4.5){
                     Toast.makeText(MainActivity.this, "Muy Bien", Toast.LENGTH_SHORT).show();
                 }else if (res>=4.6 && res<=5){
                     Toast.makeText(MainActivity.this, "Excelente estudiante", Toast.LENGTH_SHORT).show();
                 }
             }else{
                 resultado.setText("");
                 Toast.makeText(MainActivity.this, "Error,ingrese valores entre 0 y 5", Toast.LENGTH_SHORT).show();
             }


        }
    });


    }
}
