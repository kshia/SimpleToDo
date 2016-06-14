package com.facebook.kshia.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditItemActivity extends AppCompatActivity {

    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String currText = getIntent().getStringExtra("itemText");
        position = getIntent().getIntExtra("positionNum", 0);
        EditText displayCurr = (EditText) findViewById(R.id.editText);
        displayCurr.setText("");
        displayCurr.append(currText);
    }

    public void onSave(View v) {
        Intent i = new Intent();
        EditText displayCurr = (EditText) findViewById(R.id.editText);
        i.putExtra("newText", displayCurr.getText().toString());
        i.putExtra("positionNum2", position);
        setResult(RESULT_OK, i);
        finish();
    }
}
