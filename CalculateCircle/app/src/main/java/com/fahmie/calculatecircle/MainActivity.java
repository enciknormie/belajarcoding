package com.fahmie.calculatecircle;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	//declare variable
	private Button btnCalculate;
	private TextView txtViewAnswer;
	private EditText editTextRadius;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		btnCalculate = (Button) findViewById(R.id.btnCalculate);
		txtViewAnswer = (TextView) findViewById(R.id.txtViewAnswer);
		editTextRadius = (EditText) findViewById(R.id.editTextRadius);

		btnCalculate.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){

					//proses input
					//txtViewAnswer.setText(editTextRadius.getText().toString());

					//proses input
					if(!editTextRadius.getText().toString().equals("")){

						//Circle circle1 = new Circle(Double.parseDouble( editTextRadius.getText().toString()));
						txtViewAnswer.setText(editTextRadius.getText().toString());
					}else{
						editTextRadius.setError("Invalid Input");
						//test
					}
			}
			
			});




    }
}
