package ku;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h0 implements iu.e {

    /* renamed from: a, reason: collision with root package name */
    public final iu.e f14558a;

    public h0(iu.e eVar) {
        this.f14558a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return br.l.a(this.f14558a, h0Var.f14558a) && br.l.a(h(), h0Var.h());
    }

    @Override // iu.e
    public final i3.g f() {
        return iu.j.f13012e;
    }

    @Override // iu.e
    public final boolean g() {
        return false;
    }

    @Override // iu.e
    public final List getAnnotations() {
        return mq.w.f16945a;
    }

    public final int hashCode() {
        return h().hashCode() + (this.f14558a.hashCode() * 31);
    }

    @Override // iu.e
    public final boolean i() {
        return false;
    }

    @Override // iu.e
    public final int j(String str) {
        br.l.e(str, "name");
        Integer numO0 = tt.s.o0(str);
        if (numO0 != null) {
            return numO0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // iu.e
    public final int k() {
        return 1;
    }

    @Override // iu.e
    public final String l(int i10) {
        return String.valueOf(i10);
    }

    @Override // iu.e
    public final List m(int i10) {
        if (i10 >= 0) {
            return mq.w.f16945a;
        }
        StringBuilder sbU = h0.b.u("Illegal index ", i10, ", ");
        sbU.append(h());
        sbU.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbU.toString().toString());
    }

    @Override // iu.e
    public final iu.e n(int i10) {
        if (i10 >= 0) {
            return this.f14558a;
        }
        StringBuilder sbU = h0.b.u("Illegal index ", i10, ", ");
        sbU.append(h());
        sbU.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbU.toString().toString());
    }

    @Override // iu.e
    public final boolean o(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbU = h0.b.u("Illegal index ", i10, ", ");
        sbU.append(h());
        sbU.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbU.toString().toString());
    }

    public final String toString() {
        return h() + '(' + this.f14558a + ')';
    }
}
