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

/* loaded from: classes.dex */
public class w4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f8356a;

    /* renamed from: b, reason: collision with root package name */
    private final float f8357b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f8358c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f8359d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f8360e;

    /* renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8361f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f8362g;

    /* renamed from: h, reason: collision with root package name */
    private float f8363h;

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f8361f = kVar;
        f0 f0Var = new f0();
        this.f8358c = f0Var;
        this.f8359d = f0Var.a(9);
        this.f8360e = f0Var.a(4);
        this.f8356a = ((Integer) kVar.a(x4.f8482h4)).intValue();
        this.f8357b = ((Float) kVar.a(x4.f8473g4)).floatValue();
    }

    public float a() {
        if (this.f8362g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f8363h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f8361f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f8358c.b(this);
        if (((Boolean) this.f8361f.o0().a(x4.f8455e4)).booleanValue()) {
            this.f8358c.b(this, this.f8359d, (int) TimeUnit.MILLISECONDS.toMicros(this.f8356a), this.f8361f.O());
        }
        if (((Boolean) this.f8361f.o0().a(x4.f8464f4)).booleanValue()) {
            this.f8358c.b(this, this.f8360e, (int) TimeUnit.MILLISECONDS.toMicros(this.f8356a), this.f8361f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8358c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f8362g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f8363h * this.f8357b;
            this.f8363h = f10;
            this.f8363h = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
