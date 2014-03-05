package com.example.pilottrashbackprototypefeb;

import se.mah.k3.trashback.XMLParser;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
	private CheckBox checkPET, checkCB, checkWP, checkMP;
	String checkedMaterials;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		checkPET = (CheckBox) findViewById(R.id.checkBox1);
		checkCB = (CheckBox) findViewById(R.id.checkBox2);
		checkWP = (CheckBox) findViewById(R.id.checkBox3);
		checkMP = (CheckBox) findViewById(R.id.checkBox4);
		
		//TestXML
		XMLParser parser = new XMLParser();
		String result = parser.getXmlFromUrl( "http://api.thingspeak.com/update?key=EDN7O90L314XP5NT&field1=723&field2=34&field3=25");
		Log.i("test","Result is: "+result);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void MessageButton(View v) {
		if (checkPET.isChecked()) {
			checkedMaterials += "PET ";
		}
		if (checkCB.isChecked()) {
			checkedMaterials += "Cardboard ";
		}
		if (checkWP.isChecked()) {
			checkedMaterials += "White Paper ";
		}
		if (checkMP.isChecked()) {
			checkedMaterials += "Mixed Paper ";
		}
		Toast.makeText(getApplicationContext(), "Message sent to Trashback",
				Toast.LENGTH_LONG).show();
	}

}
