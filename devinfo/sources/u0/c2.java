package u0;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c2 implements h1.c, Iterable, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f34757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34759c;

    public c2(b2 b2Var, int i4, int i10) {
        this.f34757a = b2Var;
        this.f34758b = i4;
        this.f34759c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return c2Var.f34758b == this.f34758b && c2Var.f34759c == this.f34759c && nk.k.a(c2Var.f34757a, this.f34757a);
    }

    public final int hashCode() {
        return (this.f34757a.hashCode() * 31) + this.f34758b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b2 b2Var = this.f34757a;
        if (b2Var.f34749h != this.f34759c) {
            d2.f();
        }
        int i4 = this.f34758b;
        b2Var.i(i4);
        return new k0(b2Var, i4 + 1, b2Var.f34743a[(i4 * 5) + 3] + i4);
    }
}
