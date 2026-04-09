package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f4092a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    private Handler f4093b;

    public f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f4093b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i4) {
        return this.f4092a.getDefaultSensor(i4);
    }

    public void b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i4, final com.applovin.impl.sdk.o oVar) {
        this.f4093b.post(new Runnable() { // from class: com.applovin.impl.h9
            @Override // java.lang.Runnable
            public final void run() {
                this.f4230a.a(sensorEventListener, sensor, i4, oVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i4, com.applovin.impl.sdk.o oVar) {
        try {
            this.f4092a.registerListener(sensorEventListener, sensor, i4, this.f4093b);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                oVar.a("BackgroundSensorManager", "Unable to register sensor listener", th2);
            }
        }
    }

    public void b(SensorEventListener sensorEventListener) {
        this.f4093b.post(new w8(4, this, sensorEventListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f4092a.unregisterListener(sensorEventListener);
    }
}
