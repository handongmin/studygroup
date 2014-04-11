package com.example.studygroupapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 
{
	Button loginButton, joinButton;
	EditText idEdittext, pwEdittext;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_main);
		startActivity(new Intent(this, load_Activity.class));
		loginButton = (Button)findViewById(R.id.loginbtn);
		joinButton = (Button)findViewById(R.id.joinbtn);
		idEdittext = (EditText)findViewById(R.id.idEdit);
		pwEdittext = (EditText)findViewById(R.id.pwEdit);
		
		
		joinButton.setOnClickListener(
	    		new OnClickListener() 
	    		{
					
					public void onClick(View v) 
					{
						// TODO Auto-generated method stub
						Intent intent1 = new Intent(getApplicationContext(), createaccount_Activity.class);
						startActivity(intent1);
					}
				}
	    );
		
		loginButton.setOnClickListener(
	    		new OnClickListener() 
	    		{
					
					public void onClick(View v) 
					{
						// TODO Auto-generated method stub
						Intent intent2 = new Intent(getApplicationContext(), home_Acitivity.class);
						startActivity(intent2);
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
