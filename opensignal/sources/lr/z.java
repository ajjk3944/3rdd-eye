package lr;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends d0 implements ir.d, p1 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f15718r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Class f15719d;

    /* renamed from: g, reason: collision with root package name */
    public final s1 f15720g;

    public z(Class cls) {
        br.l.e(cls, "jClass");
        this.f15719d = cls;
        this.f15720g = new s1(new t(this, 8));
    }

    public final qs.b E() {
        or.k primitiveType;
        qs.b bVar = x1.f15714a;
        Class cls = this.f15719d;
        br.l.e(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            br.l.d(componentType, "klass.componentType");
            primitiveType = componentType.isPrimitive() ? ys.c.get(componentType.getSimpleName()).getPrimitiveType() : null;
            return primitiveType != null ? new qs.b(or.o.j, primitiveType.getArrayTypeName()) : qs.b.j(or.n.f19695g.g());
        }
        if (cls.equals(Void.TYPE)) {
            return x1.f15714a;
        }
        primitiveType = cls.isPrimitive() ? ys.c.get(cls.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new qs.b(or.o.j, primitiveType.getTypeName());
        }
        qs.b bVarA = xr.d.a(cls);
        if (!bVarA.f21023c) {
            String str = qr.d.f20965a;
            qs.b bVar2 = (qs.b) qr.d.f20972h.get(bVarA.b().i());
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    public final rr.f F() {
        return ((w) this.f15720g.c()).a();
    }

    @Override // br.e
    public final Class a() {
        return this.f15719d;
    }

    @Override // ir.b
    public final List e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && ir.f0.E(this).equals(ir.f0.E((ir.d) obj));
    }

    @Override // lr.d0
    public final Collection g() {
        rr.f fVarF = F();
        if (fVarF.f() == rr.g.INTERFACE || fVarF.f() == rr.g.OBJECT) {
            return mq.w.f16945a;
        }
        Collection collectionZ = fVarF.z();
        br.l.d(collectionZ, "descriptor.constructors");
        return collectionZ;
    }

    @Override // lr.d0
    public final Collection h(qs.g gVar) {
        at.n nVarW = F().q().W();
        zr.d dVar = zr.d.FROM_REFLECTION;
        Collection collectionF = nVarW.f(gVar, dVar);
        at.n nVarS = F().S();
        br.l.d(nVarS, "descriptor.staticScope");
        return mq.o.E0(collectionF, nVarS.f(gVar, dVar));
    }

    @Override // ir.d
    public final int hashCode() {
        return ir.f0.E(this).hashCode();
    }

    @Override // lr.d0
    public final rr.m0 j(int i10) {
        Class<?> declaringClass;
        Class cls = this.f15719d;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((z) ir.f0.H(declaringClass)).j(i10);
        }
        rr.f fVarF = F();
        ft.i iVar = fVarF instanceof ft.i ? (ft.i) fVarF : null;
        if (iVar != null) {
            ls.j jVar = iVar.f9086x;
            rs.o oVar = os.k.j;
            br.l.d(oVar, "classLocalVariable");
            ls.g0 g0Var = (ls.g0) a.a.p(jVar, oVar, i10);
            if (g0Var != null) {
                al.b bVar = iVar.H;
                return (rr.m0) z1.f(this.f15719d, g0Var, (ns.f) bVar.f811c, (h7.h0) bVar.f813e, iVar.f9087y, y.E);
            }
        }
        return null;
    }

    @Override // ir.d
    public final boolean k() {
        return F().k();
    }

    @Override // ir.d
    public final boolean m() {
        return F().m();
    }

    @Override // ir.d
    public final String n() {
        r1 r1Var = ((w) this.f15720g.c()).f15705e;
        ir.v vVar = w.f15702n[3];
        return (String) r1Var.c();
    }

    @Override // ir.d
    public final String p() {
        r1 r1Var = ((w) this.f15720g.c()).f15704d;
        ir.v vVar = w.f15702n[2];
        return (String) r1Var.c();
    }

    @Override // ir.d
    public final Object q() {
        s1 s1Var = ((w) this.f15720g.c()).f15707g;
        ir.v vVar = w.f15702n[6];
        return s1Var.c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("class ");
        qs.b bVarE = E();
        qs.c cVarG = bVarE.g();
        br.l.d(cVarG, "classId.packageFqName");
        String strConcat = cVarG.d() ? "" : cVarG.b().concat(".");
        sb2.append(strConcat + tt.s.k0(bVarE.h().b(), '.', '$'));
        return sb2.toString();
    }

    @Override // ir.d
    public final boolean v() {
        return F().j() == rr.z.SEALED;
    }

    @Override // ir.d
    public final boolean x(Object obj) {
        List list = xr.d.f25493a;
        Class cls = this.f15719d;
        br.l.e(cls, "<this>");
        Integer num = (Integer) xr.d.f25496d.get(cls);
        if (num != null) {
            return br.b0.d(num.intValue(), obj);
        }
        Class cls2 = (Class) xr.d.f25495c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // ir.d
    public final boolean y() {
        return F().j() == rr.z.ABSTRACT;
    }

    @Override // lr.d0
    public final Collection z(qs.g gVar) {
        at.n nVarW = F().q().W();
        zr.d dVar = zr.d.FROM_REFLECTION;
        Collection collectionB = nVarW.b(gVar, dVar);
        at.n nVarS = F().S();
        br.l.d(nVarS, "descriptor.staticScope");
        return mq.o.E0(collectionB, nVarS.b(gVar, dVar));
    }
}
