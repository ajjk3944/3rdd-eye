package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g0 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f4138c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final g7 f4139a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4140b;

    private g0(long j, boolean z3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f4139a = g7.a(j, z3, kVar, new j9(this, z3, runnable, 0));
        this.f4140b = kVar;
        f4138c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f4139a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f4139a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f4139a.e();
        }
    }

    public static g0 a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j, false, kVar, runnable);
    }

    public static g0 a(long j, boolean z3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new g0(j, z3, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z3, Runnable runnable) {
        if (!z3) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f4139a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f4138c.remove(this);
    }
}
