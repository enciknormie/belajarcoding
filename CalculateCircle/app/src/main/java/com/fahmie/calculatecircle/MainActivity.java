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
					if(editTextRadius.getText() != null){

						Circle circle1 = new Circle(editTextRadius.getText());

					}



					//Toast.makeText(MainActivity.this, "num = " + circle1.getArea(),Toast.LENGTH_LONG).show();
					txtViewAnswer.setText("" + circle1.getArea());




				}
			});




    }
}
