package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class ak implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f19824a = {999999.0f, 999999.0f, 999999.0f};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f19825b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile ak f19826c;

    /* renamed from: i, reason: collision with root package name */
    private final Context f19832i;

    /* renamed from: d, reason: collision with root package name */
    private Sensor f19827d = null;

    /* renamed from: e, reason: collision with root package name */
    private Sensor f19828e = null;

    /* renamed from: f, reason: collision with root package name */
    private Sensor f19829f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f19830g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f19831h = false;

    /* renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f19833j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private long f19834k = 999999;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f19835a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f19836b = null;

        /* renamed from: c, reason: collision with root package name */
        public float[] f19837c = null;

        /* renamed from: d, reason: collision with root package name */
        public float[] f19838d = null;

        public a(long j10) {
            this.f19835a = j10;
        }
    }

    private ak(Context context) {
        this.f19832i = context;
    }

    public static ak a(Context context) {
        if (f19826c == null) {
            synchronized (ak.class) {
                try {
                    if (f19826c == null) {
                        f19826c = new ak(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (f19825b) {
            f19826c.c();
        }
        return f19826c;
    }

    private void c() {
        if (this.f19831h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f19832i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f19827d = sensorManager.getDefaultSensor(1);
                this.f19828e = sensorManager.getDefaultSensor(2);
                this.f19829f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f19831h = true;
    }

    private void e() {
        this.f19834k = -1L;
        this.f19830g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f19832i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f19833j.get();
        if (!f19825b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f19827d == null || aVar.f19836b != null) && ((this.f19828e == null || aVar.f19837c != null) && (this.f19829f == null || aVar.f19838d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f19830g = false;
        a(objArr, aVar);
        this.f19833j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f19827d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f19832i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f19827d, 2);
                    Sensor sensor = this.f19828e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f19829f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f19834k = jCurrentTimeMillis;
                        this.f19833j.set(new a(jCurrentTimeMillis));
                        this.f19830g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f19830g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f19833j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f19836b == null) {
                aVar.f19836b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f19837c == null) {
                aVar.f19837c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f19838d == null) {
            aVar.f19838d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f19824a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        Float fValueOf = Float.valueOf(999999.0f);
        float[] fArr = aVar.f19836b;
        if (fArr != null) {
            float[] fArr2 = aVar.f19837c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f19836b;
        } else {
            objArr[0] = fValueOf;
            objArr[1] = fValueOf;
            objArr[2] = fValueOf;
            objArr[4] = f19824a;
        }
        objArr[3] = Long.valueOf(aVar.f19835a);
        float[] fArr3 = aVar.f19838d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f19824a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, new float[3]);
        return new float[]{(((float) Math.toDegrees(r2[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    public void a() {
        if (!f19825b || this.f19830g) {
            return;
        }
        d();
    }
}
