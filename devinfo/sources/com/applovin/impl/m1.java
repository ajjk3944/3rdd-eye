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
public class m1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4471a;

    /* renamed from: b, reason: collision with root package name */
    private final f0 f4472b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f4473c;

    /* renamed from: d, reason: collision with root package name */
    private final a f4474d;

    /* renamed from: e, reason: collision with root package name */
    private float f4475e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a();

        void b();
    }

    public m1(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f4471a = kVar;
        f0 f0Var = new f0();
        this.f4472b = f0Var;
        this.f4473c = f0Var.a(1);
        this.f4474d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f4471a.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f4472b.b(this);
        this.f4472b.b(this, this.f4473c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f4471a.O());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f4472b.b(this);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f4472b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f4475e;
            float f11 = (fMax * 0.5f) + (f10 * 0.5f);
            this.f4475e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f4474d.a();
            } else {
                if (f10 <= -0.8f || f11 >= -0.8f) {
                    return;
                }
                this.f4474d.b();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i4) {
    }
}
