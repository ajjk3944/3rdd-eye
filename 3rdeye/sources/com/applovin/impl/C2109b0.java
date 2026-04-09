package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.applovin.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2109b0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f19080a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    private Handler f19081b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19082c;

    public C2109b0(com.applovin.impl.sdk.k kVar) {
        boolean zBooleanValue = ((Boolean) kVar.a(l4.f19866Y)).booleanValue();
        this.f19082c = zBooleanValue;
        if (zBooleanValue) {
            HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
            handlerThread.start();
            this.f19081b = new Handler(handlerThread.getLooper());
        }
    }

    public Sensor a(int i) {
        return this.f19080a.getDefaultSensor(i);
    }

    public void b(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        if (this.f19082c) {
            this.f19081b.post(new B(this, sensorEventListener, sensor, i));
        } else {
            this.f19080a.registerListener(sensorEventListener, sensor, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        this.f19080a.registerListener(sensorEventListener, sensor, i, this.f19081b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f19080a.unregisterListener(sensorEventListener);
    }

    public void b(SensorEventListener sensorEventListener) {
        if (this.f19082c) {
            this.f19081b.post(new H0(2, this, sensorEventListener));
        } else {
            this.f19080a.unregisterListener(sensorEventListener);
        }
    }
}
