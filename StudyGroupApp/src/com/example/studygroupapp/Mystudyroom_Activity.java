package com.example.studygroupapp;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class Mystudyroom_Activity extends Activity 
{
	ArrayList<String> list;
    ArrayAdapter<String> adapter;
    ListView Studylist;
    Button backButton;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mystudyroom_main);
		
		  list = new ArrayList<String>();
          list.add("���� 800��");
          list.add("�Ӻ����͵�1");
          list.add("�Ӻ����͵�2");
          list.add("�Ӻ����͵�3");
          list.add("�Ӻ����͵�4");
          list.add("�Ӻ����͵�5");
          list.add("�Ӻ����͵�6");
          list.add("�Ӻ����͵�7");
          list.add("�Ӻ����͵�8");

          adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

          Studylist = (ListView) findViewById(R.id.listView1);
          backButton = (Button) findViewById(R.id.button1);
          Studylist.setAdapter(adapter);
          
          Studylist.setOnItemClickListener(new OnItemClickListener(){
        	  
        	  public void onItemClick(AdapterView<?> arg0, View v, int position,long id)
        	  {
        		  String str = (String)adapter.getItem(position);
        		  Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
        	  }
          });
          

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
