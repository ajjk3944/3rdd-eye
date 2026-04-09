package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h40 implements w60, xg, t70 {

    /* renamed from: a, reason: collision with root package name */
    public final wp0 f11695a;

    /* renamed from: b, reason: collision with root package name */
    public final o60 f11696b;

    /* renamed from: c, reason: collision with root package name */
    public final a70 f11697c;

    /* renamed from: f, reason: collision with root package name */
    public final f70 f11700f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11698d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11699e = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public h40(wp0 wp0Var, o60 o60Var, a70 a70Var, f70 f70Var) {
        this.f11695a = wp0Var;
        this.f11696b = o60Var;
        this.f11697c = a70Var;
        this.f11700f = f70Var;
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final synchronized void e() {
        int i4 = this.f11695a.f18080e;
        if (i4 == 1 || i4 == 4) {
            return;
        }
        if (this.f11698d.compareAndSet(false, true)) {
            this.f11696b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void f() {
        if (this.f11695a.f18080e == 4 && this.f11698d.compareAndSet(false, true)) {
            this.f11696b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final void w(wg wgVar) {
        int i4 = this.f11695a.f18080e;
        if (i4 == 1) {
            if (wgVar.j && this.f11698d.compareAndSet(false, true)) {
                this.f11696b.a();
            }
        } else if (i4 == 4 && wgVar.j && this.g.compareAndSet(false, true)) {
            this.f11700f.a();
        }
        if (wgVar.j && this.f11699e.compareAndSet(false, true)) {
            a70 a70Var = this.f11697c;
            synchronized (a70Var) {
                a70Var.p1(k60.f13051k);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void r() {
    }
}
