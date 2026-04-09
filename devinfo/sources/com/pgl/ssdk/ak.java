package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ak implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f21442a = {999999.0f, 999999.0f, 999999.0f};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21443b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile ak f21444c;

    /* renamed from: i, reason: collision with root package name */
    private final Context f21449i;

    /* renamed from: d, reason: collision with root package name */
    private Sensor f21445d = null;

    /* renamed from: e, reason: collision with root package name */
    private Sensor f21446e = null;

    /* renamed from: f, reason: collision with root package name */
    private Sensor f21447f = null;
    private volatile boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f21448h = false;
    private AtomicReference<a> j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private long f21450k = 999999;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f21451a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f21452b = null;

        /* renamed from: c, reason: collision with root package name */
        public float[] f21453c = null;

        /* renamed from: d, reason: collision with root package name */
        public float[] f21454d = null;

        public a(long j) {
            this.f21451a = j;
        }
    }

    private ak(Context context) {
        this.f21449i = context;
    }

    public static ak a(Context context) {
        if (f21444c == null) {
            synchronized (ak.class) {
                try {
                    if (f21444c == null) {
                        f21444c = new ak(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f21443b) {
            f21444c.c();
        }
        return f21444c;
    }

    private void c() {
        if (this.f21448h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f21449i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f21445d = sensorManager.getDefaultSensor(1);
                this.f21446e = sensorManager.getDefaultSensor(2);
                this.f21447f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f21448h = true;
    }

    private void e() {
        this.f21450k = -1L;
        this.g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f21449i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.j.get();
        if (!f21443b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i4 = 0;
        do {
            if ((this.f21445d == null || aVar.f21452b != null) && ((this.f21446e == null || aVar.f21453c != null) && (this.f21447f == null || aVar.f21454d != null))) {
                break;
            }
            az.a(50L);
            i4++;
        } while (i4 <= 20);
        e();
        this.g = false;
        a(objArr, aVar);
        this.j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f21445d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f21449i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f21445d, 2);
                    Sensor sensor = this.f21446e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f21447f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f21450k = jCurrentTimeMillis;
                        this.j.set(new a(jCurrentTimeMillis));
                        this.g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.g;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f21452b == null) {
                aVar.f21452b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f21453c == null) {
                aVar.f21453c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f21454d == null) {
            aVar.f21454d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f21442a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        Float fValueOf = Float.valueOf(999999.0f);
        float[] fArr = aVar.f21452b;
        if (fArr != null) {
            float[] fArr2 = aVar.f21453c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f21452b;
        } else {
            objArr[0] = fValueOf;
            objArr[1] = fValueOf;
            objArr[2] = fValueOf;
            objArr[4] = f21442a;
        }
        objArr[3] = Long.valueOf(aVar.f21451a);
        float[] fArr3 = aVar.f21454d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f21442a;
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
        float fSqrt = 1.0f / ((float) Math.sqrt((f12 * f12) + ((f11 * f11) + (f10 * f10))));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    public void a() {
        if (!f21443b || this.g) {
            return;
        }
        d();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i4) {
    }
}
