package app.thirdeye.scanner;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Build;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONArray;
import org.json.JSONException;

@CapacitorPlugin(name = "IRBlaster")
public class IRBlasterPlugin extends Plugin {
    private static final String TAG = "IRBlasterPlugin";
    private ConsumerIrManager irManager;

    @Override
    public void load() {
        super.load();
        irManager = (ConsumerIrManager) getContext().getSystemService(Context.CONSUMER_IR_SERVICE);
    }

    @PluginMethod
    public void hasIrEmitter(PluginCall call) {
        JSObject result = new JSObject();
        if (irManager != null) {
            result.put("hasIrEmitter", irManager.hasIrEmitter());
        } else {
            result.put("hasIrEmitter", false);
        }
        call.resolve(result);
    }

    @PluginMethod
    public void getCarrierFrequencies(PluginCall call) {
        JSObject result = new JSObject();
        if (irManager != null && irManager.hasIrEmitter()) {
            ConsumerIrManager.CarrierFrequencyRange[] ranges = irManager.getCarrierFrequencies();
            JSONArray rangesArray = new JSONArray();
            for (ConsumerIrManager.CarrierFrequencyRange range : ranges) {
                JSObject rangeObj = new JSObject();
                rangeObj.put("minFrequency", range.getMinFrequency());
                rangeObj.put("maxFrequency", range.getMaxFrequency());
                rangesArray.put(rangeObj);
            }
            result.put("frequencies", rangesArray);
            result.put("success", true);
        } else {
            result.put("success", false);
            result.put("error", "IR emitter not available");
        }
        call.resolve(result);
    }

    @PluginMethod
    public void transmit(PluginCall call) {
        Log.d(TAG, "=== IR TRANSMIT CALLED ===");
        
        try {
            if (irManager == null) {
                Log.e(TAG, "ERROR: irManager is NULL");
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "IR Manager not initialized");
                call.resolve(result);
                return;
            }
            
            boolean hasEmitter = irManager.hasIrEmitter();
            Log.d(TAG, "Has IR Emitter: " + hasEmitter);
            
            if (!hasEmitter) {
                Log.e(TAG, "ERROR: No IR emitter detected");
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "IR emitter not available");
                call.resolve(result);
                return;
            }

            int frequency = call.getInt("frequency", 38000);
            Log.d(TAG, "Frequency: " + frequency + " Hz");
            
            // Check if frequency is supported
            try {
                ConsumerIrManager.CarrierFrequencyRange[] ranges = irManager.getCarrierFrequencies();
                boolean frequencySupported = false;
                for (ConsumerIrManager.CarrierFrequencyRange range : ranges) {
                    if (frequency >= range.getMinFrequency() && frequency <= range.getMaxFrequency()) {
                        frequencySupported = true;
                        break;
                    }
                }
                
                if (!frequencySupported) {
                    Log.w(TAG, "WARNING: Frequency " + frequency + " may not be supported by hardware");
                    Log.d(TAG, "Supported ranges:");
                    for (ConsumerIrManager.CarrierFrequencyRange range : ranges) {
                        Log.d(TAG, "  " + range.getMinFrequency() + " - " + range.getMaxFrequency() + " Hz");
                    }
                }
            } catch (Exception e) {
                Log.w(TAG, "Could not check frequency ranges: " + e.getMessage());
            }
            
            JSONArray patternArray = call.getArray("pattern");

            if (patternArray == null) {
                Log.e(TAG, "ERROR: Pattern is null");
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Pattern is required");
                call.resolve(result);
                return;
            }

            int patternLength = patternArray.length();
            
            // Safety check for pattern size
            if (patternLength == 0) {
                Log.e(TAG, "ERROR: Pattern is empty");
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Pattern cannot be empty");
                call.resolve(result);
                return;
            }
            
            if (patternLength > 10000) {
                Log.e(TAG, "ERROR: Pattern too large: " + patternLength);
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Pattern too large (max 10000 values)");
                call.resolve(result);
                return;
            }

            int[] pattern = new int[patternLength];
            long totalDuration = 0;
            int maxValue = 0;
            int minValue = Integer.MAX_VALUE;
            
