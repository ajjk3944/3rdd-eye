package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.g7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private g7 f7749a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7750b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7751c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7752d;

    /* renamed from: e, reason: collision with root package name */
    private final k f7753e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference f7754f;

    /* renamed from: g, reason: collision with root package name */
    private long f7755g;

    public interface a {
        void onAdRefresh();
    }

    public f(k kVar, a aVar) {
        this.f7754f = new WeakReference(aVar);
        this.f7753e = kVar;
    }

    private void e() {
        if (((Boolean) this.f7753e.a(r3.D7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f7753e.a(r3.D7)).booleanValue()) {
            synchronized (this.f7750b) {
                try {
                    if (this.f7752d) {
                        this.f7753e.O();
                        if (o.a()) {
                            this.f7753e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f7753e.m0().isApplicationPaused()) {
                        this.f7753e.O();
                        if (o.a()) {
                            this.f7753e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        g7 g7Var = this.f7749a;
                        if (g7Var != null) {
                            g7Var.e();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f7754f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f7750b) {
            try {
                g7 g7Var = this.f7749a;
                if (g7Var != null) {
                    g7Var.d();
                } else {
                    this.f7753e.O();
                    if (o.a()) {
                        this.f7753e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f7751c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (this.f7750b) {
            try {
                this.f7749a = null;
                if (!((Boolean) this.f7753e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        synchronized (this.f7750b) {
            try {
                g7 g7Var = this.f7749a;
                if (g7Var != null) {
                    g7Var.e();
                } else {
                    this.f7751c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f7750b) {
            try {
                g7 g7Var = this.f7749a;
                jC = g7Var != null ? g7Var.c() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f7753e.a(r3.C7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f7753e.a(r3.C7)).booleanValue()) {
            synchronized (this.f7750b) {
                try {
                    if (this.f7752d) {
                        this.f7753e.O();
                        if (o.a()) {
                            this.f7753e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f7753e.H().d()) {
                        this.f7753e.O();
                        if (o.a()) {
                            this.f7753e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f7749a != null) {
                        long jB = this.f7755g - b();
                        long jLongValue = ((Long) this.f7753e.a(r3.B7)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f7749a.e();
                            z10 = false;
                        } else {
                            a();
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10 || (aVar = (a) this.f7754f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean g() {
        return this.f7752d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f7750b) {
            z10 = this.f7749a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f7750b) {
            k();
            this.f7752d = true;
        }
    }

    public void m() {
        synchronized (this.f7750b) {
            n();
            this.f7752d = false;
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

    public void a(long j10) {
        synchronized (this.f7750b) {
            try {
                a();
                this.f7755g = j10;
                this.f7749a = g7.a(j10, this.f7753e, new Runnable() { // from class: com.applovin.impl.sdk.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7780a.i();
                    }
                });
                if (!((Boolean) this.f7753e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f7753e.a(r3.D7)).booleanValue() && (this.f7753e.H().d() || this.f7753e.m0().isApplicationPaused())) {
                    this.f7749a.d();
                }
                if (this.f7751c.compareAndSet(true, false) && ((Boolean) this.f7753e.a(r3.F7)).booleanValue()) {
                    this.f7753e.O();
                    if (o.a()) {
                        this.f7753e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f7749a.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f7750b) {
            try {
                g7 g7Var = this.f7749a;
                if (g7Var != null) {
                    g7Var.a();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
