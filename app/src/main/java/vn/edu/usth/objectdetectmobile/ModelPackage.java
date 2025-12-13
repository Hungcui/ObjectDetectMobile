package vn.edu.usth.objectdetectmobile;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ModelPackage extends AppCompatActivity {

    private ImageButton buttonBack;
    private TextView option1, option2;
    private ImageView iconDownload, iconDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_package);

        initViews();
        setupListeners();
    }

    private void initViews() {
        buttonBack = findViewById(R.id.buttonBack);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        iconDownload = findViewById(R.id.iconDownload);
        iconDelete = findViewById(R.id.iconDelete);
    }

    private void setupListeners() {
        buttonBack.setOnClickListener(v -> finish());

        // Option 1: Download model pack
        option1.setOnClickListener(v -> {
            Toast.makeText(this, "Download model pack", Toast.LENGTH_SHORT).show();
            // TODO: thêm logic tải model pack ở đây
        });

        iconDownload.setOnClickListener(v -> {
            Toast.makeText(this, "Download icon clicked", Toast.LENGTH_SHORT).show();
            // TODO: thêm logic tải model pack ở đây
        });

        // Option 2: Delete model pack
        option2.setOnClickListener(v -> {
            Toast.makeText(this, "Delete model pack", Toast.LENGTH_SHORT).show();
            // TODO: thêm logic xóa model pack ở đây
        });

        iconDelete.setOnClickListener(v -> {
            Toast.makeText(this, "Delete icon clicked", Toast.LENGTH_SHORT).show();
            // TODO: thêm logic xóa model pack ở đây
        });
    }
}
