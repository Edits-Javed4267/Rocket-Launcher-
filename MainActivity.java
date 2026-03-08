package com.rocketlauncher.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner editionSpinner;
    Spinner serverSpinner;
    EditText versionInput;
    EditText playerInput;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editionSpinner = findViewById(R.id.edition);
        serverSpinner = findViewById(R.id.serverType);
        versionInput = findViewById(R.id.version);
        playerInput = findViewById(R.id.players);
        startButton = findViewById(R.id.startServer);

        String[] editions = {"Java", "Bedrock"};
        String[] serverTypes = {"Vanilla", "Fabric", "Optifine"};

        ArrayAdapter<String> editionAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, editions);

        ArrayAdapter<String> serverAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, serverTypes);

        editionSpinner.setAdapter(editionAdapter);
        serverSpinner.setAdapter(serverAdapter);

        startButton.setOnClickListener(v -> {

            String edition = editionSpinner.getSelectedItem().toString();
            String server = serverSpinner.getSelectedItem().toString();
            String version = versionInput.getText().toString();
            String players = playerInput.getText().toString();

            String message =
                    "Starting Server\nEdition: " + edition +
                    "\nType: " + server +
                    "\nVersion: " + version +
                    "\nSlots: " + players;

            Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

        });
    }
          }
