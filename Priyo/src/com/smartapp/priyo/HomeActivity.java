package com.smartapp.priyo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.smartapp.coverflow.CoverAdapterView;
import com.smartapp.coverflow.CoverAdapterView.OnItemClickListener;
import com.smartapp.coverflow.CoverAdapterView.OnItemSelectedListener;
import com.smartapp.coverflow.CoverFlow;

public class HomeActivity extends SherlockActivity {
	ActionBar actionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		actionBar = getSupportActionBar();
		actionBar.setDisplayShowHomeEnabled(true);

		// coverFlow.setSelection(8, true);
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

		LayoutInflater inflator = LayoutInflater.from(this);
		View v = inflator.inflate(R.layout.myabs_layout_home, null);
		TextView ABStitle = (TextView) v.findViewById(R.id.myabs_title);
		ABStitle.setText("Cars and Automobiles");
		TextView nu = (TextView) findViewById(R.id.newuser);
	    nu.setText(Html.fromHtml("<a href=http://automotive.hearst.com>new USER?"));
	    nu.setMovementMethod(LinkMovementMethod.getInstance());
		actionBar.setCustomView(v);
		
		Button si = (Button)findViewById(R.id.bsignin);
	    si.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	                EditText username_text = (EditText)findViewById(R.id.uid);
	                EditText pass_text = (EditText)findViewById(R.id.passw);
	                /*
	                HttpClient httpclient = new DefaultHttpClient();
	                HttpPost httppost = new HttpPost("http://10.0.2.2/login.php");
					*/
	                try {
	                    // Add your data
	                /*    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
	                    nameValuePairs.add(new BasicNameValuePair("username", username_text.getText().toString()));
	                    nameValuePairs.add(new BasicNameValuePair("password", pass_text.getText().toString()));
	                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

	                    // Execute HTTP Post Request
	                    HttpResponse response = httpclient.execute(httppost);

	                    InputStream inputStream = response.getEntity().getContent();

	                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

	                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	                    String bufferedStrChunk = null;
						
	                    if((bufferedStrChunk = bufferedReader.readLine()) != null){
	                    	if(bufferedStrChunk.equals("Successful")){
	                    */	if("Successful".equals("Successful")){	
	                    		Intent am = new Intent("com.smartapp.priyo.MAINACTIVITY"); /*Main Activity*/
	        					startActivity(am);
	                    	}
	                    	else{
	                    		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(HomeActivity.this);
	                     
	                    			// set title
	                    			alertDialogBuilder.setTitle("Your Title");
	                     
	                    			// set dialog message
	                    			alertDialogBuilder
	                    				.setMessage("UserID & Password Mismatch!")
	                    				.setCancelable(false)
	                    				.setPositiveButton("Try again",new DialogInterface.OnClickListener() {
	                    					public void onClick(DialogInterface dialog,int id) {
	                    						// if this button is clicked, close
	                    						// current activity
	                    						EditText username_text = (EditText)findViewById(R.id.uid);
	                    		                EditText pass_text = (EditText)findViewById(R.id.passw);
	                    		                username_text.setText("");
	                    		                pass_text.setText("");
	                    					}
	                    				  })
	                    				.setNegativeButton("Exit",new DialogInterface.OnClickListener() {
	                    					public void onClick(DialogInterface dialog,int id) {
	                    						// if this button is clicked, just close
	                    						// the dialog box and do nothing
	                    						HomeActivity.this.finish();
	                    					}
	                    				});
	                     
	                    				// create alert dialog
	                    				AlertDialog alertDialog = alertDialogBuilder.create();
	                     
	                    				// show it
	                    				alertDialog.show();
	                    	}
	                   // }
	                } /*catch (ClientProtocolException e) {
	                    // TODO Auto-generated catch block
	                }*/ catch (/*IOException*/ Exception e) {
	                    // TODO Auto-generated catch block
	                }
    
	            }
	        }); 

	}

}
