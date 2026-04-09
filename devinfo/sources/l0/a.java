package l0;

import e0.i;
import i1.m;
import i2.k;
import i2.v0;
import p2.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class a extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28530a;

    /* renamed from: b, reason: collision with root package name */
    public final i f28531b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28532c;

    /* renamed from: d, reason: collision with root package name */
    public final h f28533d;

    /* renamed from: e, reason: collision with root package name */
    public final mk.c f28534e;

    public a(boolean z3, i iVar, boolean z10, h hVar, mk.c cVar) {
        this.f28530a = z3;
        this.f28531b = iVar;
        this.f28532c = z10;
        this.f28533d = hVar;
        this.f28534e = cVar;
    }

    @Override // i2.v0
    public final m d() {
        return new d(this.f28530a, this.f28531b, this.f28532c, this.f28533d, this.f28534e);
    }

    @Override // i2.v0
    public final void e(m mVar) {
        d dVar = (d) mVar;
        boolean z3 = dVar.J;
        boolean z10 = this.f28530a;
        if (z3 != z10) {
            dVar.J = z10;
            k.l(dVar);
        }
        dVar.K = this.f28534e;
        dVar.y0(this.f28531b, null, this.f28532c, this.f28533d, dVar.L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28530a == aVar.f28530a && nk.k.a(this.f28531b, aVar.f28531b) && this.f28532c == aVar.f28532c && this.f28533d.equals(aVar.f28533d) && this.f28534e == aVar.f28534e;
    }

    public final int hashCode() {
        int i4 = (this.f28530a ? 1231 : 1237) * 31;
        i iVar = this.f28531b;
        return this.f28534e.hashCode() + ((((((((i4 + (iVar != null ? iVar.hashCode() : 0)) * 961) + 1237) * 31) + (this.f28532c ? 1231 : 1237)) * 31) + this.f28533d.f31050a) * 31);
    }
}
