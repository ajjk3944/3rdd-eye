package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f139a;

    /* renamed from: b, reason: collision with root package name */
    public final w f140b;

    public u0(int i4, w wVar) {
        this.f139a = i4;
        this.f140b = wVar;
    }

    @Override // a0.l
    public final v0 c(y4.a aVar) {
        return new t7.m(this.f139a, this.f140b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return u0Var.f139a == this.f139a && nk.k.a(u0Var.f140b, this.f140b);
    }

    public final int hashCode() {
        return (this.f140b.hashCode() + (this.f139a * 31)) * 31;
    }
}
