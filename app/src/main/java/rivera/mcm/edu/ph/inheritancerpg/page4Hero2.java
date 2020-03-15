package rivera.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class page4Hero2 extends AppCompatActivity {
    int lvl;
    TextView a,b,c,d,e,f,g,h,i,j,k,l;
    Button btn4, btn5;
    String value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4_hero2);

        btn4 = findViewById(R.id.button);
        btn5 = findViewById(R.id.button2);
        a = findViewById(R.id.n1);
        b = findViewById(R.id.n2);
        c = findViewById(R.id.n3);
        d = findViewById(R.id.n4);
        e = findViewById(R.id.n5);
        f = findViewById(R.id.n6);
        g = findViewById(R.id.n7);
        h = findViewById(R.id.n8);
        i = findViewById(R.id.n9);
        j = findViewById(R.id.n10);
        k = findViewById(R.id.t2);
        l = findViewById(R.id.name);

        String ay = getIntent().getStringExtra("et1");
        String si = getIntent().getStringExtra("depart");

        btn4.setText("Back");
        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ("Warrior".equals(value)){
                            Hero kay = new Hero (6,1,250,100,20,10,30,10,"Warrior",
                                    40,18,15,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Tank".equals(value)){
                            Hero kay = new Hero (7,1,400,100,40,15,100,100,"Tank",
                                    40,18,15,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                    }
                        else if ("Samurai".equals(value)){
                            Hero kay = new Hero (8,1,350,120,55,20,90,80,"Samurai",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Mage".equals(value)){
                            Hero kay = new Hero (9,1,150,250,23,30,20,20,"Mage",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Summoner".equals(value)){
                            Hero kay = new Hero (10,1,350,300,15,30,20,30,"Summoner",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Alchemist".equals(value)){
                            Hero kay = new Hero (11,1,200,250,10,45,35,35,"Alchemist",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Rogue".equals(value)){
                            Hero kay = new Hero (12,1,200,145,35,20,25,25,"Rogue",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Assassin".equals(value)){
                            Hero kay = new Hero (13,1,200,200,40,35,20,20,"Assasin",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Hunter".equals(value)){
                            Hero kay = new Hero (14,1,150,250,50,10,20,20,"Hunter",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Cleric".equals(value)){
                            Hero kay = new Hero (15,1,250,100,25,30,45,45,"Cleric",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Paladin".equals(value)){
                            Hero kay = new Hero (16,1,300,100,45,25,50,50,"Paladin",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("White Mage".equals(value)){
                            Hero kay = new Hero (17,1,200,300,15,40,40,40,"White Mage",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Archer".equals(value)){
                            Hero kay = new Hero (18,1,150,135,50,10,25,20,"Archer",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Bard".equals(value)){
                            Hero kay = new Hero (19,1,160,150,55,5,20,20,"Bardr",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                        else if ("Dancer".equals(value)){
                            Hero kay = new Hero (20,1,150,100,10,30,25,25,"Dancer",
                                    30,30,10,5,5,5);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText(String.valueOf(kay.getBaseSTR()));
                            h.setText(String.valueOf(kay.getBaseAGI()));
                            i.setText(String.valueOf(kay.getBaseINT()));
                        }
                }
                }
        );

    }
}
