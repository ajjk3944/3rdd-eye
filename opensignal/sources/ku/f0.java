package ku;

import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements iu.e {

    /* renamed from: a, reason: collision with root package name */
    public final iu.e f14547a;

    /* renamed from: b, reason: collision with root package name */
    public final iu.e f14548b;

    public f0(iu.e eVar, iu.e eVar2) {
        br.l.e(eVar, "keyDesc");
        br.l.e(eVar2, "valueDesc");
        this.f14547a = eVar;
        this.f14548b = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return br.l.a(this.f14547a, f0Var.f14547a) && br.l.a(this.f14548b, f0Var.f14548b);
    }

    @Override // iu.e
    public final i3.g f() {
        return iu.j.f13013f;
    }

    @Override // iu.e
    public final boolean g() {
        return false;
    }

    @Override // iu.e
    public final List getAnnotations() {
        return mq.w.f16945a;
    }

    @Override // iu.e
    public final String h() {
        return "kotlin.collections.LinkedHashMap";
    }

    public final int hashCode() {
        return this.f14548b.hashCode() + ((this.f14547a.hashCode() + 710441009) * 31);
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
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // iu.e
    public final int k() {
        return 2;
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
        throw new IllegalArgumentException(h0.b.m("Illegal index ", i10, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // iu.e
    public final iu.e n(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Illegal index ", i10, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f14547a;
        }
        if (i11 == 1) {
            return this.f14548b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // iu.e
    public final boolean o(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(h0.b.m("Illegal index ", i10, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f14547a + ", " + this.f14548b + ')';
    }
}
