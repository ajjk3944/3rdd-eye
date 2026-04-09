package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 implements c0.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32516a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32517b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32518c;

    public e0(boolean z3, float f10, long j) {
        this.f32516a = z3;
        this.f32517b = f10;
        this.f32518c = j;
    }

    @Override // c0.u0
    public final i2.i a(e0.i iVar) {
        return new q(iVar, this.f32516a, this.f32517b, new km.i(13, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f32516a == e0Var.f32516a && d3.f.b(this.f32517b, e0Var.f32517b)) {
            return p1.s.c(this.f32518c, e0Var.f32518c);
        }
        return false;
    }

    @Override // c0.u0
    public final int hashCode() {
        int iD = r5.c.d(this.f32517b, (this.f32516a ? 1231 : 1237) * 31, 961);
        int i4 = p1.s.f31019i;
        return yj.q.a(this.f32518c) + iD;
    }
}
