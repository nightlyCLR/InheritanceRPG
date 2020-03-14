package rivera.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = findViewById(R.id.hero);
        final Button btn2 = findViewById(R.id.mon);

        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, page2monsters.class);
                        startActivity(i);
                    }
                    }
        );

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent lu = new Intent(MainActivity.this, page3Hero1.class);
                        startActivity(lu);
                    }
                }
        );
}
    }