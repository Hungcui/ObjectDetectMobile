package vn.edu.usth.objectdetectmobile;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Guide extends AppCompatActivity {

    private ImageButton buttonBack;
    private TextView guideText1, guideText2, guideText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);

        initViews();
        setupListeners();
    }

    private void initViews() {
        buttonBack = findViewById(R.id.buttonBack);
        guideText1 = findViewById(R.id.guideText1);
        guideText2 = findViewById(R.id.guideText2);
        guideText3 = findViewById(R.id.guideText3);
    }

    private void setupListeners() {
        buttonBack.setOnClickListener(v -> finish());
    }
}
