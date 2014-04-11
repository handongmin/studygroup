package com.example.studygroupapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Build;

public class Createroom_Acitivity extends Activity 
{

	
	Button createButton, cancleButton;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_createroom__acitivity);
		
		createButton = (Button)findViewById(R.id.button1);
		cancleButton = (Button)findViewById(R.id.button2);
		
		cancleButton.setOnClickListener(
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
