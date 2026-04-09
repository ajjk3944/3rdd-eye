package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class y extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0.i f2526a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f2527b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2528c;

    /* renamed from: d, reason: collision with root package name */
    public final mk.a f2529d;

    public y(e0.i iVar, u0 u0Var, boolean z3, mk.a aVar) {
        this.f2526a = iVar;
        this.f2527b = u0Var;
        this.f2528c = z3;
        this.f2529d = aVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        return new a0(this.f2526a, this.f2527b, this.f2528c, null, this.f2529d);
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        ((a0) mVar).y0(this.f2526a, this.f2527b, this.f2528c, null, this.f2529d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return nk.k.a(this.f2526a, yVar.f2526a) && nk.k.a(this.f2527b, yVar.f2527b) && this.f2528c == yVar.f2528c && this.f2529d == yVar.f2529d;
    }

    public final int hashCode() {
        e0.i iVar = this.f2526a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        u0 u0Var = this.f2527b;
        return this.f2529d.hashCode() + ((((((iHashCode + (u0Var != null ? u0Var.hashCode() : 0)) * 31) + 1237) * 31) + (this.f2528c ? 1231 : 1237)) * 29791);
    }
}
