package example.uasapps;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uas.R;

public class HelloActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
}