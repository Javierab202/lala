package com.example.calculadoraradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNum1, edtNum2;
    private RadioButton rbSumar, rbRestar, rbMultiplicar, rbDividir;
    private TextView resultado;
    private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1= (EditText) findViewById(R.id.editTextNumero1);
        edtNum2= (EditText) findViewById(R.id.editTextNumero2);
        rbSumar= (RadioButton) findViewById(R.id.radioButtonSumar);
        rbRestar= (RadioButton) findViewById(R.id.radioButtonRestar);
        rbMultiplicar=(RadioButton) findViewById(R.id.radioButtonMultiplicar);
        rbDividir=(RadioButton) findViewById(R.id.radioButtonDividir);
        resultado= (TextView) findViewById(R.id.textViewResultado);

    }

    public void Calcular(View view){

        int num1= Integer.parseInt(edtNum1.getText().toString());
        int num2= Integer.parseInt(edtNum2.getText().toString());

        if(rbSumar.isChecked() == true){
            int suma = num1+num2;
            resultado.setText(String.valueOf(suma));
        }else if(rbRestar.isChecked()==true){
            int resta= num1-num2;
            resultado.setText(String.valueOf(resta));
        }else if(rbMultiplicar.isChecked()==true){
            int multiplicar = num1*num2;
            resultado.setText(String.valueOf(multiplicar));
        }else if(rbDividir.isChecked()==true){
            if(num2!=0){
            int dividir= num1/num2;
            resultado.setText(String.valueOf(dividir));
            }else{
                resultado.setText(String.valueOf(0));
            }
        }
    }
}
