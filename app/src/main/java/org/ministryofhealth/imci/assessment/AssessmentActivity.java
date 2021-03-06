package org.ministryofhealth.imci.assessment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.ministryofhealth.imci.R;

public class AssessmentActivity extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnTwo = (Button) findViewById(R.id.two_months);
        Button btnSixty = (Button) findViewById(R.id.sixty_months);

        btnTwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(AssessmentActivity.this,
                        org.ministryofhealth.imci.assessment.What_to_Check_0_2.class);
                startActivity(intent);

            }
        });
        btnSixty.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(AssessmentActivity.this,What_to_Check_2_60.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }

}
