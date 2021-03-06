package com.example.pilottrashbackprototypefeb;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends Activity {
	private EditText nameET, businessET, adressET, numberET;
	private TextView nameTV, businessTV, adressTV, numberTV;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		nameET = (EditText) findViewById(R.id.editText1);
		businessET = (EditText) findViewById(R.id.editText2);
		adressET = (EditText) findViewById(R.id.editText3);
		numberET = (EditText) findViewById(R.id.editText4);

		nameTV = (TextView) findViewById(R.id.textView1);
		businessTV = (TextView) findViewById(R.id.textView2);
		adressTV = (TextView) findViewById(R.id.textView3);
		numberTV = (TextView) findViewById(R.id.textView4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}
	@Override
    public boolean onTouchEvent(final MotionEvent event) {
		nameTV.setText(nameET.getText());
		businessTV.setText(businessET.getText());
		adressTV.setText(adressET.getText());
		numberTV.setText(numberET.getText());
		return false;
    }

	public void RegisterButton(View v) {
		Intent i = new Intent(RegisterActivity.this, MainActivity.class);
		startActivity(i);
	}
}
