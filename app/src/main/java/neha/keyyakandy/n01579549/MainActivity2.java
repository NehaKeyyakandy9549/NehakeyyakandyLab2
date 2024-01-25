package neha.keyyakandy.n01579549;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.snackbar.Snackbar;



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
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        View rootView = findViewById(android.R.id.content);
        rootView.setFocusableInTouchMode(true);
        rootView.requestFocus();
        rootView.setOnKeyListener((v, keyCode, event) -> {
            if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
                showSnackbar();
                return true; // consume the event
            }
            return false;
        });
    }

    private void showSnackbar() {
        Snackbar.make(findViewById(android.R.id.content),
                        "Press 'Back' to go to the main screen", Snackbar.LENGTH_LONG)
                .setAction("Back", v -> {
                    // Navigate back to the main screen
                    onBackPressed();
                })
                .show();
    }
}










