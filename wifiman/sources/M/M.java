package M;

import l0.AbstractC6532h;
import l0.C6531g;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class M {
    public static final float a(L0.M m10, int i10, boolean z10, boolean z11) {
        return m10.j(i10, m10.c(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == m10.y(i10));
    }

    public static final long b(L0.M m10, int i10, boolean z10, boolean z11) {
        int iQ = m10.q(i10);
        return iQ >= m10.n() ? C6531g.f52335b.b() : AbstractC6532h.a(AbstractC7978m.j(a(m10, i10, z10, z11), 0.0f, Y0.r.g(m10.B())), AbstractC7978m.j(m10.m(iQ), 0.0f, Y0.r.f(m10.B())));
    }
}
