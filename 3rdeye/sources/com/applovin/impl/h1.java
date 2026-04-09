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
public class h1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19477a;

    /* renamed from: b, reason: collision with root package name */
    private final C2109b0 f19478b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f19479c;

    /* renamed from: d, reason: collision with root package name */
    private final a f19480d;

    /* renamed from: e, reason: collision with root package name */
    private float f19481e;

    public interface a {
        void a();

        void b();
    }

    public h1(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f19477a = kVar;
        C2109b0 c2109b0 = new C2109b0(kVar);
        this.f19478b = c2109b0;
        this.f19479c = c2109b0.a(1);
        this.f19480d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f19477a.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f19478b.b(this);
        this.f19478b.b(this, this.f19479c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f19478b.b(this);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f19478b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f19481e;
            float f11 = (fMax * 0.5f) + (f10 * 0.5f);
            this.f19481e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f19480d.a();
            } else {
                if (f10 <= -0.8f || f11 >= -0.8f) {
                    return;
                }
                this.f19480d.b();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
