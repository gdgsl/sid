package com.sin;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class DictionarySinhalaActivity extends Activity {
	TextView name;
	TextView did;
	TextView online;
	EditText text;
	Button search, voiceinput;
	ListView list;
	List<String> msgList = null;
	static final int check = 111;

	Hashtable<String, String> dictionary = new Hashtable<String, String>();

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		list = (ListView) findViewById(R.id.list);
		// AssetFileDescriptor descriptor=null;
		// try {
		// descriptor = getAssets().openFd("ensidict.txt");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// FileReader reader = new FileReader(descriptor.getFileDescriptor());
		final Dictionary dict = new Dictionary();

		System.out.println(dictionary.size());
		name = (TextView) findViewById(R.id.textTest);
		did = (TextView) findViewById(R.id.didYou);
		text = (EditText) findViewById(R.id.search);
		// online = (TextView) findViewById(R.id.onlinetext);
		voiceinput = (Button) findViewById(R.id.speak);
		search = (Button) findViewById(R.id.button);
		msgList = new ArrayList<String>();
		if (!is_online()) {
			voiceinput.setEnabled(false);
		}
		voiceinput.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
				i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
						RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
				i.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speak up!");
				startActivityForResult(i, check);

			}
		});

		Typeface tf = Typeface.createFromAsset(getAssets(),
				"fonts/DhanikaSETT.ttf");
		name.setTypeface(tf);
		text.requestFocus();
		text.requestFocusFromTouch();
		name.setTextSize(15);
		Trans trans=new Trans();
		String sid=trans.UnitoUni("සිඩ්");
		name.setText("Type or speak to "+sid+"..");
		text.setFocusable(true);
		text.setFocusableInTouchMode(true);
		text.setOnKeyListener(new View.OnKeyListener() {
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if (event.getAction() == KeyEvent.ACTION_DOWN) {
					if (keyCode == KeyEvent.KEYCODE_ENTER) {
						search_result();
						return true;
					}
				}
				return false;
			}
		});

		list.setOnItemClickListener(new ListView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int pos,
					long id) {
				try {
					String message = msgList.get(pos);
					text.setText(message);
					search_result();

					// Toast.makeText(this, data,Toast.LENGTH_SHORT); makeText(
					// this, data, Toast.LENGTH_SHORT ).show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

	}

	String history = "-";

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub

		if (requestCode == check && resultCode == RESULT_OK) {
			final ArrayList<String> results = data
					.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
			text.setText(results.get(0).toString());
			list.setAdapter(new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, results));
			search(text.toString());
			search_result();

		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	public boolean is_online() {//checks if connected to any nestwork
		ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo netInfo = cm.getActiveNetworkInfo();
		if (netInfo != null && netInfo.isConnected()) {
			return true;
		} else {
			return false;
		}

	}

	public void search_result() {
		msgList = new ArrayList<String>();
		did.setText("");
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, msgList);

		list.setAdapter(adapter);
		try {
			InputStream is = getAssets().open(
					"dictionary/" + text.getText().toString().charAt(0)
							+ ".txt");
			int size = is.available();
			System.out.println(size);

			Trans tr = new Trans();
			Dictionary dict = new Dictionary();
			if (history.charAt(0) != text.getText().toString().charAt(0)) {
				dictionary = dict.init(is);
			}

			String word = search(text.getText().toString());
			String formatedtext;
			if (word.length() > 100) {
				int number = word.lastIndexOf("|", 100);
				System.out.println(number);
				formatedtext = tr.UnitoUni(word.substring(0, number));
				Typeface tf = Typeface.createFromAsset(getAssets(),
						"fonts/DhanikaSETT.ttf");
				did.setTypeface(tf);
				did.setText(formatedtext);
				did.setTextSize(20);
			} else {
				formatedtext = tr.UnitoUni(word);
				Typeface tf = Typeface.createFromAsset(getAssets(),
						"fonts/DhanikaSETT.ttf");
				did.setTypeface(tf);
				did.setText(formatedtext);
				did.setTextSize(20);
				;
			}
			history = text.getText().toString();
			is.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public void action(View view) {

		search_result();
	}

	public String search(String word) {

		try {

			if (dictionary.containsKey(word)) {
				if (!dictionary.get(word).equals(null)) {

					msgList = new ArrayList<String>();

					return dictionary.get(word).toString();

				} else {
					return "ගැලපෙන වචන නොමැත";

				}

			} else {

				did.setText("Did you mean ?");
				msgList = search_sim(word);
				ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
						android.R.layout.simple_list_item_1, msgList);

				list.setAdapter(adapter);
				return "ගැලපෙන වචන නොමැත";
			}

		} catch (Exception e) {
			return "ගැලපෙන වචන නොමැත";

		}

	}

	public List<String> search_sim(String word) {

		List<String> similar = new ArrayList<String>();
		Enumeration e = dictionary.keys();
		Object a = null;
		String s = "";

		boolean found = false;
		// iterate through Hashtable keys Enumeration
		System.out.println(word.length());
		for (int i = word.length(); i > 0; i--) {
			System.out.println(word.substring(0, i));
			while (e.hasMoreElements()) {
				s = e.nextElement().toString();
				if (s.contains(word.substring(0, i))) {
					found = true;
					similar.add(s);

				}
			}
			e = dictionary.keys();
			if (found)
				break;

		}

		return similar;
	}

}