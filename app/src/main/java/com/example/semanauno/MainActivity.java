package com.example.semanauno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTheme(R.style.CustmizeTheme);
        setContentView(R.layout.activity_main);
        setupUI();
    }

    private void  setupUI(){
        final TextView mTextView = (TextView)findViewById(R.id.textView);
        final EditText mEditText= (EditText)findViewById(R.id.editView);
        final Button mButton = (Button) findViewById(R.id.button);
        final Button mButtonNew = (Button) findViewById(R.id.button_new);
        mTextView.setText(R.string.app_name);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","content is"+mEditText.getText());
                Toast.makeText(getApplicationContext(),"Hola",Toast.LENGTH_LONG).show();
                if(mEditText.getText().toString().trim().equals(""))
                    mTextView.setText(R.string.app_name);
                else
                    mTextView.setText(mEditText.getText());
            }
        });

        mButtonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("NewActivity","content is");
                Intent intent= new Intent();
                intent.setClass(getApplicationContext(), NewActivity.class);
                startActivity(intent);
            }
        });
    }

}
