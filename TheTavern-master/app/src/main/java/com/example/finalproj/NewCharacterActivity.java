package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewCharacterActivity extends AppCompatActivity {

    private Button nextButton;
    private RadioGroup raceRadio;
    private RadioButton elfRadio;
    private RadioButton dragonRadio;
    private RadioButton humanRadio;
    private RadioButton gnomeRadio;
    private RadioButton tieflingRadio;
    private RadioButton dwarfRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_character);

        nextButton = findViewById(R.id.nextButton);
        raceRadio = findViewById(R.id.raceRadioGroup);
        elfRadio = findViewById(R.id.elfRadio);
        dragonRadio = findViewById(R.id.dragonRadio);
        humanRadio = findViewById(R.id.humanRadio);
        gnomeRadio = findViewById(R.id.gnomeRadio);
        dwarfRadio = findViewById(R.id.dwarfRadio);
        tieflingRadio = findViewById(R.id.tieflingRadio);



        nextButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewCharacterActivity.this, ClassPageCharCreation.class);
                startActivity(i);
                if (elfRadio.isChecked()) {



                } else if (dragonRadio.isChecked()) {

                } else if (humanRadio.isChecked()) {

                } else if (gnomeRadio.isChecked()) {

                }else if (dwarfRadio.isChecked()) {
                    ;
                }else if (tieflingRadio.isChecked()) {
                    ;
                }
                else {
                    Toast.makeText(NewCharacterActivity.this, "Please select an answer!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}





