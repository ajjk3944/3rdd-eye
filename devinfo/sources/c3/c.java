package c3;

import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f2705a;

    public c(long j) {
        this.f2705a = j;
        if (j != 16) {
            return;
        }
        x2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // c3.o
    public final float a() {
        return p1.s.d(this.f2705a);
    }

    @Override // c3.o
    public final long b() {
        return this.f2705a;
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
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p1.s.c(this.f2705a, ((c) obj).f2705a);
    }

    public final int hashCode() {
        int i4 = p1.s.f31019i;
        return yj.q.a(this.f2705a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) p1.s.i(this.f2705a)) + ')';
    }
}
