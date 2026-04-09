package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24360a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f24361b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum f24362c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum f24363d;

    public /* synthetic */ j(i0 i0Var, Enum r22, Enum r32, int i4) {
        this.f24360a = i4;
        this.f24361b = i0Var;
        this.f24362c = r22;
        this.f24363d = r32;
    }

    @Override // g2.i0
    public final int J(int i4) {
        switch (this.f24360a) {
        }
        return this.f24361b.J(i4);
    }

    @Override // g2.i0
    public final int d(int i4) {
        switch (this.f24360a) {
        }
        return this.f24361b.d(i4);
    }

    @Override // g2.i0
    public final int n(int i4) {
        switch (this.f24360a) {
        }
        return this.f24361b.n(i4);
    }

    @Override // g2.i0
    public final int t(int i4) {
        switch (this.f24360a) {
        }
        return this.f24361b.t(i4);
    }

    @Override // g2.i0
    public final s0 v(long j) {
        switch (this.f24360a) {
            case 0:
                r rVar = (r) this.f24362c;
                s sVar = (s) this.f24363d;
                s sVar2 = s.f24405a;
                r rVar2 = r.f24402b;
                i0 i0Var = this.f24361b;
                if (sVar == sVar2) {
                    return new k(rVar == rVar2 ? i0Var.t(d3.a.g(j)) : i0Var.n(d3.a.g(j)), d3.a.c(j) ? d3.a.g(j) : 32767, 0);
                }
                return new k(d3.a.d(j) ? d3.a.h(j) : 32767, rVar == rVar2 ? i0Var.d(d3.a.h(j)) : i0Var.J(d3.a.h(j)), 0);
            default:
                i2.f1 f1Var = (i2.f1) this.f24362c;
                i2.g1 g1Var = (i2.g1) this.f24363d;
                i2.g1 g1Var2 = i2.g1.f25670a;
                i2.f1 f1Var2 = i2.f1.f25666b;
                i0 i0Var2 = this.f24361b;
                if (g1Var == g1Var2) {
                    return new k(f1Var == f1Var2 ? i0Var2.t(d3.a.g(j)) : i0Var2.n(d3.a.g(j)), d3.a.c(j) ? d3.a.g(j) : 32767, 1);
                }
                return new k(d3.a.d(j) ? d3.a.h(j) : 32767, f1Var == f1Var2 ? i0Var2.d(d3.a.h(j)) : i0Var2.J(d3.a.h(j)), 1);
        }
    }

    @Override // g2.i0
    public final Object w() {
        switch (this.f24360a) {
        }
        return this.f24361b.w();
    }
}
