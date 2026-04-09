package lr;

/* loaded from: classes.dex */
public final class j0 extends z0 implements ir.j {
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        br.l.e(str, "name");
        br.l.e(str2, "signature");
        this.I = kc.f.E(lq.j.PUBLICATION, new ht.g(21, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.k
    public final ir.h d() {
        return (i0) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.j
    public final void u(Object obj, Object obj2) {
        ((i0) this.I.getValue()).s(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.j, ir.k
    public final ir.i d() {
        return (i0) this.I.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(d0 d0Var, rr.m0 m0Var) {
        super(d0Var, m0Var);
        br.l.e(m0Var, "descriptor");
        this.I = kc.f.E(lq.j.PUBLICATION, new ht.g(21, this));
    }
}
