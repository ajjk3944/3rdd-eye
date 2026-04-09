package com.applovin.impl.sdk;

import C.g0;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.g3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.t6;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private t6 f21109a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21110b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f21111c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private boolean f21112d;

    /* renamed from: e, reason: collision with root package name */
    private final k f21113e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference f21114f;

    /* renamed from: g, reason: collision with root package name */
    private long f21115g;

    public interface a {
        void onAdRefresh();
    }

    public f(k kVar, a aVar) {
        this.f21114f = new WeakReference(aVar);
        this.f21113e = kVar;
    }

    private void e() {
        if (((Boolean) this.f21113e.a(g3.f19399a7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f21113e.a(g3.f19399a7)).booleanValue()) {
            synchronized (this.f21110b) {
                try {
                    if (this.f21112d) {
                        this.f21113e.O();
                        if (o.a()) {
                            this.f21113e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f21113e.m0().isApplicationPaused()) {
                        this.f21113e.O();
                        if (o.a()) {
                            this.f21113e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        t6 t6Var = this.f21109a;
                        if (t6Var != null) {
                            t6Var.e();
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
        a aVar = (a) this.f21114f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f21110b) {
            try {
                t6 t6Var = this.f21109a;
                if (t6Var != null) {
                    t6Var.d();
                } else {
                    this.f21113e.O();
                    if (o.a()) {
                        this.f21113e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f21111c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (this.f21110b) {
            try {
                this.f21109a = null;
                if (!((Boolean) this.f21113e.a(g3.f19400b7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        synchronized (this.f21110b) {
            try {
                t6 t6Var = this.f21109a;
                if (t6Var != null) {
                    t6Var.e();
                } else {
                    this.f21111c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f21110b) {
            try {
                t6 t6Var = this.f21109a;
                jC = t6Var != null ? t6Var.c() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f21113e.a(g3.f19398Z6)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f21113e.a(g3.f19398Z6)).booleanValue()) {
            synchronized (this.f21110b) {
                try {
                    if (this.f21112d) {
                        this.f21113e.O();
                        if (o.a()) {
                            this.f21113e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f21113e.I().c()) {
                        this.f21113e.O();
                        if (o.a()) {
                            this.f21113e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f21109a != null) {
                        long jB = this.f21115g - b();
                        long jLongValue = ((Long) this.f21113e.a(g3.f19397Y6)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f21109a.e();
                            z10 = false;
                        } else {
                            a();
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10 || (aVar = (a) this.f21114f.get()) == null) {
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
        return this.f21112d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f21110b) {
            z10 = this.f21109a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f21110b) {
            k();
            this.f21112d = true;
        }
    }

    public void m() {
        synchronized (this.f21110b) {
            n();
            this.f21112d = false;
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

    public void a(long j4) {
        synchronized (this.f21110b) {
            try {
                a();
                this.f21115g = j4;
                this.f21109a = t6.a(j4, this.f21113e, new g0(this, 16));
                if (!((Boolean) this.f21113e.a(g3.f19400b7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f21113e.a(g3.f19399a7)).booleanValue() && (this.f21113e.I().c() || this.f21113e.m0().isApplicationPaused())) {
                    this.f21109a.d();
                }
                if (this.f21111c.compareAndSet(true, false) && ((Boolean) this.f21113e.a(g3.f19401c7)).booleanValue()) {
                    this.f21113e.O();
                    if (o.a()) {
                        this.f21113e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f21109a.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f21110b) {
            try {
                t6 t6Var = this.f21109a;
                if (t6Var != null) {
                    t6Var.a();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
