package com.example.studygroupapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class createaccount_Activity extends Activity 
{
	Button createButton, backButton;
	EditText id_Edittext, pw_Edittext, pw_c_Edittext, phone_Edittext;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.createac_main);	
		
		createButton = (Button)findViewById(R.id.createButton);
		backButton = (Button)findViewById(R.id.backButton);
		id_Edittext = (EditText)findViewById(R.id.creat_id_edit);
		pw_Edittext = (EditText)findViewById(R.id.creat_pw_edit);
		pw_c_Edittext= (EditText)findViewById(R.id.creat_pwch_edit);
		phone_Edittext= (EditText)findViewById(R.id.creat_phone_edit);
		
		backButton.setOnClickListener(
	    		new OnClickListener() 
	    		{
					
					public void onClick(View v) 
					{
						// TODO Auto-generated method stub
						finish();
					}
				}
	    );
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}