package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: h, reason: collision with root package name */
    public static int f7797h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final Float f7798i = Float.valueOf(15.0f);

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f7799a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7800b;

    /* renamed from: c, reason: collision with root package name */
    private final k f7801c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f7802d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f7803e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f7804f;

    /* renamed from: g, reason: collision with root package name */
    private int f7805g;

    public interface a {
        void a(int i10);
    }

    public i(k kVar) {
        this.f7801c = kVar;
        Context contextO = k.o();
        this.f7800b = contextO;
        this.f7799a = (AudioManager) contextO.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void d() {
        this.f7801c.O();
        if (o.a()) {
            this.f7801c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f7805g = f7797h;
        this.f7800b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f7801c.O();
        if (o.a()) {
            this.f7801c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f7800b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f7799a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f7799a.getRingerMode());
        }
    }

    private Float a() {
        if (this.f7799a == null) {
            return f7798i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.f7801c.O();
            if (o.a()) {
                this.f7801c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return f7798i;
        }
    }

    public Float b() {
        if (this.f7799a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th) {
            this.f7801c.O();
            if (o.a()) {
                this.f7801c.O().a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f7804f = true;
            this.f7805g = this.f7799a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f7804f = false;
            if (this.f7805g != this.f7799a.getRingerMode()) {
                this.f7805g = f7797h;
                b(this.f7799a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f7803e) {
            try {
                if (this.f7802d.contains(aVar)) {
                    this.f7802d.remove(aVar);
                    if (this.f7802d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f7803e) {
            try {
                if (this.f7802d.contains(aVar)) {
                    return;
                }
                this.f7802d.add(aVar);
                if (this.f7802d.size() == 1) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(final int i10) {
        if (this.f7804f) {
            return;
        }
        this.f7801c.O();
        if (o.a()) {
            this.f7801c.O().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f7803e) {
            try {
                for (final a aVar : this.f7802d) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar.a(i10);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
