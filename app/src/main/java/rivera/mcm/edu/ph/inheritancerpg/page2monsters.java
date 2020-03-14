package rivera.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class page2monsters extends AppCompatActivity {

    Spinner spin1;
    TextView a, b, c, d, e, f, g;
    Button btn3;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2monsters);

        btn3 = findViewById(R.id.kk);

        a = findViewById(R.id.tv);
        b = findViewById(R.id.tv3);
        c = findViewById(R.id.tv2);
        d = findViewById(R.id.tv8);
        e = findViewById(R.id.tv4);
        f = findViewById(R.id.tv5);
        g = findViewById(R.id.descript);

        final Spinner spin1 = (Spinner) findViewById(R.id.s2);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,
                R.array.monsters,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter);
        spin1.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        value=spin1.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        btn3.setText("Ok");

        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (value.equals("Golem")){
                            Monsters bi = new Monsters( 01,
                                150, 40, 30, 30,25, 25,
                                "Definition: Golem," +
                                        " A huge chunk of rock who practices" +
                                        "the arts of dinine magic, an easy" +
                                        "counter to the undead race.");


                            a.setText("HP: " + bi.getBasehp());
                            b.setText("MP: "+bi.getBasemp());
                            c.setText("Mdef: "+bi.getPatk());
                            d.setText("Pdef: "+bi.getMatk());
                            e.setText("Matck: "+bi.getPdef());
                            f.setText("Patck: "+bi.getMdef());
                            g.setText(String.valueOf(bi.getDesc()));

                        }
                        else if (value.equals("Salamander")){
                            Monsters si = new Monsters( 02,
                                    80, 100, 10, 40,10, 15,
                                    "Definition: Salamander" +
                                            " A much lesser form of a dragon but" +
                                            "is still considered a threat by" +
                                            "due to it's burning capabilities.");

                            a.setText("HP: " +si.getBasehp());
                            b.setText("MP: "+si.getBasemp());
                            c.setText("Mdef: "+si.getPatk());
                            d.setText("Pdef: "+si.getMatk());
                            e.setText("Matck: "+si.getPdef());
                            f.setText("Patck: "+si.getMdef());
                            g.setText(String.valueOf(si.getDesc()));

                        }
                        else if (value.equals("Dragon")){
                            Monsters si = new Monsters( 03,
                                    400, 150, 40, 40,25, 25,
                                    "Definition: Dragon" +
                                            "One that is feared by all and could easily " +
                                            "turn the tides of battle due to it's " +
                                            "ferocious breathand steeel hard scales");

                            a.setText("HP: " +si.getBasehp());
                            b.setText("MP: "+si.getBasemp());
                            c.setText("Mdef: "+si.getPatk());
                            d.setText("Pdef: "+si.getMatk());
                            e.setText("Matck: "+si.getPdef());
                            f.setText("Patck: "+si.getMdef());
                            g.setText(String.valueOf(si.getDesc()));

                        }
                        else if (value.equals("Sylph")){
                            Monsters si = new Monsters( 04,
                                    200, 350, 20, 40,25, 25,
                                    "Definition: Sylph" +
                                            "A priest who devoted its life into the " +
                                            "art of hearing primarily excels at the " +
                                            "backline kepping and sustaining a battle.");

                            a.setText("HP: " +si.getBasehp());
                            b.setText("MP: "+si.getBasemp());
                            c.setText("Mdef: "+si.getPatk());
                            d.setText("Pdef: "+si.getMatk());
                            e.setText("Matck: "+si.getPdef());
                            f.setText("Patck: "+si.getMdef());
                            g.setText(String.valueOf(si.getDesc()));

                        }
                        else if (value.equals("Skeleton")){
                            Monsters si = new Monsters( 05,
                                    100, 80, 30, 10,25, 15,
                                    "Definition: Skeleton" +
                                            "Versatile and is typically a pawn in every " +
                                            "field but is very useful due to it spiking " +
                                            "fear into mens hearts with it's aura.");

                            a.setText("HP: " +si.getBasehp());
                            b.setText("MP: "+si.getBasemp());
                            c.setText("Mdef: "+si.getPatk());
                            d.setText("Pdef: "+si.getMatk());
                            e.setText("Matck: "+si.getPdef());
                            f.setText("Patck: "+si.getMdef());
                            g.setText(String.valueOf(si.getDesc()));

                        }

                                }


                }
        );

    }
}
