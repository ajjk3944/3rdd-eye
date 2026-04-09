package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fx2 extends oe3 {
    public final Context a;
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public zw2 f;
    public boolean g;

    public fx2(Context context) {
        this.a = context;
    }

    @Override // defpackage.oe3
    public final void a(SensorEvent sensorEvent) {
        iz1 iz1Var = mz1.M9;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) >= ((Float) kz1Var2.a(mz1.N9)).floatValue()) {
                hg4.C.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.d + ((Integer) kz1Var2.a(mz1.O9)).intValue() <= jCurrentTimeMillis) {
                    if (this.d + ((Integer) kz1Var2.a(mz1.P9)).intValue() < jCurrentTimeMillis) {
                        this.e = 0;
                    }
                    gi2.G("Shake detected.");
                    this.d = jCurrentTimeMillis;
                    int i = this.e + 1;
                    this.e = i;
                    zw2 zw2Var = this.f;
                    if (zw2Var == null || i != ((Integer) kz1Var2.a(mz1.Q9)).intValue()) {
                        return;
                    }
                    zw2Var.e(new xw2(0), yw2.h);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) tw1.e.c.a(mz1.M9)).booleanValue()) {
                    if (this.b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                        this.b = sensorManager2;
                        if (sensorManager2 == null) {
                            gi2.i0("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        hg4.C.k.getClass();
                        this.d = System.currentTimeMillis() - ((Integer) r1.c.a(mz1.O9)).intValue();
                        this.g = true;
                        gi2.G("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
