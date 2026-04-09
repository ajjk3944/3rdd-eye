package r2;

import g1.f0;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final g1.o f21193a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21194b;

    public b(g1.o oVar, float f10) {
        this.f21193a = oVar;
        this.f21194b = f10;
    }

    @Override // r2.o
    public final float a() {
        return this.f21194b;
    }

    @Override // r2.o
    public final long b() {
        int i10 = g1.r.f9270h;
        return g1.r.f9269g;
    }

    @Override // r2.o
    public final f0 c() {
        return this.f21193a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return br.l.a(this.f21193a, bVar.f21193a) && Float.compare(this.f21194b, bVar.f21194b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21194b) + (this.f21193a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f21193a);
        sb2.append(", alpha=");
        return h0.b.q(sb2, this.f21194b, ')');
    }
}
