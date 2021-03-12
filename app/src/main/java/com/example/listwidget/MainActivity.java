package com.example.listwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TableLayout table;
    private TextInputEditText inputI;
    private TextInputEditText inputP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        table = (TableLayout)findViewById(R.id.list);
        inputI = (TextInputEditText)findViewById(R.id.itemBox);
        inputP = (TextInputEditText)findViewById(R.id.priceBox);
    }

    public void buttonClicked(View view){
        TableRow tableRow;
        tableRow = new TableRow(this);
        TextView text =  new TextView(this);
        text.setText(inputI.getText());
        tableRow.addView(text,0);
        TextView text2 = new TextView(this);
        text2.setText(inputP.getText());
        tableRow.addView(text2, 1);
        table.setY(200);
        table.addView(tableRow);
    }



}