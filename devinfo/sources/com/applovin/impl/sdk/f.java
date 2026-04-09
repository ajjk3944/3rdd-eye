package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.o0;
import com.applovin.impl.g7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private g7 f5470a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5471b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5472c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private boolean f5473d;

    /* renamed from: e, reason: collision with root package name */
    private final k f5474e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference f5475f;
    private long g;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        void onAdRefresh();
    }

    public f(k kVar, a aVar) {
        this.f5475f = new WeakReference(aVar);
        this.f5474e = kVar;
    }

    private void e() {
        if (((Boolean) this.f5474e.a(r3.D7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f5474e.a(r3.D7)).booleanValue()) {
            synchronized (this.f5471b) {
                try {
                    if (this.f5473d) {
                        this.f5474e.O();
                        if (o.a()) {
                            this.f5474e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f5474e.m0().isApplicationPaused()) {
                        this.f5474e.O();
                        if (o.a()) {
                            this.f5474e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        g7 g7Var = this.f5470a;
                        if (g7Var != null) {
                            g7Var.e();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f5475f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f5471b) {
            try {
                g7 g7Var = this.f5470a;
                if (g7Var != null) {
                    g7Var.d();
                } else {
                    this.f5474e.O();
                    if (o.a()) {
                        this.f5474e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f5472c.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        synchronized (this.f5471b) {
            try {
                this.f5470a = null;
                if (!((Boolean) this.f5474e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n() {
        synchronized (this.f5471b) {
            try {
                g7 g7Var = this.f5470a;
                if (g7Var != null) {
                    g7Var.e();
                } else {
                    this.f5472c.set(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f5471b) {
            try {
                g7 g7Var = this.f5470a;
                jC = g7Var != null ? g7Var.c() : -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f5474e.a(r3.C7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z3;
        a aVar;
        if (((Boolean) this.f5474e.a(r3.C7)).booleanValue()) {
            synchronized (this.f5471b) {
                try {
                    if (this.f5473d) {
                        this.f5474e.O();
                        if (o.a()) {
                            this.f5474e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f5474e.H().d()) {
                        this.f5474e.O();
                        if (o.a()) {
                            this.f5474e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f5470a != null) {
                        long jB = this.g - b();
                        long jLongValue = ((Long) this.f5474e.a(r3.B7)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f5470a.e();
                            z3 = false;
                        } else {
                            a();
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    if (!z3 || (aVar = (a) this.f5475f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean g() {
        return this.f5473d;
    }

    public boolean h() {
        boolean z3;
        synchronized (this.f5471b) {
            z3 = this.f5470a != null;
        }
        return z3;
    }

    public void j() {
        synchronized (this.f5471b) {
            k();
            this.f5473d = true;
        }
    }

    public void m() {
        synchronized (this.f5471b) {
            n();
            this.f5473d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j) {
        synchronized (this.f5471b) {
            try {
                a();
                this.g = j;
                this.f5470a = g7.a(j, this.f5474e, new o0(12, this));
                if (!((Boolean) this.f5474e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f5474e.a(r3.D7)).booleanValue() && (this.f5474e.H().d() || this.f5474e.m0().isApplicationPaused())) {
                    this.f5470a.d();
                }
                if (this.f5472c.compareAndSet(true, false) && ((Boolean) this.f5474e.a(r3.F7)).booleanValue()) {
                    this.f5474e.O();
                    if (o.a()) {
                        this.f5474e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f5470a.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f5471b) {
            try {
                g7 g7Var = this.f5470a;
                if (g7Var != null) {
                    g7Var.a();
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
