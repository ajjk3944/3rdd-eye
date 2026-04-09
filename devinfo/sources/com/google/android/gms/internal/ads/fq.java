package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fq implements ix, hx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq f11252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yr0 f11253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y50 f11254c;

    public /* synthetic */ fq(y50 y50Var, iq iqVar, yr0 yr0Var) {
        this.f11252a = iqVar;
        this.f11253b = yr0Var;
        this.f11254c = y50Var;
    }

    @Override // com.google.android.gms.internal.ads.hx
    /* renamed from: b */
    public void mo164b() {
        cs0 cs0Var;
        ya.a0.m("loadNewJavascriptEngine (failure): Trying to acquire lock");
        y50 y50Var = this.f11254c;
        synchronized (y50Var.f18643b) {
            try {
                ya.a0.m("loadNewJavascriptEngine (failure): Lock acquired");
                y50Var.g = 1;
                ya.a0.m("Failed loading new engine. Marking new engine destroyable.");
                this.f11252a.A();
                if (((Boolean) ol.f14725d.u()).booleanValue() && (cs0Var = (cs0) y50Var.f18646e) != null) {
                    yr0 yr0Var = this.f11253b;
                    yr0Var.g("Failed loading new engine");
                    yr0Var.c(false);
                    cs0Var.b(yr0Var.F1());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ya.a0.m("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.ix
    public /* synthetic */ void c(Object obj) {
        cs0 cs0Var;
        ya.a0.m("loadNewJavascriptEngine (success): Trying to acquire lock");
        y50 y50Var = this.f11254c;
        synchronized (y50Var.f18643b) {
            try {
                ya.a0.m("loadNewJavascriptEngine (success): Lock acquired");
                y50Var.g = 0;
                iq iqVar = (iq) y50Var.f18647f;
                if (iqVar != null && this.f11252a != iqVar) {
                    ya.a0.m("New JS engine is loaded, marking previous one as destroyable.");
                    ((iq) y50Var.f18647f).A();
                }
                y50Var.f18647f = this.f11252a;
                if (((Boolean) ol.f14725d.u()).booleanValue() && (cs0Var = (cs0) y50Var.f18646e) != null) {
                    yr0 yr0Var = this.f11253b;
                    yr0Var.c(true);
                    cs0Var.b(yr0Var.F1());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ya.a0.m("loadNewJavascriptEngine (success): Lock released");
    }
}
