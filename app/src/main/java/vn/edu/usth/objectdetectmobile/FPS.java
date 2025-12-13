package vn.edu.usth.objectdetectmobile;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FPS extends AppCompatActivity {

    private ImageButton buttonBack;
    private TextView option1, option2, option3, option4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fps);

        initViews();
        setupListeners();
    }

    private void initViews() {
        buttonBack = findViewById(R.id.buttonBack);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
    }

    private void setupListeners() {
        buttonBack.setOnClickListener(v -> finish());

        // Option 1: 24 FPS
        option1.setOnClickListener(v -> {
            Toast.makeText(this, "Selected 24 FPS", Toast.LENGTH_SHORT).show();
            // TODO: xử lý logic chọn 24 FPS
        });

        // Option 2: 30 FPS
        option2.setOnClickListener(v -> {
            Toast.makeText(this, "Selected 30 FPS", Toast.LENGTH_SHORT).show();
            // TODO: xử lý logic chọn 30 FPS
        });

        // Option 3: 60 FPS
        option3.setOnClickListener(v -> {
            Toast.makeText(this, "Selected 60 FPS", Toast.LENGTH_SHORT).show();
            // TODO: xử lý logic chọn 60 FPS
        });

        // Option 4: 120 FPS
        option4.setOnClickListener(v -> {
            Toast.makeText(this, "Selected 120 FPS", Toast.LENGTH_SHORT).show();
            // TODO: xử lý logic chọn 120 FPS
        });
    }
}
