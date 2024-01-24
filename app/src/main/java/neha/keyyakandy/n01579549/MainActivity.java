package neha.keyyakandy.n01579549;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = findViewById(R.id.button2);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Neha Keyyakandy", Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("FULL_NAME", "Neha Keyyakandy");
                startActivity(intent);
            }
        });
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
                        "Press 'Close' to exit", Snackbar.LENGTH_LONG)
                .setAction("Close", v -> finish())
                .show();



    }


}