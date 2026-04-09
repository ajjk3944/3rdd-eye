package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n50 implements g60, k80, t70, n60, xg {

    /* renamed from: a, reason: collision with root package name */
    public final o60 f14152a;

    /* renamed from: b, reason: collision with root package name */
    public final f70 f14153b;

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f14154c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f14155d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f14156e;
    public ScheduledFuture g;

    /* renamed from: i, reason: collision with root package name */
    public final String f14159i;

    /* renamed from: f, reason: collision with root package name */
    public final d91 f14157f = new d91();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f14158h = new AtomicBoolean();

    public n50(o60 o60Var, wp0 wp0Var, ScheduledExecutorService scheduledExecutorService, ex exVar, String str, f70 f70Var) {
        this.f14152a = o60Var;
        this.f14154c = wp0Var;
        this.f14155d = scheduledExecutorService;
        this.f14156e = exVar;
        this.f14159i = str;
        this.f14153b = f70Var;
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void E() {
        wp0 wp0Var = this.f14154c;
        if (wp0Var.f18080e == 3) {
            return;
        }
        int i4 = wp0Var.Y;
        if (i4 == 0 || i4 == 1) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Kc)).booleanValue() && this.f14159i.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f14152a.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final synchronized void b(va.w1 w1Var) {
        try {
            d91 d91Var = this.f14157f;
            if (d91Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            d91Var.f(new Exception());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void e() {
        wp0 wp0Var = this.f14154c;
        int i4 = wp0Var.f18080e;
        if (i4 == 3) {
            return;
        }
        if (i4 == 4) {
            this.f14153b.a();
            return;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.T1)).booleanValue() && wp0Var.Y == 2) {
            int i10 = wp0Var.f18102q;
            if (i10 == 0) {
                this.f14152a.a();
                return;
            }
            ix0 ix0Var = new ix0(17, this);
            d91 d91Var = this.f14157f;
            d91Var.a(new q81(0, d91Var, ix0Var), this.f14156e);
            this.g = this.f14155d.schedule(new s30(3, this), i10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final synchronized void f() {
        if (this.f14154c.f18080e == 4) {
            this.f14152a.a();
            return;
        }
        d91 d91Var = this.f14157f;
        if (d91Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        d91Var.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final void w(wg wgVar) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Kc)).booleanValue() && this.f14159i.equals("com.google.ads.mediation.admob.AdMobAdapter") && wgVar.j && this.f14158h.compareAndSet(false, true) && this.f14154c.f18080e != 3) {
            ya.a0.m("Full screen 1px impression occurred");
            this.f14152a.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void z1() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void q(pu puVar, String str, String str2) {
    }
}
