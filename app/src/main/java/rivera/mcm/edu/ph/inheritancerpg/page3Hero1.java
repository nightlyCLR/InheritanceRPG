package rivera.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class page3Hero1 extends AppCompatActivity {

    Spinner spin2;
    Button btn2;
    EditText e1;
    String yay;
    String value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_hero1);

        btn2 = findViewById(R.id.la);
        e1 = findViewById(R.id.et1);
        value = String.valueOf(e1);
        spin2 = findViewById(R.id.s2);

        spin2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        yay = spin2.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        btn2.setText("next");
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (e1.equals("")) {
                            Toast.makeText(page3Hero1.this,
                                    "Please complete the form",
                                    Toast.LENGTH_LONG).show();
                        } else {
                            Intent i = new Intent(page3Hero1.this, page4Hero2.class);
                            i.putExtra("et1", value);
                            i.putExtra("depart", String.valueOf(spin2.getSelectedItem()));
                            startActivity(i);

                        }
                    }
                }
        );


    }
}
