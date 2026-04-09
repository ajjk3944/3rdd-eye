package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fy1 extends uh {

    /* renamed from: b, reason: collision with root package name */
    public final h5 f11291b;

    public fy1(h5 h5Var) {
        this.f11291b = h5Var;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final fh b(int i4, fh fhVar, long j) {
        Object obj = fh.f11162m;
        fhVar.a(this.f11291b, false, true, null, -9223372036854775807L);
        fhVar.f11171i = true;
        return fhVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final tg d(int i4, tg tgVar, boolean z3) {
        Integer num = z3 ? 0 : null;
        Object obj = z3 ? ey1.f10919e : null;
        mu muVar = mu.f14017b;
        tgVar.a(num, obj, 0, -9223372036854775807L, true);
        return tgVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        return obj == ey1.f10919e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final Object f(int i4) {
        return ey1.f10919e;
    }
}
