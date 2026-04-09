package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 extends r0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14526l;

    public a0(String str, b0 b0Var) {
        super(str, b0Var, 1);
        this.f14526l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, lq.h] */
    @Override // ku.r0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            iu.e eVar = (iu.e) obj;
            if (this.f14606a.equals(eVar.h())) {
                a0 a0Var = (a0) obj;
                if (a0Var.f14526l && Arrays.equals((iu.e[]) this.j.getValue(), (iu.e[]) a0Var.j.getValue())) {
                    int iK = eVar.k();
                    int i10 = this.f14608c;
                    if (i10 == iK) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (br.l.a(n(i11).h(), eVar.n(i11).h()) && br.l.a(n(i11).f(), eVar.n(i11).f())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ku.r0, iu.e
    public final boolean g() {
        return this.f14526l;
    }

    @Override // ku.r0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
