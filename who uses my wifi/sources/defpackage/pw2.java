package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pw2 extends oe3 {
    public final SensorManager a;
    public final Sensor b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);
    public long e;
    public int f;
    public boolean g;
    public boolean h;
    public zw2 i;
    public boolean j;

    public pw2(Context context) {
        hg4.C.k.getClass();
        this.e = System.currentTimeMillis();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    @Override // defpackage.oe3
    public final void a(SensorEvent sensorEvent) {
        iz1 iz1Var = mz1.R9;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            hg4.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.e + ((Integer) kz1Var2.a(mz1.T9)).intValue() < jCurrentTimeMillis) {
                this.f = 0;
                this.e = jCurrentTimeMillis;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            float fFloatValue = this.d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.d = Float.valueOf(fFloatValue);
            float f = this.c;
            iz1 iz1Var2 = mz1.S9;
            if (fFloatValue > ((Float) kz1Var2.a(iz1Var2)).floatValue() + f) {
                this.c = this.d.floatValue();
                this.h = true;
            } else if (this.d.floatValue() < this.c - ((Float) kz1Var2.a(iz1Var2)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.g && this.h) {
                gi2.G("Flick detected.");
                this.e = jCurrentTimeMillis;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                zw2 zw2Var = this.i;
                if (zw2Var == null || i != ((Integer) kz1Var2.a(mz1.U9)).intValue()) {
                    return;
                }
                zw2Var.e(new xw2(1), yw2.h);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) tw1.e.c.a(mz1.R9)).booleanValue()) {
                    if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.j = true;
                        gi2.G("Listening for flick gestures.");
                    }
                    if (this.a == null || this.b == null) {
                        gi2.i0("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
