package c3;

import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final p1.p f2703a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2704b;

    public b(p1.p pVar, float f10) {
        this.f2703a = pVar;
        this.f2704b = f10;
    }

    @Override // c3.o
    public final float a() {
        return this.f2704b;
    }

    @Override // c3.o
    public final long b() {
        int i4 = p1.s.f31019i;
        return p1.s.f31018h;
    }

    @Override // c3.o
    public final o c(mk.a aVar) {
        return !equals(n.f2727a) ? this : (o) aVar.invoke();
    }

    @Override // c3.o
    public final /* synthetic */ o d(o oVar) {
        return a0.g.c(this, oVar);
    }

    @Override // c3.o
    public final z e() {
        return this.f2703a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return nk.k.a(this.f2703a, bVar.f2703a) && Float.compare(this.f2704b, bVar.f2704b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2704b) + (this.f2703a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f2703a);
        sb2.append(", alpha=");
        return r5.c.k(sb2, this.f2704b, ')');
    }
}
