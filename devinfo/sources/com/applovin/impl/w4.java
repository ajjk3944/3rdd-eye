package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class w4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f5937a;

    /* renamed from: b, reason: collision with root package name */
    private final float f5938b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f5939c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f5940d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f5941e;

    /* renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5942f;
    private float[] g;

    /* renamed from: h, reason: collision with root package name */
    private float f5943h;

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f5942f = kVar;
        f0 f0Var = new f0();
        this.f5939c = f0Var;
        this.f5940d = f0Var.a(9);
        this.f5941e = f0Var.a(4);
        this.f5937a = ((Integer) kVar.a(x4.f6049h4)).intValue();
        this.f5938b = ((Float) kVar.a(x4.f6041g4)).floatValue();
    }

    public float a() {
        if (this.g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f5943h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f5942f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f5939c.b(this);
        if (((Boolean) this.f5942f.o0().a(x4.f6024e4)).booleanValue()) {
            this.f5939c.b(this, this.f5940d, (int) TimeUnit.MILLISECONDS.toMicros(this.f5937a), this.f5942f.O());
        }
        if (((Boolean) this.f5942f.o0().a(x4.f6033f4)).booleanValue()) {
            this.f5939c.b(this, this.f5941e, (int) TimeUnit.MILLISECONDS.toMicros(this.f5937a), this.f5942f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f5939c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f5943h * this.f5938b;
            this.f5943h = f10;
            this.f5943h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f10;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i4) {
    }
}
