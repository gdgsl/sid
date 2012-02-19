package com.sin;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

import android.content.Context;
import android.content.res.AssetFileDescriptor;

public class Dictionary {

	public Hashtable init(InputStream stream) {

		Hashtable<String, String> h = new Hashtable<String, String>();
		String words[];
		String value[] = null;
		try {
			// Open the file that is the first
			// command line parameter

			// FileInputStream fstream = new
			// FileInputStream("/sdcard/dictionary/"+word.charAt(0)+".txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(stream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			int count = 0;

			// br.)
			// Read File Line By Line
			// if(br.readLine().charAt(0))

			while ((strLine = br.readLine()) != null) {
				count++;
				words = strLine.split("=");

				// if(words[0].c)

				h.put(words[0], words[1]);

				// System.out.println(words[0]);

			}

			System.out.println(h.size());
			// System.out.println(h.get("zoo"));

			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e);
		}

		return h;
	}

}
