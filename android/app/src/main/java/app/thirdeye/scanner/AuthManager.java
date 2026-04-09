package app.thirdeye.scanner;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;

import android.util.Base64;
import java.security.MessageDigest;

/**
 * Authentication Manager - Handles user authentication with offline support
 */
public class AuthManager {
    private static final String TAG = "AuthManager";
    private static final String PREFS_NAME = "auth_prefs";
    private static final String KEY_IS_LOGGED_IN = "is_logged_in";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD_HASH = "password_hash";
    private static final String KEY_IS_GUEST = "is_guest";
    private static final String KEY_LAST_LOGIN = "last_login";
    
    private final SharedPreferences prefs;
    private final Context context;
    
    public AuthManager(Context context) {
        this.context = context.getApplicationContext();
        this.prefs = getEncryptedPreferences();
    }
    
    /**
     * Get encrypted shared preferences for secure credential storage
     */
    private SharedPreferences getEncryptedPreferences() {
        try {
            MasterKey masterKey = new MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build();
                
            return EncryptedSharedPreferences.create(
                context,
                PREFS_NAME,
                masterKey,
                EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            );
        } catch (Exception e) {
            Log.e(TAG, "Failed to create encrypted preferences, using regular", e);
            return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        }
    }
    
    /**
     * Check if user is logged in (including guest mode)
     */
    public boolean isLoggedIn() {
        return prefs.getBoolean(KEY_IS_LOGGED_IN, false);
    }
    
    /**
     * Check if user is in guest mode
     */
    public boolean isGuestMode() {
        return prefs.getBoolean(KEY_IS_GUEST, false);
    }
    
    /**
     * Get current username
     */
    public String getUsername() {
        return prefs.getString(KEY_USERNAME, "Guest");
    }
    
    /**
     * Login as guest (offline mode)
     */
    public boolean loginAsGuest() {
        try {
            prefs.edit()
                .putBoolean(KEY_IS_LOGGED_IN, true)
                .putBoolean(KEY_IS_GUEST, true)
                .putString(KEY_USERNAME, "Guest")
                .putLong(KEY_LAST_LOGIN, System.currentTimeMillis())
                .apply();
            Log.d(TAG, "Guest login successful");
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Guest login failed", e);
            return false;
        }
    }
    
    /**
     * Sign up new user (offline storage)
     */
    public boolean signUp(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            Log.e(TAG, "Username cannot be empty");
            return false;
        }
        
        if (password == null || password.length() < 6) {
            Log.e(TAG, "Password must be at least 6 characters");
            return false;
        }
        
        try {
            String passwordHash = hashPassword(password);
            prefs.edit()
                .putBoolean(KEY_IS_LOGGED_IN, true)
                .putBoolean(KEY_IS_GUEST, false)
                .putString(KEY_USERNAME, username)
                .putString(KEY_PASSWORD_HASH, passwordHash)
                .putLong(KEY_LAST_LOGIN, System.currentTimeMillis())
                .apply();
            Log.d(TAG, "Sign up successful for user: " + username);
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Sign up failed", e);
            return false;
        }
    }
    
    /**
     * Sign in existing user (offline validation)
     */
    public boolean signIn(String username, String password) {
        String storedUsername = prefs.getString(KEY_USERNAME, null);
        String storedPasswordHash = prefs.getString(KEY_PASSWORD_HASH, null);
        
        if (storedUsername == null || storedPasswordHash == null) {
            Log.e(TAG, "No stored credentials found");
            return false;
        }
        
        if (!storedUsername.equals(username)) {
            Log.e(TAG, "Username mismatch");
            return false;
        }
        
        try {
            String passwordHash = hashPassword(password);
            if (!storedPasswordHash.equals(passwordHash)) {
                Log.e(TAG, "Password mismatch");
                return false;
            }
            
            prefs.edit()
                .putBoolean(KEY_IS_LOGGED_IN, true)
                .putBoolean(KEY_IS_GUEST, false)
                .putLong(KEY_LAST_LOGIN, System.currentTimeMillis())
                .apply();
            Log.d(TAG, "Sign in successful for user: " + username);
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Sign in failed", e);
            return false;
        }
    }
    
    /**
     * Logout current user
     */
    public void logout() {
        prefs.edit()
            .putBoolean(KEY_IS_LOGGED_IN, false)
            .putBoolean(KEY_IS_GUEST, false)
            .apply();
        Log.d(TAG, "User logged out");
    }
    
    /**
     * Check if user has previously signed up
     */
    public boolean hasStoredCredentials() {
        return prefs.getString(KEY_PASSWORD_HASH, null) != null;
    }
    
    /**
     * Hash password using SHA-256
     */
    private String hashPassword(String password) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes("UTF-8"));
        return Base64.encodeToString(hash, Base64.NO_WRAP);
    }
    
    /**
     * Get last login timestamp
     */
    public long getLastLoginTime() {
        return prefs.getLong(KEY_LAST_LOGIN, 0);
    }
}
