package vs;

import ht.i0;
import ht.m0;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class p implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f23963a;

    /* renamed from: b, reason: collision with root package name */
    public final lq.q f23964b;

    public p(Set set) {
        i0.f10910d.getClass();
        i0 i0Var = i0.f10911g;
        br.l.e(i0Var, "attributes");
        ht.e.s(kt.k.a(kt.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), i0Var, this, mq.w.f16945a, false);
        this.f23964b = kc.f.F(new n(0));
        this.f23963a = set;
    }

    @Override // ht.m0
    public final or.h n() {
        throw null;
    }

    @Override // ht.m0
    public final List o() {
        return mq.w.f16945a;
    }

    @Override // ht.m0
    public final rr.i p() {
        return null;
    }

    @Override // ht.m0
    public final Collection q() {
        return (List) this.f23964b.getValue();
    }

    @Override // ht.m0
    public final boolean r() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + mq.o.x0(this.f23963a, ",", null, null, o.f23962d, 30) + ']');
        return sb2.toString();
    }
}
