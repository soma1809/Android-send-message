package com.example.sendmessage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sendmessage.*;
public class MainActivity extends AppCompatActivity {

    Button mButton;
    TextView mText;
    EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=(Button)findViewById(R.id.button);
        mText=(TextView)findViewById(R.id.textView);
        mEdit=(EditText)findViewById(R.id.edittext);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=mEdit.getText().toString();
                Socket_creation c=new Socket_creation();
                c.execute(msg);
                mText.setText("Message has been sent");
            }
        });
        }
    }
