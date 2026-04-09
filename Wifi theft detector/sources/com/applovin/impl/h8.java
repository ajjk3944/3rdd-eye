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

/* loaded from: classes.dex */
public class h8 {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f6140f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6141a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6142b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f6143c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f6144d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Timer f6145e;

    public class a extends TimerTask {

        /* renamed from: com.applovin.impl.h8$a$a, reason: collision with other inner class name */
        public class C0075a implements AppLovinBroadcastManager.Receiver {
            public C0075a() {
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
            if (!h8.this.f6142b.m0().isApplicationPaused() || h8.this.f6141a) {
                h8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0075a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private h8(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f6145e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j10);
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f6141a = z10;
        this.f6142b = kVar;
        this.f6143c = runnable;
        f6140f.add(this);
        timer.schedule(b(), j10);
    }

    public static h8 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new h8(j10, z10, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f6143c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f6144d) {
            this.f6145e.cancel();
            this.f6143c = null;
            f6140f.remove(this);
        }
    }
}
