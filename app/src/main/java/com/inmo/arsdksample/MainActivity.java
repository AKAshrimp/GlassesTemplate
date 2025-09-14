package com.inmo.arsdksample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 找到TextView並設置Hello World文字
        TextView textView = findViewById(R.id.hello_text);
        textView.setText("Hello World!");
    }
}
