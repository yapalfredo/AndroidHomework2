package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MiddleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);

    }

    public void buttonOnClicked(View view)
    {
        switch(view.getId())
        {
            case R.id.btnMiddlePrev:
                //Will close current activity and go back
                //to the first activity
                finish();
                break;
            case R.id.btnMiddleNext:
                //Will load the next activity
                //which is the LastActivity.java
                Intent intent = new Intent(MiddleActivity.this, LastActivity.class);
                startActivity(intent);
                break;
        }
    }
}
