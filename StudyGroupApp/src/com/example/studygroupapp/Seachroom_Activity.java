package com.example.studygroupapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Build;

public class Seachroom_Activity extends Activity 
{

	Button backButton;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seachroom_activity);
		backButton = (Button)findViewById(R.id.button2);
		
		backButton.setOnClickListener(
	    		new OnClickListener() 
	    		{
					
					public void onClick(View v) 
					{
						// TODO Auto-generated method stub
						Intent intent1 = new Intent(getApplicationContext(), home_Acitivity.class);
						startActivity(intent1);
					}
				}
	    );
		
	}


}
