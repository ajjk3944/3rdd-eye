package com.bytedance.sdk.openadsdk.ylm;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ru {
    public static WeakReference<emc> emc;
    protected static final float[] ypw = new float[3];
    protected static final float[] xq = new float[3];
    protected static final float[] dg = new float[9];
    protected static final float[] bw = new float[3];

    public static void dg(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<emc> weakReference = emc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            uym.emc("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void emc(Context context, SensorEventListener sensorEventListener) {
    }

    public static void xq(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<emc> weakReference = emc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            uym.emc("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void ypw(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<emc> weakReference = emc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            uym.emc("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void emc(emc emcVar) {
        emc = new WeakReference<>(emcVar);
    }

    public static void emc(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<emc> weakReference = emc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            uym.emc("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void emc(Context context, long j6) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j6);
    }
}
