package vn.edu.usth.objectdetectmobile;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class DepthModel extends AppCompatActivity {

    private ImageButton buttonBack;
    private SwitchCompat switchMonocular;
    private SwitchCompat switchStereo;
    private RadioGroup switchMode;
    private RadioButton modeA, modeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depth_model);

        initViews();
        setupListeners();
    }

    private void initViews() {
        buttonBack = findViewById(R.id.buttonBack);
        switchMonocular = findViewById(R.id.switchMonocular);
        switchStereo = findViewById(R.id.switchStereo);
        switchMode = findViewById(R.id.switchMode);
        modeA = findViewById(R.id.modeA);
        modeB = findViewById(R.id.modeB);
    }

    private void setupListeners() {
        buttonBack.setOnClickListener(v -> finish());

        // Switch Monocular
        switchMonocular.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // TODO: xử lý khi bật Monocular
            } else {
                // TODO: xử lý khi tắt Monocular
            }
        });

        // Switch Stereo
        switchStereo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // TODO: xử lý khi bật Stereo
            } else {
                // TODO: xử lý khi tắt Stereo
            }
        });

        // RadioGroup Outdoor/Indoor
        switchMode.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.modeA) {
                // TODO: xử lý khi chọn Outdoor
            } else if (checkedId == R.id.modeB) {
                // TODO: xử lý khi chọn Indoor
            }
        });
    }
}
