package app.thirdeye.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Login Activity - Handles user authentication with offline support
 */
public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    
    private EditText usernameInput;
    private EditText passwordInput;
    private Button signInButton;
    private Button signUpButton;
    private Button guestButton;
    private TextView statusText;
    private TextView offlineIndicator;
    
    private AuthManager authManager;
    private OfflineManager offlineManager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        authManager = new AuthManager(this);
        offlineManager = new OfflineManager(this);
        
        // Check if already logged in
        if (authManager.isLoggedIn()) {
            navigateToMain();
            return;
        }
        
        initializeViews();
        setupListeners();
        updateOfflineStatus();
    }
    
    private void initializeViews() {
        usernameInput = findViewById(R.id.input_username);
        passwordInput = findViewById(R.id.input_password);
        signInButton = findViewById(R.id.btn_sign_in);
        signUpButton = findViewById(R.id.btn_sign_up);
        guestButton = findViewById(R.id.btn_guest);
        statusText = findViewById(R.id.tv_status);
        offlineIndicator = findViewById(R.id.tv_offline_indicator);
    }
    
    private void setupListeners() {
        signInButton.setOnClickListener(v -> handleSignIn());
        signUpButton.setOnClickListener(v -> handleSignUp());
        guestButton.setOnClickListener(v -> handleGuestLogin());
    }
    
    private void handleSignIn() {
        String username = usernameInput.getText().toString().trim();
        String password = passwordInput.getText().toString();
        
        if (username.isEmpty()) {
            showError("Please enter username");
            return;
        }
        
        if (password.isEmpty()) {
            showError("Please enter password");
            return;
        }
        
        // Check if user has stored credentials
        if (!authManager.hasStoredCredentials()) {
            showError("No account found. Please sign up first.");
            return;
        }
        
        // Attempt sign in (offline validation)
        if (authManager.signIn(username, password)) {
            showSuccess("Welcome back, " + username + "!");
            navigateToMain();
        } else {
            showError("Invalid username or password");
        }
    }
    
    private void handleSignUp() {
        String username = usernameInput.getText().toString().trim();
        String password = passwordInput.getText().toString();
        
        if (username.isEmpty()) {
            showError("Please enter username");
            return;
        }
        
        if (password.isEmpty()) {
            showError("Please enter password");
            return;
        }
        
        if (password.length() < 6) {
            showError("Password must be at least 6 characters");
            return;
        }
        
        // Check if user already exists
        if (authManager.hasStoredCredentials()) {
            showError("Account already exists. Please sign in.");
            return;
        }
        
        // Create new account (offline storage)
        if (authManager.signUp(username, password)) {
            showSuccess("Account created successfully!");
            navigateToMain();
        } else {
            showError("Failed to create account");
        }
    }
    
    private void handleGuestLogin() {
        if (authManager.loginAsGuest()) {
            showSuccess("Continuing as guest");
            navigateToMain();
        } else {
            showError("Failed to login as guest");
        }
    }
    
    private void navigateToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
    
    private void updateOfflineStatus() {
        if (!offlineManager.isOnline()) {
            offlineIndicator.setVisibility(View.VISIBLE);
            offlineIndicator.setText("⚠ Offline Mode - Limited features available");
            statusText.setText("You can still sign in or continue as guest");
        } else {
            offlineIndicator.setVisibility(View.GONE);
            statusText.setText("Sign in to access all features");
        }
    }
    
    private void showError(String message) {
        statusText.setText(message);
        statusText.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    
    private void showSuccess(String message) {
        statusText.setText(message);
        statusText.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
