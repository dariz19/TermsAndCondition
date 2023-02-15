package terms.Condition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermsAndAgreement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_agreement);

        Button agreeButton = findViewById(R.id.agree_button);
        agreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the main activity
                Intent intent = new Intent(TermsAndAgreement.this, MainActivity.class);
                startActivity(intent);

                // Finish this activity so the user can't go back to it
                finish();
            }
        });
    }
}