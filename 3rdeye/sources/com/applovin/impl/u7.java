package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import io.appmetrica.analytics.impl.Oo;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class u7 {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f21548f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21549a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21550b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f21551c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21552d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Timer f21553e;

    public class a extends TimerTask {

        /* renamed from: com.applovin.impl.u7$a$a, reason: collision with other inner class name */
        public class C0322a implements AppLovinBroadcastManager.Receiver {
            public C0322a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                u7.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!u7.this.f21550b.m0().isApplicationPaused() || u7.this.f21549a) {
                u7.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0322a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private u7(long j4, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f21553e = timer;
        if (j4 < 0) {
            throw new IllegalArgumentException(Oo.d(j4, "Cannot create wall clock timer. Invalid timer length: "));
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f21549a = z10;
        this.f21550b = kVar;
        this.f21551c = runnable;
        f21548f.add(this);
        timer.schedule(b(), j4);
    }

    public static u7 a(long j4, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new u7(j4, z10, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f21551c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f21552d) {
            this.f21553e.cancel();
            this.f21551c = null;
            f21548f.remove(this);
        }
    }
}
