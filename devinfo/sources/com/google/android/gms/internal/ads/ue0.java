package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ue0 extends mw0 {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f17184a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f17185b;

    /* renamed from: c, reason: collision with root package name */
    public float f17186c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f17187d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f17188e;

    /* renamed from: f, reason: collision with root package name */
    public int f17189f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17190h;

    /* renamed from: i, reason: collision with root package name */
    public ff0 f17191i;
    public boolean j;

    public ue0(Context context) {
        ua.j.C.f35267k.getClass();
        this.f17188e = System.currentTimeMillis();
        this.f17189f = 0;
        this.g = false;
        this.f17190h = false;
        this.f17191i = null;
        this.j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f17184a = sensorManager;
        if (sensorManager != null) {
            this.f17185b = sensorManager.getDefaultSensor(4);
        } else {
            this.f17185b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void a(SensorEvent sensorEvent) {
        pk pkVar = sk.f16292qa;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            ua.j.C.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f17188e + ((Integer) rkVar2.a(sk.f16324sa)).intValue() < jCurrentTimeMillis) {
                this.f17189f = 0;
                this.f17188e = jCurrentTimeMillis;
                this.g = false;
                this.f17190h = false;
                this.f17186c = this.f17187d.floatValue();
            }
            float fFloatValue = this.f17187d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f17187d = Float.valueOf(fFloatValue);
            float f10 = this.f17186c;
            pk pkVar2 = sk.ra;
            if (fFloatValue > ((Float) rkVar2.a(pkVar2)).floatValue() + f10) {
                this.f17186c = this.f17187d.floatValue();
                this.f17190h = true;
            } else if (this.f17187d.floatValue() < this.f17186c - ((Float) rkVar2.a(pkVar2)).floatValue()) {
                this.f17186c = this.f17187d.floatValue();
                this.g = true;
            }
            if (this.f17187d.isInfinite()) {
                this.f17187d = Float.valueOf(0.0f);
                this.f17186c = 0.0f;
            }
            if (this.g && this.f17190h) {
                ya.a0.m("Flick detected.");
                this.f17188e = jCurrentTimeMillis;
                int i4 = this.f17189f + 1;
                this.f17189f = i4;
                this.g = false;
                this.f17190h = false;
                ff0 ff0Var = this.f17191i;
                if (ff0Var == null || i4 != ((Integer) rkVar2.a(sk.f16341ta)).intValue()) {
                    return;
                }
                ff0Var.f(new df0(1), ef0.f10774c);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16292qa)).booleanValue()) {
                    if (!this.j && (sensorManager = this.f17184a) != null && (sensor = this.f17185b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.j = true;
                        ya.a0.m("Listening for flick gestures.");
                    }
                    if (this.f17184a == null || this.f17185b == null) {
                        za.i.h("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.j && (sensorManager = this.f17184a) != null && (sensor = this.f17185b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.j = false;
                    ya.a0.m("Stopped listening for flick gestures.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
