package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2249zo extends AbstractC1341ix {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f17961a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f17962b;

    /* renamed from: c, reason: collision with root package name */
    public float f17963c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f17964d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f17965e;

    /* renamed from: f, reason: collision with root package name */
    public int f17966f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17967g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17968h;
    public C0581Jo i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17969j;

    public C2249zo(Context context) {
        p2.j.f22785C.f22797k.getClass();
        this.f17965e = System.currentTimeMillis();
        this.f17966f = 0;
        this.f17967g = false;
        this.f17968h = false;
        this.i = null;
        this.f17969j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f17961a = sensorManager;
        if (sensorManager != null) {
            this.f17962b = sensorManager.getDefaultSensor(4);
        } else {
            this.f17962b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1341ix
    public final void a(SensorEvent sensorEvent) {
        E9 e9 = H9.oa;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            p2.j.f22785C.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f17965e + ((Integer) g92.a(H9.qa)).intValue() < jCurrentTimeMillis) {
                this.f17966f = 0;
                this.f17965e = jCurrentTimeMillis;
                this.f17967g = false;
                this.f17968h = false;
                this.f17963c = this.f17964d.floatValue();
            }
            float fFloatValue = this.f17964d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f17964d = Float.valueOf(fFloatValue);
            float f2 = this.f17963c;
            E9 e92 = H9.pa;
            if (fFloatValue > ((Float) g92.a(e92)).floatValue() + f2) {
                this.f17963c = this.f17964d.floatValue();
                this.f17968h = true;
            } else if (this.f17964d.floatValue() < this.f17963c - ((Float) g92.a(e92)).floatValue()) {
                this.f17963c = this.f17964d.floatValue();
                this.f17967g = true;
            }
            if (this.f17964d.isInfinite()) {
                this.f17964d = Float.valueOf(0.0f);
                this.f17963c = 0.0f;
            }
            if (this.f17967g && this.f17968h) {
                AbstractC2907C.m("Flick detected.");
                this.f17965e = jCurrentTimeMillis;
                int i = this.f17966f + 1;
                this.f17966f = i;
                this.f17967g = false;
                this.f17968h = false;
                C0581Jo c0581Jo = this.i;
                if (c0581Jo == null || i != ((Integer) g92.a(H9.ra)).intValue()) {
                    return;
                }
                c0581Jo.f(new BinderC0547Ho(1), EnumC0564Io.f9167c);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.oa)).booleanValue()) {
                    if (!this.f17969j && (sensorManager = this.f17961a) != null && (sensor = this.f17962b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f17969j = true;
                        AbstractC2907C.m("Listening for flick gestures.");
                    }
                    if (this.f17961a == null || this.f17962b == null) {
                        u2.k.h("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f17969j && (sensorManager = this.f17961a) != null && (sensor = this.f17962b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f17969j = false;
                    AbstractC2907C.m("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
