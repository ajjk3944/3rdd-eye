package app.thirdeye.scanner;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

import java.io.IOException;
import java.util.List;

@CapacitorPlugin(
    name = "CameraDetector",
    permissions = {
        @Permission(strings = {Manifest.permission.CAMERA}, alias = "camera"),
        @Permission(strings = {Manifest.permission.VIBRATE}, alias = "vibrate")
    }
)
public class CameraDetectorPlugin extends Plugin implements SensorEventListener {
    
    private static final String TAG = "CameraDetectorPlugin";
    private SensorManager sensorManager;
    private Sensor magnetometer;
    private boolean isListening = false;
    private float currentMagneticField = 0f;
    private ObjectDetector objectDetector;
    
    @Override
    public void load() {
        super.load();
        sensorManager = (SensorManager) getContext().getSystemService(Context.SENSOR_SERVICE);
        magnetometer = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        
        // Initialize object detector
        try {
            objectDetector = new ObjectDetector(getContext().getAssets());
            Log.d(TAG, "Object detector initialized successfully");
        } catch (IOException e) {
            Log.e(TAG, "Failed to initialize object detector", e);
        }
    }
    
    @PluginMethod
    public void checkPermissions(PluginCall call) {
        JSObject result = new JSObject();
        result.put("camera", checkPermission(Manifest.permission.CAMERA));
        result.put("vibrate", checkPermission(Manifest.permission.VIBRATE));
        call.resolve(result);
    }
    
    @PluginMethod
    public void requestPermissions(PluginCall call) {
        if (!checkPermission(Manifest.permission.CAMERA)) {
            requestPermissionForAlias("camera", call, "cameraPermissionCallback");
        } else {
            JSObject result = new JSObject();
            result.put("granted", true);
            call.resolve(result);
        }
    }
    
    @PluginMethod
    public void hasMagnetometer(PluginCall call) {
        JSObject result = new JSObject();
        result.put("hasSensor", magnetometer != null);
        call.resolve(result);
    }
    
    @PluginMethod(returnType = PluginMethod.RETURN_CALLBACK)
    public void startMagnetometer(PluginCall call) {
        if (magnetometer == null) {
            call.reject("Magnetometer not available");
            return;
        }
        
        if (!isListening) {
            // Use SENSOR_DELAY_UI for faster updates (60ms vs 200ms)
            boolean success = sensorManager.registerListener(
                this, 
                magnetometer, 
                SensorManager.SENSOR_DELAY_UI
            );
            
            if (success) {
                isListening = true;
                call.setKeepAlive(true);
                bridge.saveCall(call);
                
                JSObject result = new JSObject();
                result.put("started", true);
                call.resolve(result);
            } else {
                call.reject("Failed to start magnetometer");
            }
        } else {
            JSObject result = new JSObject();
            result.put("started", true);
            call.resolve(result);
        }
    }
    
    @PluginMethod
    public void stopMagnetometer(PluginCall call) {
        if (isListening) {
            sensorManager.unregisterListener(this);
            isListening = false;
        }
        
        JSObject result = new JSObject();
        result.put("stopped", true);
        call.resolve(result);
    }
    
    @PluginMethod
    public void getCurrentReading(PluginCall call) {
        JSObject result = new JSObject();
        result.put("magneticField", currentMagneticField);
        call.resolve(result);
    }
    
    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];
            
            // Calculate magnitude
            currentMagneticField = (float) Math.sqrt(x * x + y * y + z * z);
            
            // Notify listeners
            JSObject data = new JSObject();
            data.put("x", x);
            data.put("y", y);
            data.put("z", z);
            data.put("magnitude", currentMagneticField);
            
            notifyListeners("magnetometerUpdate", data);
        }
    }
    
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Not needed for this implementation
    }
    
    @Override
    protected void handleOnDestroy() {
        if (isListening) {
            sensorManager.unregisterListener(this);
            isListening = false;
        }
        if (objectDetector != null) {
            objectDetector.close();
        }
        super.handleOnDestroy();
    }
    
    @PluginMethod
    public void detectObjects(PluginCall call) {
        if (objectDetector == null) {
            call.reject("Object detector not initialized");
            return;
        }
        
        String base64Image = call.getString("image");
        if (base64Image == null || base64Image.isEmpty()) {
            call.reject("No image provided");
            return;
        }
        
        try {
            // Remove data URL prefix if present
            if (base64Image.contains(",")) {
                base64Image = base64Image.split(",")[1];
            }
            
            // Decode base64 to bitmap
            byte[] decodedBytes = Base64.decode(base64Image, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
            
            if (bitmap == null) {
                call.reject("Failed to decode image");
                return;
            }
            
            // Detect objects
            List<ObjectDetector.Detection> detections = objectDetector.detectObjects(bitmap);
            
            // Convert to JSON
            JSArray detectionsArray = new JSArray();
            for (ObjectDetector.Detection detection : detections) {
                JSObject detectionObj = new JSObject();
                detectionObj.put("id", detection.id);
                detectionObj.put("title", detection.title);
                detectionObj.put("confidence", detection.confidence);
                
                JSObject location = new JSObject();
                location.put("left", detection.location.left);
                location.put("top", detection.location.top);
                location.put("right", detection.location.right);
                location.put("bottom", detection.location.bottom);
                detectionObj.put("location", location);
                
                detectionsArray.put(detectionObj);
            }
            
            JSObject result = new JSObject();
            result.put("detections", detectionsArray);
            call.resolve(result);
            
            bitmap.recycle();
        } catch (Exception e) {
            Log.e(TAG, "Error detecting objects", e);
            call.reject("Error detecting objects: " + e.getMessage());
        }
    }
    
    private boolean checkPermission(String permission) {
        return ContextCompat.checkSelfPermission(getContext(), permission) 
            == PackageManager.PERMISSION_GRANTED;
    }
}
