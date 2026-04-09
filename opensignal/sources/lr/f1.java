package lr;

/* loaded from: classes.dex */
public abstract class f1 extends d1 implements ir.o {
    public static final /* synthetic */ ir.v[] B;

    /* renamed from: x, reason: collision with root package name */
    public final r1 f15614x = t1.n(null, new e1(this, 1));

    /* renamed from: y, reason: collision with root package name */
    public final Object f15615y = kc.f.E(lq.j.PUBLICATION, new e1(this, 0));

    static {
        br.y yVar = br.x.f2918a;
        B = new ir.v[]{yVar.f(new br.q(yVar.b(f1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    @Override // lr.r
    public final rr.d C() {
        ir.v vVar = B[0];
        Object objC = this.f15614x.c();
        br.l.d(objC, "<get-descriptor>(...)");
        return (ur.i0) objC;
    }

    @Override // lr.d1
    public final rr.l0 F() {
        ir.v vVar = B[0];
        Object objC = this.f15614x.c();
        br.l.d(objC, "<get-descriptor>(...)");
        return (ur.i0) objC;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f1) && br.l.a(G(), ((f1) obj).G());
    }

    @Override // ir.c
    public final String getName() {
        return h0.b.r(new StringBuilder("<get-"), G().f15629y, '>');
    }

    public final int hashCode() {
        return G().hashCode();
    }

    public final String toString() {
        return "getter of " + G();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // lr.r
    public final mr.g z() {
        return (mr.g) this.f15615y.getValue();
    }
}
