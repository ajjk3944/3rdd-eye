package lr;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public abstract class j1 extends r implements ir.v {
    public static final Object G = new Object();
    public final String B;
    public final Object D;
    public final Object E;
    public final r1 F;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f15628x;

    /* renamed from: y, reason: collision with root package name */
    public final String f15629y;

    public j1(d0 d0Var, String str, String str2, rr.m0 m0Var, Object obj) {
        this.f15628x = d0Var;
        this.f15629y = str;
        this.B = str2;
        this.D = obj;
        this.E = kc.f.E(lq.j.PUBLICATION, new i1(this, 1));
        this.F = t1.n(m0Var, new i1(this, 0));
    }

    @Override // lr.r
    public final d0 A() {
        return this.f15628x;
    }

    @Override // lr.r
    public final mr.g B() {
        H().getClass();
        return null;
    }

    @Override // lr.r
    public final boolean E() {
        return !br.l.a(this.D, br.c.f2901a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lq.h] */
    public final Member F() {
        if (!C().O()) {
            return null;
        }
        qs.b bVar = x1.f15714a;
        t1 t1VarB = x1.b(C());
        if (t1VarB instanceof m) {
            m mVar = (m) t1VarB;
            ns.f fVar = mVar.f15639x;
            os.e eVar = mVar.f15638r;
            if ((eVar.f19753d & 16) == 16) {
                os.c cVar = eVar.B;
                int i10 = cVar.f19742d;
                if ((i10 & 1) != 1 || (i10 & 2) != 2) {
                    return null;
                }
                return this.f15628x.f(fVar.getString(cVar.f19743g), fVar.getString(cVar.f19744r));
            }
        }
        return (Field) this.E.getValue();
    }

    @Override // lr.r
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final rr.m0 C() {
        Object objC = this.F.c();
        br.l.d(objC, "_descriptor()");
        return (rr.m0) objC;
    }

    public abstract f1 H();

    public final boolean equals(Object obj) {
        j1 j1VarC = z1.c(obj);
        return j1VarC != null && br.l.a(this.f15628x, j1VarC.f15628x) && br.l.a(this.f15629y, j1VarC.f15629y) && br.l.a(this.B, j1VarC.B) && br.l.a(this.D, j1VarC.D);
    }

    @Override // ir.c
    public final String getName() {
        return this.f15629y;
    }

    public final int hashCode() {
        return this.B.hashCode() + c7.a.g(this.f15629y, this.f15628x.hashCode() * 31, 31);
    }

    @Override // ir.c
    public final boolean r() {
        return false;
    }

    public final String toString() {
        ss.j jVar = w1.f15712a;
        return w1.c(C());
    }

    @Override // lr.r
    public final mr.g z() {
        return H().z();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j1(d0 d0Var, String str, String str2, Object obj) {
        this(d0Var, str, str2, null, obj);
        br.l.e(str, "name");
        br.l.e(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j1(d0 d0Var, rr.m0 m0Var) {
        br.l.e(m0Var, "descriptor");
        String strB = m0Var.getName().b();
        br.l.d(strB, "descriptor.name.asString()");
        this(d0Var, strB, x1.b(m0Var).i(), m0Var, br.c.f2901a);
    }
}
