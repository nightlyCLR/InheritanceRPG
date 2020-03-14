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

    Spinner spin2,spin3;
    Button btn2;
    EditText e1, e2;
    String yay;
    String value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_hero1);

        btn2 = findViewById(R.id.la);
        e1 = findViewById(R.id.et1);
        value = String.valueOf(e1);

        final Spinner spin2 = (Spinner) findViewById(R.id.s2);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,
                R.array.heroes,android.R.layout.simple_spinner_item);
        spin2.setAdapter(adapter);
        spin2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        yay=spin2.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );




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
