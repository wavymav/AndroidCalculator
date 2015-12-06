package io.wavymav.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editOperand;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private Button btnClear;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editOperand = (EditText) findViewById(R.id.editOperand);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand.getText().length() > 0) {
                    double currentTotal = Double.parseDouble(txtResult.getText().toString());
                    double operand1 = Double.parseDouble(editOperand.getText().toString());

                    currentTotal += operand1;
                    editOperand.setText("");
                    txtResult.setText(Double.toString(currentTotal));
                } else {
                    Toast.makeText(MainActivity.this, "Please make sure you enter a number in the text filed", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand.getText().length() > 0) {
                    double currentTotal = Double.parseDouble(txtResult.getText().toString());
                    double operand1 = Double.parseDouble(editOperand.getText().toString());

                    currentTotal -= operand1;
                    editOperand.setText("");
                    txtResult.setText(Double.toString(currentTotal));
                } else {
                    Toast.makeText(MainActivity.this, "Please make sure you enter a number in the text filed", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand.getText().length() > 0) {
                    double currentTotal = Double.parseDouble(txtResult.getText().toString());
                    double operand1 = Double.parseDouble(editOperand.getText().toString());

                    currentTotal /= operand1;
                    editOperand.setText("");
                    txtResult.setText(Double.toString(currentTotal));
                } else {
                    Toast.makeText(MainActivity.this, "Please make sure you enter a number in the text filed", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand.getText().length() > 0) {
                    double currentTotal = Double.parseDouble(txtResult.getText().toString());
                    double operand1 = Double.parseDouble(editOperand.getText().toString());

                    currentTotal *= operand1;
                    editOperand.setText("");
                    txtResult.setText(Double.toString(currentTotal));
                } else {
                    Toast.makeText(MainActivity.this, "Please make sure you enter a number in the text filed", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editOperand.setText("");
                txtResult.setText("0.00");
                editOperand.requestFocus();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
