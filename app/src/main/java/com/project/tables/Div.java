package com.project.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.Precision;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Div extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button button;
    TextView result;
    double ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textView);

        // set clickListener on button
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {

        switch (v.getId()) {

            case R.id.button:
                StringBuffer buffer = new StringBuffer();
                float res;

                // get the input number from editText
                String fs = editText.getText().toString();

                // convert it to integer
                float n = Integer.parseInt(fs);

                // build the logic for table
                for (int i = 1; i <= 10; i++) {


                    ans = (n / i);
                    DecimalFormat twoDForm = new DecimalFormat("#.##");
                     ans=Double.valueOf(twoDForm.format(ans));
                    buffer.append(Math.round(n) + "  /  " + i
                            + "  =  " +ans+ "\n\n");
                }

                // set the buffer textview
                result.setText(buffer);
                break;
        }
    }
}