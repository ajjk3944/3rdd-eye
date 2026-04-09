package app.thirdeye.scanner.routerguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;
import android.util.Base64;
import android.util.Log;

import com.getcapacitor.JSObject;

import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public class RouterCredentialDatabase extends SQLiteOpenHelper {
    private static final String TAG = "RouterCredentialDB";
    private static final String DB_NAME = "router_credentials.db";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "router_credentials";
    
    private static final String KEYSTORE_ALIAS = "RouterCredentialKey";
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final int GCM_TAG_LENGTH = 128;
    
    private static RouterCredentialDatabase instance;
    private Context context;

    public static synchronized RouterCredentialDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new RouterCredentialDatabase(context.getApplicationContext());
        }
        return instance;
    }

    private RouterCredentialDatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
        initializeKeystore();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "router_ip TEXT NOT NULL," +
                "router_brand TEXT," +
                "router_model TEXT," +
                "username TEXT NOT NULL," +
                "password TEXT NOT NULL," +
                "auth_method TEXT DEFAULT 'http'," +
                "login_url TEXT," +
                "is_active INTEGER DEFAULT 1," +
                "last_connected INTEGER," +
                "created_at INTEGER NOT NULL," +
                "updated_at INTEGER NOT NULL" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Future upgrades
    }

    private void initializeKeystore() {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
            keyStore.load(null);
            
            if (!keyStore.containsAlias(KEYSTORE_ALIAS)) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(
                    KeyProperties.KEY_ALGORITHM_AES, ANDROID_KEYSTORE);
                
                KeyGenParameterSpec keyGenParameterSpec = new KeyGenParameterSpec.Builder(
                    KEYSTORE_ALIAS,
                    KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                    .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                    .setRandomizedEncryptionRequired(true)
                    .build();
                
                keyGenerator.init(keyGenParameterSpec);
                keyGenerator.generateKey();
                Log.d(TAG, "Keystore initialized successfully");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error initializing keystore: " + e.getMessage(), e);
        }
    }

    private String encryptPassword(String plaintext) {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
            keyStore.load(null);
            
            SecretKey secretKey = (SecretKey) keyStore.getKey(KEYSTORE_ALIAS, null);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            
            byte[] iv = cipher.getIV();
            byte[] encrypted = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));
            
            // Combine IV and encrypted data: [IV_LENGTH(4 bytes)][IV][ENCRYPTED_DATA]
            byte[] combined = new byte[4 + iv.length + encrypted.length];
            combined[0] = (byte) (iv.length >> 24);
            combined[1] = (byte) (iv.length >> 16);
            combined[2] = (byte) (iv.length >> 8);
            combined[3] = (byte) iv.length;
            System.arraycopy(iv, 0, combined, 4, iv.length);
            System.arraycopy(encrypted, 0, combined, 4 + iv.length, encrypted.length);
            
            return Base64.encodeToString(combined, Base64.NO_WRAP);
        } catch (Exception e) {
            Log.e(TAG, "Error encrypting password: " + e.getMessage(), e);
            return null;
        }
    }

    private String decryptPassword(String encrypted) {
        try {
            byte[] combined = Base64.decode(encrypted, Base64.NO_WRAP);
            
            // Extract IV length
            int ivLength = ((combined[0] & 0xFF) << 24) |
                          ((combined[1] & 0xFF) << 16) |
                          ((combined[2] & 0xFF) << 8) |
                          (combined[3] & 0xFF);
            
            // Extract IV and encrypted data
            byte[] iv = new byte[ivLength];
            byte[] encryptedData = new byte[combined.length - 4 - ivLength];
            System.arraycopy(combined, 4, iv, 0, ivLength);
            System.arraycopy(combined, 4 + ivLength, encryptedData, 0, encryptedData.length);
            
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
            keyStore.load(null);
            
            SecretKey secretKey = (SecretKey) keyStore.getKey(KEYSTORE_ALIAS, null);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec spec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, spec);
            
            byte[] decrypted = cipher.doFinal(encryptedData);
            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            Log.e(TAG, "Error decrypting password: " + e.getMessage(), e);
            return null;
        }
    }

    public long saveCredentials(String routerIP, String brand, String model, String username, 
                                String password, String authMethod, String loginUrl) {
        SQLiteDatabase db = getWritableDatabase();
        long timestamp = System.currentTimeMillis();
        
        String encryptedPassword = encryptPassword(password);
        if (encryptedPassword == null) {
            Log.e(TAG, "Failed to encrypt password");
            return -1;
        }
        
        ContentValues values = new ContentValues();
        values.put("router_ip", routerIP);
        values.put("router_brand", brand);
        values.put("router_model", model);
        values.put("username", username);
        values.put("password", encryptedPassword);
        values.put("auth_method", authMethod != null ? authMethod : "http");
        values.put("login_url", loginUrl);
        values.put("is_active", 1);
        values.put("created_at", timestamp);
        values.put("updated_at", timestamp);
        
        // Check if router already exists
        Cursor cursor = db.query(TABLE_NAME, new String[]{"id"}, 
            "router_ip = ?", new String[]{routerIP}, null, null, null);
        
        long id;
        if (cursor.moveToFirst()) {
            // Update existing
            id = cursor.getLong(0);
            db.update(TABLE_NAME, values, "id = ?", new String[]{String.valueOf(id)});
            Log.d(TAG, "Updated router credentials: " + routerIP);
        } else {
            // Insert new and set as active
            setAllInactive(db);
            id = db.insert(TABLE_NAME, null, values);
            Log.d(TAG, "Saved new router credentials: " + routerIP);
        }
        cursor.close();
        
        return id;
    }

    public JSObject getActiveCredentials() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, null, "is_active = 1", null, null, null, null);
        
        JSObject result = null;
        if (cursor.moveToFirst()) {
            result = cursorToJSObject(cursor, false);
        }
        cursor.close();
        return result;
    }

    public String getActivePassword() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, new String[]{"password"}, 
            "is_active = 1", null, null, null, null);
        
        String password = null;
        if (cursor.moveToFirst()) {
            String encrypted = cursor.getString(0);
            password = decryptPassword(encrypted);
        }
        cursor.close();
        return password;
    }

    public List<JSObject> getAllCredentials() {
        List<JSObject> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, null, null, null, null, null, "updated_at DESC");
        
        while (cursor.moveToNext()) {
            list.add(cursorToJSObject(cursor, false));
        }
        cursor.close();
        return list;
    }

    public boolean deleteCredentials(int id) {
        SQLiteDatabase db = getWritableDatabase();
        int rows = db.delete(TABLE_NAME, "id = ?", new String[]{String.valueOf(id)});
        Log.d(TAG, "Deleted router credentials: " + id);
        return rows > 0;
    }

    public void updateLastConnected(int id) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("last_connected", System.currentTimeMillis());
        values.put("updated_at", System.currentTimeMillis());
        db.update(TABLE_NAME, values, "id = ?", new String[]{String.valueOf(id)});
    }

    public void setActive(int id) {
        SQLiteDatabase db = getWritableDatabase();
        
        // Deactivate all
        setAllInactive(db);
        
        // Activate selected
        ContentValues values = new ContentValues();
        values.put("is_active", 1);
        values.put("updated_at", System.currentTimeMillis());
        db.update(TABLE_NAME, values, "id = ?", new String[]{String.valueOf(id)});
        Log.d(TAG, "Set active router: " + id);
    }

    private void setAllInactive(SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put("is_active", 0);
        db.update(TABLE_NAME, values, null, null);
    }

    private JSObject cursorToJSObject(Cursor cursor, boolean includePassword) {
        JSObject obj = new JSObject();
        obj.put("id", cursor.getInt(cursor.getColumnIndexOrThrow("id")));
        obj.put("routerIp", cursor.getString(cursor.getColumnIndexOrThrow("router_ip")));
        obj.put("brand", cursor.getString(cursor.getColumnIndexOrThrow("router_brand")));
        obj.put("model", cursor.getString(cursor.getColumnIndexOrThrow("router_model")));
        obj.put("username", cursor.getString(cursor.getColumnIndexOrThrow("username")));
        
        if (includePassword) {
            String encrypted = cursor.getString(cursor.getColumnIndexOrThrow("password"));
            String decrypted = decryptPassword(encrypted);
            obj.put("password", decrypted != null ? decrypted : "");
        }
        
        obj.put("authMethod", cursor.getString(cursor.getColumnIndexOrThrow("auth_method")));
        obj.put("loginUrl", cursor.getString(cursor.getColumnIndexOrThrow("login_url")));
        obj.put("isActive", cursor.getInt(cursor.getColumnIndexOrThrow("is_active")) == 1);
        
        int lastConnectedIndex = cursor.getColumnIndexOrThrow("last_connected");
        if (!cursor.isNull(lastConnectedIndex)) {
            obj.put("lastConnected", cursor.getLong(lastConnectedIndex));
        } else {
            obj.put("lastConnected", (Object) null);
        }
        
        return obj;
    }
}
