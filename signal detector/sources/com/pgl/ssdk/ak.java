package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ak implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f19568a = {999999.0f, 999999.0f, 999999.0f};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f19569b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile ak f19570c;
    private final Context i;

    /* renamed from: d, reason: collision with root package name */
    private Sensor f19571d = null;

    /* renamed from: e, reason: collision with root package name */
    private Sensor f19572e = null;

    /* renamed from: f, reason: collision with root package name */
    private Sensor f19573f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f19574g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f19575h = false;

    /* renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f19576j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private long f19577k = 999999;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f19578a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f19579b = null;

        /* renamed from: c, reason: collision with root package name */
        public float[] f19580c = null;

        /* renamed from: d, reason: collision with root package name */
        public float[] f19581d = null;

        public a(long j6) {
            this.f19578a = j6;
        }
    }

    private ak(Context context) {
        this.i = context;
    }

    public static ak a(Context context) {
        if (f19570c == null) {
            synchronized (ak.class) {
                try {
                    if (f19570c == null) {
                        f19570c = new ak(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (f19569b) {
            f19570c.c();
        }
        return f19570c;
    }

    private void c() {
        if (this.f19575h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f19571d = sensorManager.getDefaultSensor(1);
                this.f19572e = sensorManager.getDefaultSensor(2);
                this.f19573f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f19575h = true;
    }

    private void e() {
        this.f19577k = -1L;
        this.f19574g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f19576j.get();
        if (!f19569b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i = 0;
        do {
            if ((this.f19571d == null || aVar.f19579b != null) && ((this.f19572e == null || aVar.f19580c != null) && (this.f19573f == null || aVar.f19581d != null))) {
                break;
            }
            az.a(50L);
            i++;
        } while (i <= 20);
        e();
        this.f19574g = false;
        a(objArr, aVar);
        this.f19576j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f19571d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f19571d, 2);
                    Sensor sensor = this.f19572e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f19573f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f19577k = jCurrentTimeMillis;
                        this.f19576j.set(new a(jCurrentTimeMillis));
                        this.f19574g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f19574g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f19576j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f19579b == null) {
                aVar.f19579b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f19580c == null) {
                aVar.f19580c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f19581d == null) {
            aVar.f19581d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f19568a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        Float fValueOf = Float.valueOf(999999.0f);
        float[] fArr = aVar.f19579b;
        if (fArr != null) {
            float[] fArr2 = aVar.f19580c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f19579b;
        } else {
            objArr[0] = fValueOf;
            objArr[1] = fValueOf;
            objArr[2] = fValueOf;
            objArr[4] = f19568a;
        }
        objArr[3] = Long.valueOf(aVar.f19578a);
        float[] fArr3 = aVar.f19581d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f19568a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, new float[3]);
        return new float[]{(((float) Math.toDegrees(r2[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f2 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + ((f5 * f5) + (f2 * f2))));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f5 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f2 * fSqrt), f6 * fSqrt))) + 360.0f) % 360.0f};
    }

    public void a() {
        if (!f19569b || this.f19574g) {
            return;
        }
        d();
    }
}
