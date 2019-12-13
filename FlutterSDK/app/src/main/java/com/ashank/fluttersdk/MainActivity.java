package com.ashank.fluttersdk;

import androidx.appcompat.app.AppCompatActivity;
import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textView = findViewById(R.id.textView);
		textView.setOnClickListener(v -> {
			FlutterView flutterView =  Flutter.createView(MainActivity.this,getLifecycle(),null);
			setContentView(flutterView);
		});
	}
}
