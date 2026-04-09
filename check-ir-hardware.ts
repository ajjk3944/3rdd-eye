// Check if your Android device has IR blaster

// Method 1: Check in your app
import { Plugins } from '@capacitor/core';

async function checkIRHardware() {
  try {
    // This requires a Capacitor plugin that wraps ConsumerIrManager
    const hasIR = await checkConsumerIrManager();
    
    if (hasIR) {
      console.log('✅ Your phone HAS IR blaster - App will work!');
      return true;
    } else {
      console.log('❌ Your phone does NOT have IR blaster - App won\'t work');
      return false;
    }
  } catch (error) {
    console.log('❌ IR hardware not available');
    return false;
  }
}

// Method 2: Check via Android code (Java/Kotlin)
// Add this to your Capacitor plugin:

/*
// In Android (Java):
import android.hardware.ConsumerIrManager;
import android.content.Context;

public boolean hasIrEmitter() {
    ConsumerIrManager irManager = (ConsumerIrManager) 
        getContext().getSystemService(Context.CONSUMER_IR_SERVICE);
    
    if (irManager != null && irManager.hasIrEmitter()) {
        return true; // ✅ Has IR hardware
    }
    return false; // ❌ No IR hardware
}
*/

// Method 3: Check manually
// Go to: Settings → About Phone → look for "Infrared" or "IR Blaster"
// Or search online: "[Your phone model] IR blaster"

export { checkIRHardware };
