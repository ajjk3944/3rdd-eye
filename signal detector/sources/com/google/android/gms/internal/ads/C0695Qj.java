package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;
import q2.C2852x0;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695Qj implements InterfaceC1382jk, InterfaceC1599nl, InterfaceC0832Yk, InterfaceC1813rk, M7 {

    /* renamed from: a, reason: collision with root package name */
    public final C1867sk f10681a;

    /* renamed from: b, reason: collision with root package name */
    public final C0594Kk f10682b;

    /* renamed from: c, reason: collision with root package name */
    public final Qt f10683c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f10684d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10685e;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f10687g;
    public final String i;

    /* renamed from: f, reason: collision with root package name */
    public final PD f10686f = new PD();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f10688h = new AtomicBoolean();

    public C0695Qj(C1867sk c1867sk, Qt qt, ScheduledExecutorService scheduledExecutorService, C0623Mf c0623Mf, String str, C0594Kk c0594Kk) {
        this.f10681a = c1867sk;
        this.f10683c = qt;
        this.f10684d = scheduledExecutorService;
        this.f10685e = c0623Mf;
        this.i = str;
        this.f10682b = c0594Kk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final void K(L7 l7) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ic)).booleanValue() && this.i.equals("com.google.ads.mediation.admob.AdMobAdapter") && l7.f9629j && this.f10688h.compareAndSet(false, true) && this.f10683c.f10764e != 3) {
            AbstractC2907C.m("Full screen 1px impression occurred");
            this.f10681a.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void N() {
        Qt qt = this.f10683c;
        if (qt.f10764e == 3) {
            return;
        }
        int i = qt.f10755Y;
        if (i == 0 || i == 1) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ic)).booleanValue() && this.i.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f10681a.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final synchronized void c() {
        if (this.f10683c.f10764e == 4) {
            this.f10681a.a();
            return;
        }
        PD pd = this.f10686f;
        if (pd.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f10687g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        pd.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599nl
    public final void e() {
        Qt qt = this.f10683c;
        int i = qt.f10764e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.f10682b.a();
            return;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8673T1)).booleanValue() && qt.f10755Y == 2) {
            int i3 = qt.f10787q;
            if (i3 == 0) {
                this.f10681a.a();
                return;
            }
            L6 l6 = new L6(14, this);
            PD pd = this.f10686f;
            pd.a(new CD(pd, 0, l6), this.f10685e);
            this.f10687g = this.f10684d.schedule(new RunnableC0558Ii(4, this), i3, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1813rk
    public final synchronized void f(C2852x0 c2852x0) {
        try {
            PD pd = this.f10686f;
            if (pd.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f10687g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            pd.e(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599nl
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void F(BinderC2185ye binderC2185ye, String str, String str2) {
    }
}
