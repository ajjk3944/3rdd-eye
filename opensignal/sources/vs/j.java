package vs;

import lq.b0;

/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: b, reason: collision with root package name */
    public final String f23960b;

    public j(String str) {
        super(b0.f15562a);
        this.f23960b = str;
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        br.l.e(a0Var, "module");
        return kt.k.c(kt.j.ERROR_CONSTANT_VALUE, this.f23960b);
    }

    @Override // vs.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // vs.g
    public final String toString() {
        return this.f23960b;
    }
}
