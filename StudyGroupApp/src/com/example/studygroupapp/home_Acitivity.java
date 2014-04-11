package com.example.studygroupapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class home_Acitivity extends Activity
{
	Button createbutton, myroomButton, seachButton;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_main);
		
		createbutton =(Button)findViewById(R.id.createroomButton);
		myroomButton =(Button)findViewById(R.id.mystudyButton);
		seachButton =(Button)findViewById(R.id.seachButton);
		
		createbutton.setOnClickListener(
	    		new OnClickListener() 
	    		{
					
					public void onClick(View v) 
					{
						// TODO Auto-generated method stub
						Intent intent1 = new Intent(getApplicationContext(), Createroom_Acitivity.class);
						startActivity(intent1);
					}
				}
	    );
		
		seachButton.setOnClickListener(
	    		new OnClickListener() 
	    		{
					
					public void onClick(View v) 
					{
						// TODO Auto-generated method stub
						Intent intent2 = new Intent(getApplicationContext(), Seachroom_Activity.class);
						startActivity(intent2);
					}
				}
	    );
		
		myroomButton.setOnClickListener(
	    		new OnClickListener() 
	    		{
					
					public void onClick(View v) 
					{
						// TODO Auto-generated method stub
						Intent intent3 = new Intent(getApplicationContext(), Mystudyroom_Activity.class);
						startActivity(intent3);
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
