package neha.keyyakandy.n01579549;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        String fullName = intent.getStringExtra("FULL_NAME");

        TextView textView = findViewById(R.id.textView);
        textView.setText(fullName);


        ImageView imageView = findViewById(R.id.displayImage);
        imageView.setImageResource(R.drawable.butterfly);
    }
}
