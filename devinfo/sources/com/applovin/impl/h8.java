package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h8 {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f4222f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4223a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4224b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f4225c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f4226d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Timer f4227e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends TimerTask {

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.applovin.impl.h8$a$a, reason: collision with other inner class name */
        public class C0011a implements AppLovinBroadcastManager.Receiver {
            public C0011a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                h8.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!h8.this.f4224b.m0().isApplicationPaused() || h8.this.f4223a) {
                h8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0011a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private h8(long j, boolean z3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f4227e = timer;
        if (j < 0) {
            throw new IllegalArgumentException(a0.g.j(j, "Cannot create wall clock timer. Invalid timer length: "));
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f4223a = z3;
        this.f4224b = kVar;
        this.f4225c = runnable;
        f4222f.add(this);
        timer.schedule(b(), j);
    }

    public static h8 a(long j, boolean z3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new h8(j, z3, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f4225c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f4226d) {
            this.f4227e.cancel();
            this.f4225c = null;
            f4222f.remove(this);
        }
    }
}
