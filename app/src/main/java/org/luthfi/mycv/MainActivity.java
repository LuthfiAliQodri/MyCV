package org.luthfi.mycv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout about = findViewById(R.id.about);
        about.setOnClickListener(this);

        LinearLayout education = findViewById(R.id.education);
        education.setOnClickListener(this);

        LinearLayout contact = findViewById(R.id.contact);
        contact.setOnClickListener(this);

        LinearLayout organi = findViewById(R.id.exp);
        organi.setOnClickListener(this);

        LinearLayout cert = findViewById(R.id.cert);
        cert.setOnClickListener(this);

        LinearLayout skiil = findViewById(R.id.skill);
        skiil.setOnClickListener(this);

        LinearLayout portofolio = findViewById(R.id.portofolio);
        portofolio.setOnClickListener(this);

        LinearLayout report = findViewById(R.id.report);
        report.setOnClickListener(this);

        LinearLayout info = findViewById(R.id.appinfo);
        info.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.about:
                Intent moveAbout = new Intent(MainActivity.this, About.class);
                startActivity(moveAbout);
                break;
            case R.id.education:
                Intent moveEducation = new Intent(MainActivity.this, Education.class);
                startActivity(moveEducation);
                break;
            case R.id.skill:
                Intent moveSkill = new Intent(MainActivity.this, Skiil.class);
                startActivity(moveSkill);
                break;
            case R.id.exp:
                Intent moveExp = new Intent(MainActivity.this, Organization.class);
                startActivity(moveExp);
                break;
            case R.id.contact:
                Intent moveContact = new Intent(MainActivity.this, Contact.class);
                startActivity(moveContact);
                break;
            case R.id.cert:
                Intent moveCert = new Intent(MainActivity.this, Certificate.class);
                startActivity(moveCert);
                break;
            case R.id.portofolio:
                Intent movePortofolio = new Intent(MainActivity.this, Portofolio.class);
                startActivity(movePortofolio);
                break;
            case R.id.report:
                Intent moveReport = new Intent(MainActivity.this, Report.class);
                startActivity(moveReport);
                break;
            case R.id.appinfo:
                Intent moveInfo = new Intent(MainActivity.this, AppInfo.class);
                startActivity(moveInfo);
                break;
        }
    }

}
