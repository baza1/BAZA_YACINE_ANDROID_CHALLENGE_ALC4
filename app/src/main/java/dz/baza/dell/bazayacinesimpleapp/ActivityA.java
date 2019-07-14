package dz.baza.dell.bazayacinesimpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    private Button btnAbout;

    private Button btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        btnAbout= (Button) findViewById(R.id.btnAbout);
        btnProfile = (Button) findViewById(R.id.btnProfile);
        getSupportActionBar().setTitle("ALC 4 Phase 1");

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(ActivityA.this, ActivityB.class);
                startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(ActivityA.this, ActivityC.class);
                startActivity(intent);
            }
        });
    }
}
