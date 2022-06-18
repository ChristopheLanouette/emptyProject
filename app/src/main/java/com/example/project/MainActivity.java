package com.example.project;
// Androidx/Appcompat
import androidx.appcompat.app.AppCompatActivity;
// Android imports
import android.os.Bundle;
import android.widget.TextView;
// B2 SDK
import com.backblaze.b2.client.B2Sdk;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
