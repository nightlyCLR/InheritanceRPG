package rivera.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class page4Hero2 extends AppCompatActivity {
    TextView a,b,c,d,e,f,g,h,i,j,k;
    Button btn4, btn5;
    String value;
    Spinner spin2;
    ImageView i1war, i2tan, i3sam, i4mag, i5sum, i6alc, i7rog, i8ass, i9hun, i10cle, i11pal, i12whi, i13arc, i14bar;



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

        i1war = findViewById(R.id.i1);
        i2tan = findViewById(R.id.i2);
        i3sam = findViewById(R.id.i3);
        i4mag = findViewById(R.id.i4);
        i5sum = findViewById(R.id.i5);
        i6alc = findViewById(R.id.i6);
        i7rog = findViewById(R.id.i7);
        i8ass = findViewById(R.id.i8);
        i9hun = findViewById(R.id.i9);
        i10cle = findViewById(R.id.i10);
        i11pal = findViewById(R.id.i11);
        i12whi = findViewById(R.id.i12);
        i13arc = findViewById(R.id.i13);
        i14bar = findViewById(R.id.i14);


        i1war.setVisibility(View.GONE);
        i2tan.setVisibility(View.GONE);
        i3sam.setVisibility(View.GONE);
        i4mag.setVisibility(View.GONE);
        i5sum.setVisibility(View.GONE);
        i6alc.setVisibility(View.GONE);
        i7rog.setVisibility(View.GONE);
        i8ass.setVisibility(View.GONE);
        i9hun.setVisibility(View.GONE);
        i10cle.setVisibility(View.GONE);
        i11pal.setVisibility(View.GONE);
        i12whi.setVisibility(View.GONE);
        i13arc.setVisibility(View.GONE);
        i14bar.setVisibility(View.GONE);
        spin2 = findViewById(R.id.spin);

        spin2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        value = spin2.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        btn4.setText("ok");
        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ("Warrior".equals(value)){
                            Hero kay = new Hero (6,1,250,100,20,10,30,10,"Warrior",
                                    40,18,15,5,5,5,
                                    "Warrior: Once that fights with a shield and sword a balance of a jack of all trades character but can literally be a walking shield for it's team mates in the succeeding class.");

                            i1war.setVisibility(View.VISIBLE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Tank".equals(value)){
                            Hero kay = new Hero (7,1,400,100,40,15,100,100,"Tank",
                                    40,18,15,5,5,5, "Tank: His purpose is to absorb damage and prevent others from being attacked.");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.VISIBLE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                    }
                        else if ("Samurai".equals(value)){
                            Hero kay = new Hero (8,1,350,120,55,20,90,80,"Samurai",
                                    30,30,10,5,5,5, "Samurai: an agile swordsman that is not afraid to get in close\n" +
                                    "and disrupt his targets in an instant");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.VISIBLE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Mage".equals(value)){
                            Hero kay = new Hero (9,1,150,250,23,30,20,20,"Mage",
                                    30,30,10,5,5,5,"Mage: Uses magic to support its allies or rain death upon its enenmies.");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.VISIBLE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Summoner".equals(value)){
                            Hero kay = new Hero (10,1,350,300,15,30,20,30,"Summoner",
                                    30,30,10,5,5,5, "Summoner: She deceives and confuses her enemies by closing the gap quickly\n" +
                                    "to deal a powerful blow, then dodge just when the situation starts to look bad.");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.VISIBLE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Alchemist".equals(value)){
                            Hero kay = new Hero (11,1,200,250,10,45,35,35,"Alchemist",
                                    30,30,10,5,5,5, "Alchemist: is an INT based caster who uses formulate instead of conventional spells. He require preparation, but cast quickly when needed. He learns these formulae similar to the way a wizard learns spells, but he has spell slots like a warlock.");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.VISIBLE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Rogue".equals(value)){
                            Hero kay = new Hero (12,1,200,145,35,20,25,25,"Rogue",
                                    30,30,10,5,5,5,"Rogue: Uses certain utilities to confuse the enemy and strike on the most unexpected moments.");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.VISIBLE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Assassin".equals(value)){
                            Hero kay = new Hero (13,1,200,200,40,35,20,20,"Assassin",
                                    30,30,10,5,5,5,"Assassin: Are able to equip a weapon in each hand and the exclusive users.  Assassins have a variety of damage dealing and poisoning skills. The Assassin are the only class who can walk slightly faster than any other class as long as they leveled the proper skill  ");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.VISIBLE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Hunter".equals(value)){
                            Hero kay = new Hero (14,1,150,250,50,10,20,20,"Hunter",
                                    30,30,10,5,5,5, "Hunter: ");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.VISIBLE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Cleric".equals(value)){
                            Hero kay = new Hero (15,1,250,100,25,30,45,45,"Cleric",
                                    30,30,10,5,5,5,"Cleric: A sturdy warrior who practices the arts of divine magic an easy encounter to the undead race.");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.VISIBLE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Paladin".equals(value)){
                            Hero kay = new Hero (16,1,300,100,45,25,50,50,"Paladin",
                                    30,30,10,5,5,5, "Paladin: ");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.VISIBLE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("White Mage".equals(value)){
                            Hero kay = new Hero (17,1,200,300,15,40,40,40,"White Mage",
                                    30,30,10,5,5,5, "White Mage: ");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.VISIBLE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Archer".equals(value)){
                            Hero kay = new Hero (18,1,150,135,50,10,25,20,"Archer",
                                    30,30,10,5,5,5, "Archer: has the skills that makes advantage of her dexterity. She can rain arrows down on her foes follow up with more attacks or back away from them in an instant.");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.VISIBLE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Bard".equals(value)){
                            Hero kay = new Hero (19,1,160,150,55,5,20,20,"Bard",
                                    30,30,10,5,5,5, "Bard: ");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.VISIBLE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                        else if ("Dancer".equals(value)){
                            Hero kay = new Hero (20,1,150,100,10,30,25,25,"Dancer",
                                    30,30,10,5,5,5,"Dancer: ");

                            i1war.setVisibility(View.GONE);
                            i2tan.setVisibility(View.GONE);
                            i3sam.setVisibility(View.GONE);
                            i4mag.setVisibility(View.GONE);
                            i5sum.setVisibility(View.GONE);
                            i6alc.setVisibility(View.GONE);
                            i7rog.setVisibility(View.GONE);
                            i8ass.setVisibility(View.GONE);
                            i9hun.setVisibility(View.GONE);
                            i10cle.setVisibility(View.GONE);
                            i11pal.setVisibility(View.GONE);
                            i12whi.setVisibility(View.GONE);
                            i13arc.setVisibility(View.GONE);
                            i14bar.setVisibility(View.GONE);

                            a.setText("HP: " + kay.getBasehp());
                            b.setText("MP: "+kay.getBasemp());
                            c.setText("Mdef: "+kay.getPatk());
                            d.setText("Pdef: "+kay.getMatk());
                            e.setText("Matck: "+kay.getPdef());
                            f.setText("Patck: "+kay.getMdef());
                            g.setText("STR: " + kay.getBaseSTR());
                            h.setText("AGI: " + kay.getBaseAGI());
                            i.setText("INT: " + kay.getIntGrowth());
                            k.setText(kay.getDesc());
                        }
                }
                }
        );

    }
}
