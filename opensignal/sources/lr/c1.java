package lr;

/* loaded from: classes.dex */
public class c1 extends j1 implements ir.u {
    public final Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d0 d0Var, String str, String str2) {
        super(d0Var, str, str2, br.c.f2901a);
        br.l.e(str, "name");
        br.l.e(str2, "signature");
        lq.j jVar = lq.j.PUBLICATION;
        this.H = kc.f.E(jVar, new b1(this, 0));
        kc.f.E(jVar, new b1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // lr.j1
    public final f1 H() {
        return (a1) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.v
    public final ir.o b() {
        return (a1) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((a1) this.H.getValue()).s(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // ir.v
    public final ir.t b() {
        return (a1) this.H.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d0 d0Var, rr.m0 m0Var) {
        super(d0Var, m0Var);
        br.l.e(m0Var, "descriptor");
        lq.j jVar = lq.j.PUBLICATION;
        this.H = kc.f.E(jVar, new b1(this, 0));
        kc.f.E(jVar, new b1(this, 1));
    }
}
