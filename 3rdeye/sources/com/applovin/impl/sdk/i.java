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

/* loaded from: classes.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: h, reason: collision with root package name */
    public static int f21151h = -1;
    private static final Float i = Float.valueOf(15.0f);

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f21152a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21153b;

    /* renamed from: c, reason: collision with root package name */
    private final k f21154c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f21155d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f21156e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f21157f;

    /* renamed from: g, reason: collision with root package name */
    private int f21158g;

    public interface a {
        void a(int i);
    }

    public i(k kVar) {
        this.f21154c = kVar;
        Context contextO = k.o();
        this.f21153b = contextO;
        this.f21152a = (AudioManager) contextO.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void d() {
        this.f21154c.O();
        if (o.a()) {
            this.f21154c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f21158g = f21151h;
        this.f21153b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f21154c.O();
        if (o.a()) {
            this.f21154c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f21153b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f21152a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f21152a.getRingerMode());
        }
    }

    private Float a() {
        if (this.f21152a == null) {
            return i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.f21154c.O();
            if (o.a()) {
                this.f21154c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return i;
        }
    }

    public Float b() {
        if (this.f21152a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th) {
            this.f21154c.O();
            if (o.a()) {
                this.f21154c.O().a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f21157f = true;
            this.f21158g = this.f21152a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f21157f = false;
            if (this.f21158g != this.f21152a.getRingerMode()) {
                this.f21158g = f21151h;
                b(this.f21152a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f21156e) {
            try {
                if (this.f21155d.contains(aVar)) {
                    this.f21155d.remove(aVar);
                    if (this.f21155d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f21156e) {
            try {
                if (this.f21155d.contains(aVar)) {
                    return;
                }
                this.f21155d.add(aVar);
                if (this.f21155d.size() == 1) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(int i10) {
        if (this.f21157f) {
            return;
        }
        this.f21154c.O();
        if (o.a()) {
            this.f21154c.O().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f21156e) {
            try {
                Iterator it = this.f21155d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new B0.h(i10, 2, (a) it.next()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
