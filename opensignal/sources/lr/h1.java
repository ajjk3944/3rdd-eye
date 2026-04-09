package lr;

/* loaded from: classes.dex */
public abstract class h1 extends d1 implements ir.h {
    public static final /* synthetic */ ir.v[] B;

    /* renamed from: x, reason: collision with root package name */
    public final r1 f15620x = t1.n(null, new g1(this, 1));

    /* renamed from: y, reason: collision with root package name */
    public final Object f15621y = kc.f.E(lq.j.PUBLICATION, new g1(this, 0));

    static {
        br.y yVar = br.x.f2918a;
        B = new ir.v[]{yVar.f(new br.q(yVar.b(h1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    @Override // lr.r
    public final rr.d C() {
        ir.v vVar = B[0];
        Object objC = this.f15620x.c();
        br.l.d(objC, "<get-descriptor>(...)");
        return (ur.j0) objC;
    }

    @Override // lr.d1
    public final rr.l0 F() {
        ir.v vVar = B[0];
        Object objC = this.f15620x.c();
        br.l.d(objC, "<get-descriptor>(...)");
        return (ur.j0) objC;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h1) && br.l.a(G(), ((h1) obj).G());
    }

    @Override // ir.c
    public final String getName() {
        return h0.b.r(new StringBuilder("<set-"), G().f15629y, '>');
    }

    public final int hashCode() {
        return G().hashCode();
    }

    public final String toString() {
        return "setter of " + G();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // lr.r
    public final mr.g z() {
        return (mr.g) this.f15621y.getValue();
    }
}
