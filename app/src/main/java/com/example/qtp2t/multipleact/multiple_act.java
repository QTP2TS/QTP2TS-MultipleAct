package com.example.qtp2t.multipleact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiple_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_act);
    }
    public void showGreetings(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();

        if (button_text.equals("Open Second Activity")) {

            Intent intent = new Intent(this, multiple_sec.class);
            startActivity(intent);
        }
        else if (button_text.equals("Open Third Activity")) {
            Intent intent = new Intent(this, multiple_thir.class);
            startActivity(intent);
        }
    }

}

