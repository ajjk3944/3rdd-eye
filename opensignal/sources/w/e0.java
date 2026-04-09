package w;

/* loaded from: classes.dex */
public final class e0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f24122a;

    /* renamed from: d, reason: collision with root package name */
    public final int f24123d;

    /* renamed from: g, reason: collision with root package name */
    public final o f24124g;

    public e0(int i10, int i11, o oVar) {
        oVar = (i11 & 4) != 0 ? p.f24140a : oVar;
        this.f24122a = i10;
        this.f24123d = 0;
        this.f24124g = oVar;
    }

    @Override // w.f
    public final g0 a(om.f fVar) {
        return new com.squareup.picasso.s(this.f24122a, this.f24123d, this.f24124g);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return e0Var.f24122a == this.f24122a && e0Var.f24123d == this.f24123d && br.l.a(e0Var.f24124g, this.f24124g);
    }

    public final int hashCode() {
        return ((this.f24124g.hashCode() + (this.f24122a * 31)) * 31) + this.f24123d;
    }
}
