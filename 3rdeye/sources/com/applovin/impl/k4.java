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
public class k4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f19650a;

    /* renamed from: b, reason: collision with root package name */
    private final float f19651b;

    /* renamed from: c, reason: collision with root package name */
    private final C2109b0 f19652c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f19653d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f19654e;

    /* renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19655f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f19656g;

    /* renamed from: h, reason: collision with root package name */
    private float f19657h;

    public k4(com.applovin.impl.sdk.k kVar) {
        this.f19655f = kVar;
        C2109b0 c2109b0 = new C2109b0(kVar);
        this.f19652c = c2109b0;
        this.f19653d = c2109b0.a(9);
        this.f19654e = c2109b0.a(4);
        this.f19650a = ((Integer) kVar.a(l4.X3)).intValue();
        this.f19651b = ((Float) kVar.a(l4.f19857W3)).floatValue();
    }

    private void a(Sensor sensor) {
        try {
            this.f19652c.b(this, sensor, (int) TimeUnit.MILLISECONDS.toMicros(this.f19650a));
        } catch (Throwable th) {
            this.f19655f.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f19655f.O().a("SensorDataManager", "Unable to register sensor listener", th);
            }
        }
    }

    public float b() {
        return this.f19657h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f19655f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f19652c.b(this);
        if (((Boolean) this.f19655f.o0().a(l4.f19843U3)).booleanValue()) {
            a(this.f19653d);
        }
        if (((Boolean) this.f19655f.o0().a(l4.f19850V3)).booleanValue()) {
            a(this.f19654e);
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f19652c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f19656g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f19657h * this.f19651b;
            this.f19657h = f10;
            this.f19657h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f10;
        }
    }

    public float a() {
        if (this.f19656g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
