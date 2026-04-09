package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f5974a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    private Handler f5975b;

    public f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f5975b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i10) {
        return this.f5974a.getDefaultSensor(i10);
    }

    public void b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i10, final com.applovin.impl.sdk.o oVar) {
        this.f5975b.post(new Runnable() { // from class: com.applovin.impl.fa
            @Override // java.lang.Runnable
            public final void run() {
                this.f6022a.a(sensorEventListener, sensor, i10, oVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.o oVar) {
        try {
            this.f5974a.registerListener(sensorEventListener, sensor, i10, this.f5975b);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                oVar.a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    public void b(final SensorEventListener sensorEventListener) {
        this.f5975b.post(new Runnable() { // from class: com.applovin.impl.ea
            @Override // java.lang.Runnable
            public final void run() {
                this.f5959a.a(sensorEventListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f5974a.unregisterListener(sensorEventListener);
    }
}
