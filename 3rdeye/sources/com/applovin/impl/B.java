package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18779b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18783f;

    public /* synthetic */ B(C2109b0 c2109b0, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        this.f18781d = c2109b0;
        this.f18782e = sensorEventListener;
        this.f18783f = sensor;
        this.f18780c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18779b) {
            case 0:
                ((C2109b0) this.f18781d).a((SensorEventListener) this.f18782e, (Sensor) this.f18783f, this.f18780c);
                break;
            default:
                ((d0.s) this.f18781d).d(this.f18780c, (String) this.f18782e, (Throwable) this.f18783f);
                break;
        }
    }

    public /* synthetic */ B(d0.s sVar, int i, String str, Throwable th) {
        this.f18781d = sVar;
        this.f18780c = i;
        this.f18782e = str;
        this.f18783f = th;
    }
}
