package com.example.loginsignupanddashboard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize views
        ImageView profilePicture = findViewById(R.id.profilePicture);
        TextView userName = findViewById(R.id.userName);
        TextView userEmail = findViewById(R.id.userEmail);
//        Button viewProfileButton = findViewById(R.id.viewProfileButton);
        Button logoutButton = findViewById(R.id.logoutButton);
//        Button feature1Button = findViewById(R.id.feature1Button);
//        Button feature2Button = findViewById(R.id.feature2Button);

        // Dummy user data (replace with actual user data from intent or storage)
        userName.setText("Welcome, John Doe!");
        userEmail.setText("johndoe@example.com");

//        // View Profile button click listener
//        viewProfileButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(DashboardActivity.this, "View Profile clicked!", Toast.LENGTH_SHORT).show();
//                // Add navigation logic if needed
//            }
//        });

        // Logout button click listener
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Logged out!", Toast.LENGTH_SHORT).show();
                // Redirect to LoginActivity
                Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

//        // Feature 1 button click listener
//        feature1Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(DashboardActivity.this, "Feature 1 clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // Feature 2 button click listener
//        feature2Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(DashboardActivity.this, "Feature 2 clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
