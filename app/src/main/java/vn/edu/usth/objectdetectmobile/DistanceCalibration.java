package vn.edu.usth.objectdetectmobile;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DistanceCalibration extends AppCompatActivity {

    private ImageButton buttonBack;
    private ImageView iconSettings;
    private TextView titleSettings;
    private TextView originalDistance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distance_calibration);

        initViews();
        setupListeners();
    }

    private void initViews() {
        buttonBack = findViewById(R.id.buttonBack);
        iconSettings = findViewById(R.id.iconSettings);
        titleSettings = findViewById(R.id.titleSettings);
        originalDistance = findViewById(R.id.originalDistance);
    }

    private void setupListeners() {
        buttonBack.setOnClickListener(v -> finish());
    }
}
