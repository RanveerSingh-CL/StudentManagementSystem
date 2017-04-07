package com.example.rishucuber.sample.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





import com.example.rishucuber.sample.R;



public class  MainActivity extends Activity{

    private TextView mTextViewName, mTextViewSchool, mTextViewEmail, mTextViewPhone, mTextViewGender;
    Button mButtonCreateStudent;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // check that it is the SecondActivity with an OK result
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {

                // get String data from Intent
                String returnName = data.getStringExtra("name");
                String returnSchool = data.getStringExtra("school");
                String returnEmail = data.getStringExtra("email");
                String returnPhone = data.getStringExtra("phone");
                String returnGender = data.getStringExtra("gender");


                // set text view with string
                mTextViewName.setText(returnName);
                mTextViewSchool.setText(returnSchool);
                mTextViewEmail.setText(returnEmail);
                mTextViewPhone.setText(returnPhone);
                mTextViewGender.setText(returnGender);

            }
        }

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mTextViewName = (TextView) findViewById(R.id.textView);
        mTextViewSchool = (TextView) findViewById(R.id.textView1);
        mTextViewEmail = (TextView) findViewById(R.id.textView2);
        mTextViewPhone = (TextView) findViewById(R.id.textView3);
        mTextViewGender = (TextView) findViewById(R.id.textView4);
        mButtonCreateStudent = (Button) findViewById(R.id.button);
        mButtonCreateStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CreateStudent.class);
                startActivityForResult(i, 1);


            }
        });





    }


}
