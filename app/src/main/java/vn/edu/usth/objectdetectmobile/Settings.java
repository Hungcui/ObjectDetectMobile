package vn.edu.usth.objectdetectmobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    private ImageButton buttonBack;
    private TextView option1, option2, option3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        initViews();
        setupListeners();
    }

    private void initViews() {
        buttonBack = findViewById(R.id.buttonBack);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
    }

    private void setupListeners() {
        buttonBack.setOnClickListener(v -> finish());

        // Option 1: Depth model
        option1.setOnClickListener(v -> {
            Intent intent = new Intent(Settings.this, DepthModel.class);
            startActivity(intent);
        });

        // Option 2: Model package
        option2.setOnClickListener(v -> {
            Intent intent = new Intent(Settings.this, ModelPackage.class);
            startActivity(intent);
        });

        // Option 3: FPS
        option3.setOnClickListener(v -> {
            Intent intent = new Intent(Settings.this, FPS.class);
            startActivity(intent);
        });
    }
}
