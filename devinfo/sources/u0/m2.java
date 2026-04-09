package u0;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m2 implements h1.c, Iterable, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f34873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34874b;

    /* renamed from: c, reason: collision with root package name */
    public final t1 f34875c;

    public m2(b2 b2Var, int i4, l0 l0Var, t1 t1Var) {
        this.f34873a = b2Var;
        this.f34874b = i4;
        this.f34875c = t1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return m2Var.f34874b == this.f34874b && m2Var.f34873a.equals(this.f34873a) && m2Var.f34875c.equals(this.f34875c);
    }

    public final int hashCode() {
        return this.f34875c.hashCode() + ((this.f34873a.hashCode() + (this.f34874b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l2(this.f34873a, this.f34874b, null, this.f34875c);
    }
}
