package com.example.pilottrashbackprototypefeb;

import se.mah.k3lara.skaneAPI.xmalparser.XMLParser;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		 new LongOperation().execute("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}
	
	private class LongOperation extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
    		XMLParser parser = new XMLParser();
    		String result = parser.getXmlFromUrl( "http://api.thingspeak.com/update?key=EDN7O90L314XP5NT&field1=723&field2=34&field3=25");
    		System.out.println(result);
            TextView txt = (TextView) findViewById(R.id.output);
            txt.setText("Executed");
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
        }

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected void onProgressUpdate(Void... values) {
        }
    }


}
