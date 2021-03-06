package android.example.powerreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String status =
                intent.getStringExtra(MainActivity.STATUS_MESSAGE);
        TextView textView = findViewById(R.id.statusView);
        textView.setText(status);
        ImageView checkBox = findViewById(R.id.imageView2);
        if (status.equals("Receivers NOT Working")) {
            checkBox.setBackgroundResource(R.drawable.ic_baseline_check_box_outline_blank_24);
        } else {
            checkBox.setBackgroundResource(R.drawable.ic_baseline_check_box_24);
        }
    }
}