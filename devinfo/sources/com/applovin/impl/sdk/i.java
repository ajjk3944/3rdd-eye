package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: h, reason: collision with root package name */
    public static int f5510h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final Float f5511i = Float.valueOf(15.0f);

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f5512a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5513b;

    /* renamed from: c, reason: collision with root package name */
    private final k f5514c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f5515d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f5516e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f5517f;
    private int g;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void a(int i4);
    }

    public i(k kVar) {
        this.f5514c = kVar;
        Context contextO = k.o();
        this.f5513b = contextO;
        this.f5512a = (AudioManager) contextO.getSystemService("audio");
    }

    public static boolean a(int i4) {
        return i4 == 0 || i4 == 1;
    }

    private void d() {
        this.f5514c.O();
        if (o.a()) {
            this.f5514c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.g = f5510h;
        this.f5513b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f5514c.O();
        if (o.a()) {
            this.f5514c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f5513b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f5512a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f5512a.getRingerMode());
        }
    }

    private Float a() {
        if (this.f5512a == null) {
            return f5511i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th2) {
            this.f5514c.O();
            if (o.a()) {
                this.f5514c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th2);
            }
            return f5511i;
        }
    }

    public Float b() {
        if (this.f5512a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th2) {
            this.f5514c.O();
            if (o.a()) {
                this.f5514c.O().a("AudioSessionManager", "Unable to collect device volume", th2);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f5517f = true;
            this.g = this.f5512a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f5517f = false;
            if (this.g != this.f5512a.getRingerMode()) {
                this.g = f5510h;
                b(this.f5512a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f5516e) {
            try {
                if (this.f5515d.contains(aVar)) {
                    this.f5515d.remove(aVar);
                    if (this.f5515d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f5516e) {
            try {
                if (this.f5515d.contains(aVar)) {
                    return;
                }
                this.f5515d.add(aVar);
                if (this.f5515d.size() == 1) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b(int i4) {
        if (this.f5517f) {
            return;
        }
        this.f5514c.O();
        if (o.a()) {
            this.f5514c.O().a("AudioSessionManager", "Ringer mode is " + i4);
        }
        synchronized (this.f5516e) {
            try {
                Iterator it = this.f5515d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.adview.p((a) it.next(), i4, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
