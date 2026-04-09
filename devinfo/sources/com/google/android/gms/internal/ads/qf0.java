package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qf0 extends mw0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15335a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f15336b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f15337c;

    /* renamed from: d, reason: collision with root package name */
    public long f15338d;

    /* renamed from: e, reason: collision with root package name */
    public int f15339e;

    /* renamed from: f, reason: collision with root package name */
    public ff0 f15340f;
    public boolean g;

    public qf0(Context context) {
        this.f15335a = context;
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void a(SensorEvent sensorEvent) {
        pk pkVar = sk.f16214la;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) >= ((Float) rkVar2.a(sk.f16228ma)).floatValue()) {
                ua.j.C.f35267k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f15338d + ((Integer) rkVar2.a(sk.f16244na)).intValue() <= jCurrentTimeMillis) {
                    if (this.f15338d + ((Integer) rkVar2.a(sk.f16260oa)).intValue() < jCurrentTimeMillis) {
                        this.f15339e = 0;
                    }
                    ya.a0.m("Shake detected.");
                    this.f15338d = jCurrentTimeMillis;
                    int i4 = this.f15339e + 1;
                    this.f15339e = i4;
                    ff0 ff0Var = this.f15340f;
                    if (ff0Var == null || i4 != ((Integer) rkVar2.a(sk.f16276pa)).intValue()) {
                        return;
                    }
                    ff0Var.f(new df0(0), ef0.f10774c);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16214la)).booleanValue()) {
                    if (this.f15336b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f15335a.getSystemService("sensor");
                        this.f15336b = sensorManager2;
                        if (sensorManager2 == null) {
                            za.i.h("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f15337c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.g && (sensorManager = this.f15336b) != null && (sensor = this.f15337c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        ua.j.C.f35267k.getClass();
                        this.f15338d = System.currentTimeMillis() - ((Integer) r1.f36166c.a(sk.f16244na)).intValue();
                        this.g = true;
                        ya.a0.m("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this) {
            try {
                if (this.g) {
                    SensorManager sensorManager = this.f15336b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f15337c);
                        ya.a0.m("Stopped listening for shake gestures.");
                    }
                    this.g = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
