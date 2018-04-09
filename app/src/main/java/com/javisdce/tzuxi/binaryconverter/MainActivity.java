package com.javisdce.tzuxi.binaryconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.javisdce.tzuxi.binaryconverter.to_binary_algorythm.ConvertAlgorythm;
import com.javisdce.tzuxi.binaryconverter.to_char_algorythm.ReconvertAlgorythm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = findViewById(R.id.input);
        final TextView output = findViewById(R.id.output);
        final ToggleButton mode_toggle_button = findViewById(R.id.mode_toggle);
        final Button convert_button = findViewById(R.id.convert);

        convert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mode_toggle_button.isChecked()){
                    output.setText(ConvertAlgorythm.convert(input.getText().toString()));
                }else if (mode_toggle_button.isChecked()){
                    output.setText(ReconvertAlgorythm.convert(input.getText().toString()));
                }
            }
        });

        mode_toggle_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    input.setHint(R.string.input_hint_binary);
                    output.setText(R.string.output_label_text);
                }else{
                    input.setHint(R.string.input_hint_text);
                    output.setText(R.string.output_label_binary);
                }
            }
        });
    }
}
