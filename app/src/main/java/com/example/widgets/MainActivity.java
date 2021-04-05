package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent; // Importing this and the following import makes it easier for me to redirect users to my github. Not going to lie, it was an easy solution found online and works very well.
import android.net.Uri; // For this Dugga I wanted to avoid using a webview so I tested a solution that utilized importing these two resources.
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button_github);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/a17jespe/")); // Assigns the action of opening URL to the variable intent
                startActivity(intent); // Triggers the activity intent which opens the URL
            }
        });
    }
}
