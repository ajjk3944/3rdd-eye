package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2112c0 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f19144c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final t6 f19145a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19146b;

    private C2112c0(long j4, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f19145a = t6.a(j4, z10, kVar, new F(this, z10, runnable, 0));
        this.f19146b = kVar;
        f19144c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f19145a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f19145a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f19145a.e();
        }
    }

    public static C2112c0 a(long j4, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j4, false, kVar, runnable);
    }

    public static C2112c0 a(long j4, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new C2112c0(j4, z10, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Runnable runnable) {
        if (!z10) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f19145a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f19144c.remove(this);
    }
}
