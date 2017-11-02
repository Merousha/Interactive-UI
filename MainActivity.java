package com.example.vanil_singh.myapplication;
import android . os . Bundle;
import android . support . v7 . app . AppCompatActivity;
import android . view . View ;
import android.widget.Button;
import android . widget . EditText ;
import android . widget . TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    EditText edit1;
    TextView text;
    TextView text1;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.edtName);
        edit1 = (EditText) findViewById(R.id.edtSurname);

        text = (TextView) findViewById(R.id.nameTV);
        text1 = (TextView) findViewById(R.id.surnameTV);
        Button b = (Button) findViewById(R.id.send_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit.getText().toString();
                text.append(name);

                String surname = edit1.getText().toString();
                text1.append(surname);
            }
        });

    }
}
