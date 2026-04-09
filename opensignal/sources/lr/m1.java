package lr;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes.dex */
public final class m1 implements br.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f15643x;

    /* renamed from: a, reason: collision with root package name */
    public final ht.x f15644a;

    /* renamed from: d, reason: collision with root package name */
    public final r1 f15645d;

    /* renamed from: g, reason: collision with root package name */
    public final r1 f15646g;

    /* renamed from: r, reason: collision with root package name */
    public final r1 f15647r;

    static {
        br.y yVar = br.x.f2918a;
        f15643x = new ir.v[]{yVar.f(new br.q(yVar.b(m1.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), yVar.f(new br.q(yVar.b(m1.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public m1(ht.x xVar, ar.a aVar) {
        br.l.e(xVar, "type");
        this.f15644a = xVar;
        r1 r1Var = aVar instanceof r1 ? (r1) aVar : null;
        this.f15645d = r1Var == null ? aVar != null ? t1.n(null, aVar) : null : r1Var;
        this.f15646g = t1.n(null, new l1(this, 1));
        this.f15647r = t1.n(null, new ah.d(this, 28, aVar));
    }

    public final ir.e a(ht.x xVar) {
        ht.x xVarB;
        rr.i iVarP = xVar.Z().p();
        if (iVarP instanceof rr.f) {
            Class clsJ = z1.j((rr.f) iVarP);
            if (clsJ != null) {
                if (!clsJ.isArray()) {
                    if (ht.a1.e(xVar)) {
                        return new z(clsJ);
                    }
                    Class cls = (Class) xr.d.f25494b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new z(clsJ);
                }
                ht.p0 p0Var = (ht.p0) mq.o.K0(xVar.L());
                if (p0Var == null || (xVarB = p0Var.b()) == null) {
                    return new z(clsJ);
                }
                ir.e eVarA = a(xVarB);
                if (eVarA != null) {
                    return new z(Array.newInstance((Class<?>) ir.f0.D(xu.d.B(eVarA)), 0).getClass());
                }
                throw new lq.k("Cannot determine classifier for array element type: " + this, 1);
            }
        } else {
            if (iVarP instanceof rr.r0) {
                return new o1(null, (rr.r0) iVarP);
            }
            if (iVarP instanceof ft.u) {
                throw new lq.k("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final List c() {
        ir.v vVar = f15643x[1];
        Object objC = this.f15647r.c();
        br.l.d(objC, "<get-arguments>(...)");
        return (List) objC;
    }

    @Override // ir.b
    public final List e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return br.l.a(this.f15644a, m1Var.f15644a) && br.l.a(f(), m1Var.f()) && c().equals(m1Var.c());
    }

    public final ir.e f() {
        ir.v vVar = f15643x[0];
        return (ir.e) this.f15646g.c();
    }

    public final int hashCode() {
        int iHashCode = this.f15644a.hashCode() * 31;
        ir.e eVarF = f();
        return c().hashCode() + ((iHashCode + (eVarF != null ? eVarF.hashCode() : 0)) * 31);
    }

    public final String toString() {
        ss.j jVar = w1.f15712a;
        return w1.d(this.f15644a);
    }
}
