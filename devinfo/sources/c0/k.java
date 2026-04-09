package c0;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2454a;

    /* renamed from: b, reason: collision with root package name */
    public final d3.c f2455b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2456c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.a0 f2457d;

    public k(Context context, d3.c cVar, long j, g0.a0 a0Var) {
        this.f2454a = context;
        this.f2455b = cVar;
        this.f2456c = j;
        this.f2457d = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nk.k.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        k kVar = (k) obj;
        return nk.k.a(this.f2454a, kVar.f2454a) && nk.k.a(this.f2455b, kVar.f2455b) && p1.s.c(this.f2456c, kVar.f2456c) && nk.k.a(this.f2457d, kVar.f2457d);
    }

    public final int hashCode() {
        int iHashCode = (this.f2455b.hashCode() + (this.f2454a.hashCode() * 31)) * 31;
        int i4 = p1.s.f31019i;
        return this.f2457d.hashCode() + a0.g.f(iHashCode, 31, this.f2456c);
    }
}
