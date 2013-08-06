package com.yene.cubegame;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CubeMain extends Activity {
	WebView myWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cube_main);
	}

	
	@SuppressLint({ "SetJavaScriptEnabled", "SetJavaScriptEnabled" })
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cube_main, menu);
		
		myWebView = (WebView) findViewById(R.id.cube);
		myWebView.loadUrl("file:///android_asset/cube/cube.html");
		myWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		
		return true;
	}

}
