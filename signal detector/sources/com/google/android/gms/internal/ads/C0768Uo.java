package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768Uo extends AbstractC1341ix {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11788a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f11789b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f11790c;

    /* renamed from: d, reason: collision with root package name */
    public long f11791d;

    /* renamed from: e, reason: collision with root package name */
    public int f11792e;

    /* renamed from: f, reason: collision with root package name */
    public C0581Jo f11793f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11794g;

    public C0768Uo(Context context) {
        this.f11788a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1341ix
    public final void a(SensorEvent sensorEvent) {
        E9 e9 = H9.ja;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0] / 9.80665f;
            float f5 = fArr[1] / 9.80665f;
            float f6 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f6 * f6) + (f5 * f5) + (f2 * f2))) >= ((Float) g92.a(H9.ka)).floatValue()) {
                p2.j.f22785C.f22797k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f11791d + ((Integer) g92.a(H9.la)).intValue() <= jCurrentTimeMillis) {
                    if (this.f11791d + ((Integer) g92.a(H9.ma)).intValue() < jCurrentTimeMillis) {
                        this.f11792e = 0;
                    }
                    AbstractC2907C.m("Shake detected.");
                    this.f11791d = jCurrentTimeMillis;
                    int i = this.f11792e + 1;
                    this.f11792e = i;
                    C0581Jo c0581Jo = this.f11793f;
                    if (c0581Jo == null || i != ((Integer) g92.a(H9.na)).intValue()) {
                        return;
                    }
                    c0581Jo.f(new BinderC0547Ho(0), EnumC0564Io.f9167c);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.ja)).booleanValue()) {
                    if (this.f11789b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f11788a.getSystemService("sensor");
                        this.f11789b = sensorManager2;
                        if (sensorManager2 == null) {
                            u2.k.h("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f11790c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f11794g && (sensorManager = this.f11789b) != null && (sensor = this.f11790c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        p2.j.f22785C.f22797k.getClass();
                        this.f11791d = System.currentTimeMillis() - ((Integer) r1.f23270c.a(H9.la)).intValue();
                        this.f11794g = true;
                        AbstractC2907C.m("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this) {
            try {
                if (this.f11794g) {
                    SensorManager sensorManager = this.f11789b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f11790c);
                        AbstractC2907C.m("Stopped listening for shake gestures.");
                    }
                    this.f11794g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
