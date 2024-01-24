package neha.keyyakandy.n01579549;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    }
}