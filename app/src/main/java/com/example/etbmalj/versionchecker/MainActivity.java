package com.example.etbmalj.versionchecker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VersionChecker versionChecker = new VersionChecker();
        try {
            String latestVersion = versionChecker.execute().get();
            Toast.makeText(MainActivity.this, latestVersion, Toast.LENGTH_LONG).show();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
