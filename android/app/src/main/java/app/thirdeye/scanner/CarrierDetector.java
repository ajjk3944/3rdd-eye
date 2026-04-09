package app.thirdeye.scanner;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.telephony.SignalStrength;
import android.telephony.PhoneStateListener;
import android.util.Log;
import androidx.core.app.ActivityCompat;

/**
 * Carrier Detector - Detects mobile carrier/SIM company information
 */
public class CarrierDetector {
    private static final String TAG = "CarrierDetector";
    private final Context context;
    private final TelephonyManager telephonyManager;
    
    public static class CarrierInfo {
        public String carrierName;
        public String networkOperator;
        public String networkType;
        public String simState;
        public int signalStrength;
        public boolean hasSim;
        
        public CarrierInfo() {
            this.carrierName = "Unknown";
            this.networkOperator = "Unknown";
            this.networkType = "Unknown";
            this.simState = "Unknown";
            this.signalStrength = 0;
            this.hasSim = false;
        }
    }
    
    public CarrierDetector(Context context) {
        this.context = context.getApplicationContext();
        this.telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    }
    
    /**
     * Get complete carrier information
     */
    public CarrierInfo getCarrierInfo() {
        CarrierInfo info = new CarrierInfo();
        
        if (telephonyManager == null) {
            Log.e(TAG, "TelephonyManager not available");
            return info;
        }
        
        // Check permission
        if (!hasPhoneStatePermission()) {
            Log.w(TAG, "READ_PHONE_STATE permission not granted");
            return info;
        }
        
        try {
            // Get carrier name
            String carrierName = telephonyManager.getNetworkOperatorName();
            if (carrierName != null && !carrierName.isEmpty()) {
                info.carrierName = carrierName;
            }
            
            // Get network operator (MCC+MNC)
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator != null && !networkOperator.isEmpty()) {
                info.networkOperator = networkOperator;
            }
            
            // Get SIM state
            int simState = telephonyManager.getSimState();
            info.simState = getSimStateString(simState);
            info.hasSim = (simState == TelephonyManager.SIM_STATE_READY);
            
            // Get network type
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                int dataNetworkType = telephonyManager.getDataNetworkType();
                info.networkType = getNetworkTypeString(dataNetworkType);
            } else {
                int networkType = telephonyManager.getNetworkType();
                info.networkType = getNetworkTypeString(networkType);
            }
            
            Log.d(TAG, "Carrier: " + info.carrierName + ", Network: " + info.networkType);
            
        } catch (SecurityException e) {
            Log.e(TAG, "Permission denied for carrier detection", e);
        } catch (Exception e) {
            Log.e(TAG, "Error getting carrier info", e);
        }
        
        return info;
    }
    
    /**
     * Get carrier name only
     */
    public String getCarrierName() {
        if (telephonyManager == null || !hasPhoneStatePermission()) {
            return "Unknown";
        }
        
        try {
            String carrierName = telephonyManager.getNetworkOperatorName();
            return (carrierName != null && !carrierName.isEmpty()) ? carrierName : "Unknown";
        } catch (Exception e) {
            Log.e(TAG, "Error getting carrier name", e);
            return "Unknown";
        }
    }
    
    /**
     * Get network type (2G/3G/4G/5G)
     */
    public String getNetworkType() {
        if (telephonyManager == null || !hasPhoneStatePermission()) {
            return "Unknown";
        }
        
        try {
            int networkType;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                networkType = telephonyManager.getDataNetworkType();
            } else {
                networkType = telephonyManager.getNetworkType();
            }
            return getNetworkTypeString(networkType);
        } catch (Exception e) {
            Log.e(TAG, "Error getting network type", e);
            return "Unknown";
        }
    }
    
    /**
     * Check if SIM card is present
     */
    public boolean hasSim() {
        if (telephonyManager == null) {
            return false;
        }
        
        try {
            int simState = telephonyManager.getSimState();
            return simState == TelephonyManager.SIM_STATE_READY;
        } catch (Exception e) {
            Log.e(TAG, "Error checking SIM state", e);
            return false;
        }
    }
    
    /**
     * Convert network type code to readable string
     */
    private String getNetworkTypeString(int networkType) {
        switch (networkType) {
            case TelephonyManager.NETWORK_TYPE_GPRS:
            case TelephonyManager.NETWORK_TYPE_EDGE:
            case TelephonyManager.NETWORK_TYPE_CDMA:
            case TelephonyManager.NETWORK_TYPE_1xRTT:
            case TelephonyManager.NETWORK_TYPE_IDEN:
                return "2G";
                
            case TelephonyManager.NETWORK_TYPE_UMTS:
            case TelephonyManager.NETWORK_TYPE_EVDO_0:
            case TelephonyManager.NETWORK_TYPE_EVDO_A:
            case TelephonyManager.NETWORK_TYPE_HSDPA:
            case TelephonyManager.NETWORK_TYPE_HSUPA:
            case TelephonyManager.NETWORK_TYPE_HSPA:
            case TelephonyManager.NETWORK_TYPE_EVDO_B:
            case TelephonyManager.NETWORK_TYPE_EHRPD:
            case TelephonyManager.NETWORK_TYPE_HSPAP:
                return "3G";
                
            case TelephonyManager.NETWORK_TYPE_LTE:
            case TelephonyManager.NETWORK_TYPE_IWLAN:
                return "4G";
                
            case TelephonyManager.NETWORK_TYPE_NR: // 5G (API 29+)
                return "5G";
                
            default:
                return "Unknown";
        }
    }
    
    /**
     * Convert SIM state code to readable string
     */
    private String getSimStateString(int simState) {
        switch (simState) {
            case TelephonyManager.SIM_STATE_ABSENT:
                return "No SIM";
            case TelephonyManager.SIM_STATE_NETWORK_LOCKED:
                return "Network Locked";
            case TelephonyManager.SIM_STATE_PIN_REQUIRED:
                return "PIN Required";
            case TelephonyManager.SIM_STATE_PUK_REQUIRED:
                return "PUK Required";
            case TelephonyManager.SIM_STATE_READY:
                return "Ready";
            case TelephonyManager.SIM_STATE_UNKNOWN:
            default:
                return "Unknown";
        }
    }
    
    /**
     * Check if READ_PHONE_STATE permission is granted
     */
    private boolean hasPhoneStatePermission() {
        return ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) 
            == PackageManager.PERMISSION_GRANTED;
    }
}
