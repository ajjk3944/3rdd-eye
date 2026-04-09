package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18850c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18852e;

    public /* synthetic */ ys1(Context context, boolean z3, it1 it1Var, cv1 cv1Var) {
        this.f18848a = 0;
        this.f18850c = context;
        this.f18849b = z3;
        this.f18851d = it1Var;
        this.f18852e = cv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f18848a) {
            case 0:
                av1 av1VarP = av1.p((Context) this.f18850c);
                if (av1VarP != null) {
                    if (this.f18849b) {
                        ((it1) this.f18851d).w1(av1VarP);
                    }
                    ((cv1) this.f18852e).a(av1VarP.q());
                    break;
                } else {
                    ls.t("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    break;
                }
            case 1:
                ec.j3 j3Var = (ec.j3) this.f18852e;
                ec.g0 g0Var = j3Var.f22819e;
                if (g0Var != null) {
                    j3Var.T(g0Var, this.f18849b ? null : (ec.i4) this.f18851d, (ec.n4) this.f18850c);
                    j3Var.O();
                    break;
                } else {
                    ec.s0 s0Var = ((ec.o1) j3Var.f218b).f22954f;
                    ec.o1.m(s0Var);
                    s0Var.g.d("Discarding data. Failed to set user property");
                    break;
                }
            case 2:
                ec.j3 j3Var2 = (ec.j3) this.f18852e;
                ec.g0 g0Var2 = j3Var2.f22819e;
                if (g0Var2 != null) {
                    j3Var2.T(g0Var2, this.f18849b ? null : (ec.u) this.f18851d, (ec.n4) this.f18850c);
                    j3Var2.O();
                    break;
                } else {
                    ec.s0 s0Var2 = ((ec.o1) j3Var2.f218b).f22954f;
                    ec.o1.m(s0Var2);
                    s0Var2.g.d("Discarding data. Failed to send event to service");
                    break;
                }
            default:
                ec.j3 j3Var3 = (ec.j3) this.f18852e;
                ec.g0 g0Var3 = j3Var3.f22819e;
                if (g0Var3 != null) {
                    j3Var3.T(g0Var3, this.f18849b ? null : (ec.e) this.f18851d, (ec.n4) this.f18850c);
                    j3Var3.O();
                    break;
                } else {
                    ec.s0 s0Var3 = ((ec.o1) j3Var3.f218b).f22954f;
                    ec.o1.m(s0Var3);
                    s0Var3.g.d("Discarding data. Failed to send conditional user property to service");
                    break;
                }
        }
    }

    public /* synthetic */ ys1(ec.j3 j3Var, ec.n4 n4Var, boolean z3, qb.a aVar, int i4) {
        this.f18848a = i4;
        this.f18850c = n4Var;
        this.f18849b = z3;
        this.f18851d = aVar;
        this.f18852e = j3Var;
    }

    public ys1(ec.j3 j3Var, ec.n4 n4Var, boolean z3, ec.e eVar) {
        this.f18848a = 3;
        this.f18850c = n4Var;
        this.f18849b = z3;
        this.f18851d = eVar;
        Objects.requireNonNull(j3Var);
        this.f18852e = j3Var;
    }
}
