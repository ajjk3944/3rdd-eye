package lr;

/* loaded from: classes.dex */
public class z0 extends j1 implements ir.s {
    public final Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(d0 d0Var, String str, String str2, Object obj) {
        super(d0Var, str, str2, obj);
        br.l.e(str, "name");
        br.l.e(str2, "signature");
        lq.j jVar = lq.j.PUBLICATION;
        this.H = kc.f.E(jVar, new y0(this, 0));
        kc.f.E(jVar, new y0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // lr.j1
    public final f1 H() {
        return (x0) this.H.getValue();
    }

    @Override // ar.k
    public final Object a(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.v
    public final ir.o b() {
        return (x0) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.s
    public final Object get(Object obj) {
        return ((x0) this.H.getValue()).s(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.v
    public final ir.r b() {
        return (x0) this.H.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(d0 d0Var, rr.m0 m0Var) {
        super(d0Var, m0Var);
        br.l.e(m0Var, "descriptor");
        lq.j jVar = lq.j.PUBLICATION;
        this.H = kc.f.E(jVar, new y0(this, 0));
        kc.f.E(jVar, new y0(this, 1));
    }
}
