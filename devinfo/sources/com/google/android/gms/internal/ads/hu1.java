package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hu1 {

    /* renamed from: a, reason: collision with root package name */
    public final gu1 f11977a;

    /* renamed from: b, reason: collision with root package name */
    public final fu1 f11978b;

    /* renamed from: c, reason: collision with root package name */
    public int f11979c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11980d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f11981e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11982f;

    public hu1(fu1 fu1Var, gu1 gu1Var, Looper looper) {
        this.f11978b = fu1Var;
        this.f11977a = gu1Var;
        this.f11981e = looper;
    }

    public final void a() {
        mq0.c0(!this.f11982f);
        this.f11982f = true;
        nt1 nt1Var = (nt1) this.f11978b;
        if (!nt1Var.H && nt1Var.j.getThread().isAlive()) {
            nt1Var.f14419h.b(14, this).a();
        } else {
            ls.t("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z3) {
        notifyAll();
    }
}
