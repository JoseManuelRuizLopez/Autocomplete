package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    TextView resultado;
    AutoCompleteTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = (TextView)findViewById(R.id.textView1);
        textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        String[] datos = { "Android", "Windows Vista", "Windows 7",
                "Windows 8", "Ubuntu 12.04", "Ubuntu 12.10", "Mac OSX", "iOS 5",
                "iOS 6", "Solaris", "Kubuntu", "Suse" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, datos);


        // Se establece el Adapter
        textView.setAdapter(adapter);

        textView.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        resultado.setText(textView.getText().toString());
    }
}
