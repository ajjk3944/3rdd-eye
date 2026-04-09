package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ey1 extends zx1 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f10919e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f10920c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10921d;

    public ey1(uh uhVar, Object obj, Object obj2) {
        super(uhVar);
        this.f10920c = obj;
        this.f10921d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zx1, com.google.android.gms.internal.ads.uh
    public final fh b(int i4, fh fhVar, long j) {
        this.f19232b.b(i4, fhVar, j);
        if (Objects.equals(fhVar.f11164a, this.f10920c)) {
            fhVar.f11164a = fh.f11162m;
        }
        return fhVar;
    }

    @Override // com.google.android.gms.internal.ads.zx1, com.google.android.gms.internal.ads.uh
    public final tg d(int i4, tg tgVar, boolean z3) {
        this.f19232b.d(i4, tgVar, z3);
        if (Objects.equals(tgVar.f16810b, this.f10921d) && z3) {
            tgVar.f16810b = f10919e;
        }
        return tgVar;
    }

    @Override // com.google.android.gms.internal.ads.zx1, com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        Object obj2;
        if (f10919e.equals(obj) && (obj2 = this.f10921d) != null) {
            obj = obj2;
        }
        return this.f19232b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.zx1, com.google.android.gms.internal.ads.uh
    public final Object f(int i4) {
        Object objF = this.f19232b.f(i4);
        return Objects.equals(objF, this.f10921d) ? f10919e : objF;
    }
}
