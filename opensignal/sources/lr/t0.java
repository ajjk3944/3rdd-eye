package lr;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class t0 implements ir.m {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f15688y;

    /* renamed from: a, reason: collision with root package name */
    public final r f15689a;

    /* renamed from: d, reason: collision with root package name */
    public final int f15690d;

    /* renamed from: g, reason: collision with root package name */
    public final ir.l f15691g;

    /* renamed from: r, reason: collision with root package name */
    public final r1 f15692r;

    /* renamed from: x, reason: collision with root package name */
    public final r1 f15693x;

    static {
        br.y yVar = br.x.f2918a;
        f15688y = new ir.v[]{yVar.f(new br.q(yVar.b(t0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), yVar.f(new br.q(yVar.b(t0.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public t0(r rVar, int i10, ir.l lVar, ar.a aVar) {
        br.l.e(lVar, "kind");
        this.f15689a = rVar;
        this.f15690d = i10;
        this.f15691g = lVar;
        this.f15692r = t1.n(null, aVar);
        this.f15693x = t1.n(null, new s0(this, 0));
    }

    public final rr.k0 a() {
        ir.v vVar = f15688y[0];
        Object objC = this.f15692r.c();
        br.l.d(objC, "<get-descriptor>(...)");
        return (rr.k0) objC;
    }

    public final m1 c() {
        ht.x type = a().getType();
        br.l.d(type, "descriptor.type");
        return new m1(type, new s0(this, 1));
    }

    @Override // ir.b
    public final List e() {
        ir.v vVar = f15688y[1];
        Object objC = this.f15693x.c();
        br.l.d(objC, "<get-annotations>(...)");
        return (List) objC;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return br.l.a(this.f15689a, t0Var.f15689a) && this.f15690d == t0Var.f15690d;
    }

    public final boolean f() {
        rr.k0 k0VarA = a();
        ur.q0 q0Var = k0VarA instanceof ur.q0 ? (ur.q0) k0VarA : null;
        if (q0Var != null) {
            return xs.d.a(q0Var);
        }
        return false;
    }

    public final boolean g() {
        rr.k0 k0VarA = a();
        return (k0VarA instanceof ur.q0) && ((ur.q0) k0VarA).G != null;
    }

    public final String getName() {
        rr.k0 k0VarA = a();
        ur.q0 q0Var = k0VarA instanceof ur.q0 ? (ur.q0) k0VarA : null;
        if (q0Var != null && !q0Var.o().G()) {
            qs.g name = q0Var.getName();
            br.l.d(name, "valueParameter.name");
            if (!name.f21036d) {
                return name.b();
            }
        }
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15690d) + (this.f15689a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        String strB;
        ss.j jVar = w1.f15712a;
        StringBuilder sb2 = new StringBuilder();
        int i10 = v1.f15701a[this.f15691g.ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + this.f15690d + ' ' + getName());
        }
        sb2.append(" of ");
        rr.d dVarC = this.f15689a.C();
        if (dVarC instanceof rr.m0) {
            strB = w1.c((rr.m0) dVarC);
        } else {
            if (!(dVarC instanceof rr.u)) {
                throw new IllegalStateException(("Illegal callable: " + dVarC).toString());
            }
            strB = w1.b((rr.u) dVarC);
        }
        sb2.append(strB);
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
