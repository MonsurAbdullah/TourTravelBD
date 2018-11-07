package maker.app.tourtravelbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity implements View.OnClickListener{

    private Button dhaka,khulna,chittagonj,barisal,rangpur,may,rajshahi,sylshet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        dhaka = findViewById(R.id.dhakaID);
        khulna = findViewById(R.id.khulnaID);
        chittagonj = findViewById(R.id.chittagongID);
        barisal = findViewById(R.id.barisalID);
        rangpur = findViewById(R.id.rangpurID);
        may = findViewById(R.id.mayID);
        rajshahi = findViewById(R.id.rajshahiID);
        sylshet = findViewById(R.id.sylhetID);
        dhaka.setOnClickListener(this);
        khulna.setOnClickListener(this);
        chittagonj.setOnClickListener(this);
        barisal.setOnClickListener(this);
        rangpur.setOnClickListener(this);
        may.setOnClickListener(this);
        rajshahi.setOnClickListener(this);
        sylshet.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== dhaka.getId()){
            Intent intent = new Intent(WelcomePage.this, maker.app.tourtravelbd.dhaka.class);
            startActivity(intent);
        }

        if(view.getId()== khulna.getId()){

            Intent intent = new Intent(WelcomePage.this, khul.class);
            startActivity(intent);
        }
        if(view.getId()== barisal.getId()){

            Intent intent = new Intent(WelcomePage.this, bar.class);
            startActivity(intent);
        }
        if(view.getId()== rajshahi.getId()){

            Intent intent = new Intent(WelcomePage.this, raj.class);
            startActivity(intent);
        }
        if(view.getId()== rangpur.getId()){

            Intent intent = new Intent(WelcomePage.this, rang.class);
            startActivity(intent);
        }

        if(view.getId()== may.getId()){

            Intent intent = new Intent(WelcomePage.this, maya.class);
            startActivity(intent);
        }

        if(view.getId()== sylshet.getId()){

            Intent intent = new Intent(WelcomePage.this, sylh.class);
            startActivity(intent);
        }

        if(view.getId()== chittagonj.getId()){

            Intent intent = new Intent(WelcomePage.this, ctg.class);
            startActivity(intent);
        }

        }
}

