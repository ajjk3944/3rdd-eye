package com.bytedance.sdk.openadsdk.zin;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly {
    public static WeakReference<ouw> ouw;
    protected static final float[] vt = new float[3];

    /* renamed from: lh, reason: collision with root package name */
    protected static final float[] f8860lh = new float[3];
    protected static final float[] yu = new float[9];
    protected static final float[] fkw = new float[3];

    public static void lh(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenLinearAcceleration error", th2);
        }
    }

    public static void ouw() {
    }

    public static void vt(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenGyroscope error", th2);
        }
    }

    public static void yu(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenRotationVector err", th2);
        }
    }

    public static void ouw(ouw ouwVar) {
        ouw = new WeakReference<>(ouwVar);
    }

    public static void ouw(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ouw> weakReference = ouw;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            ra.ouw("SensorHub", "startListenAccelerometer error", th2);
        }
    }

    public static void ouw(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