            for (int i = 0; i < patternLength; i++) {
                try {
                    pattern[i] = patternArray.getInt(i);
                    
                    // Validate value
                    if (pattern[i] < 0) {
                        Log.e(TAG, "ERROR: Negative value at index " + i + ": " + pattern[i]);
                        JSObject result = new JSObject();
                        result.put("success", false);
                        result.put("error", "Pattern contains negative values");
                        call.resolve(result);
                        return;
                    }
                    
                    totalDuration += pattern[i];
                    maxValue = Math.max(maxValue, pattern[i]);
                    minValue = Math.min(minValue, pattern[i]);
                } catch (JSONException e) {
                    Log.e(TAG, "ERROR: Invalid value at index " + i, e);
                    JSObject result = new JSObject();
                    result.put("success", false);
                    result.put("error", "Invalid pattern value at index " + i);
                    call.resolve(result);
                    return;
                }
            }
            
            Log.d(TAG, "Pattern length: " + pattern.length);
            Log.d(TAG, "Total duration: " + (totalDuration / 1000.0) + " ms");
            Log.d(TAG, "Min value: " + minValue + " μs");
            Log.d(TAG, "Max value: " + maxValue + " μs");
            Log.d(TAG, "First 10 values: ");
            for (int i = 0; i < Math.min(10, pattern.length); i++) {
                Log.d(TAG, "  [" + i + "] = " + pattern[i]);
            }
            Log.d(TAG, "Last 10 values: ");
            for (int i = Math.max(0, pattern.length - 10); i < pattern.length; i++) {
                Log.d(TAG, "  [" + i + "] = " + pattern[i]);
            }

            Log.d(TAG, "Calling irManager.transmit()...");
            long startTime = System.currentTimeMillis();
            
            try {
                irManager.transmit(frequency, pattern);
                long endTime = System.currentTimeMillis();
                Log.d(TAG, "✓ Transmission completed in " + (endTime - startTime) + " ms");

                JSObject result = new JSObject();
                result.put("success", true);
                result.put("frequency", frequency);
                result.put("patternLength", pattern.length);
                result.put("durationMs", totalDuration / 1000.0);
                call.resolve(result);
            } catch (Exception e) {
                Log.e(TAG, "ERROR during transmit(): " + e.getMessage(), e);
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Transmission failed: " + e.getMessage());
                call.resolve(result);
            }
            
        } catch (Exception e) {
            Log.e(TAG, "FATAL ERROR in transmit()", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Fatal error: " + e.getMessage());
            call.resolve(result);
        }
    }

    @PluginMethod
    public void transmitPronto(PluginCall call) {
        if (irManager == null || !irManager.hasIrEmitter()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "IR emitter not available");
            call.resolve(result);
            return;
        }

        String prontoCode = call.getString("code");
        if (prontoCode == null || prontoCode.isEmpty()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Pronto code is required");
            call.resolve(result);
            return;
        }

        try {
            int[] converted = convertProntoToRaw(prontoCode);
            int frequency = converted[0];
            int[] pattern = new int[converted.length - 1];
            System.arraycopy(converted, 1, pattern, 0, pattern.length);

            irManager.transmit(frequency, pattern);

            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error transmitting Pronto code", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", e.getMessage());
            call.resolve(result);
        }
    }

    private int[] convertProntoToRaw(String prontoCode) {
        String[] hexCodes = prontoCode.trim().split("\\s+");
        int[] pronto = new int[hexCodes.length];
        for (int i = 0; i < hexCodes.length; i++) {
            pronto[i] = Integer.parseInt(hexCodes[i], 16);
        }

        // Pronto format: type, freq_code, seq1_len, seq2_len, data...
        int freqCode = pronto[1];
        double frequency = 1000000.0 / (freqCode * 0.241246);
        int freq = (int) Math.round(frequency);

        int seq1Length = pronto[2] * 2;
        int seq2Length = pronto[3] * 2;
        int totalLength = seq1Length + seq2Length;

        int[] result = new int[totalLength + 1];
        result[0] = freq;

        double pulseDuration = 1000000.0 / freq;
        for (int i = 0; i < totalLength; i++) {
            result[i + 1] = (int) Math.round(pronto[4 + i] * pulseDuration);
        }

        return result;
    }
}
