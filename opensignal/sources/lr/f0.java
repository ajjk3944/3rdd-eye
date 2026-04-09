package lr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends r implements br.i, ir.g, e {
    public static final /* synthetic */ ir.v[] G;
    public final Object B;
    public final r1 D;
    public final Object E;
    public final Object F;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f15612x;

    /* renamed from: y, reason: collision with root package name */
    public final String f15613y;

    static {
        br.y yVar = br.x.f2918a;
        G = new ir.v[]{yVar.f(new br.q(yVar.b(f0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public f0(d0 d0Var, String str, String str2, rr.u uVar, Object obj) {
        this.f15612x = d0Var;
        this.f15613y = str2;
        this.B = obj;
        this.D = t1.n(uVar, new ah.d(this, 27, str));
        lq.j jVar = lq.j.PUBLICATION;
        this.E = kc.f.E(jVar, new e0(this, 0));
        this.F = kc.f.E(jVar, new e0(this, 1));
    }

    public static final mr.v F(f0 f0Var, Constructor constructor, rr.u uVar, boolean z10) {
        Object obj = f0Var.B;
        Class cls = null;
        if (!z10) {
            ur.j jVar = uVar instanceof ur.j ? (ur.j) uVar : null;
            if (jVar != null) {
                ur.j jVar2 = jVar;
                if (!rr.p.e(jVar2.c())) {
                    rr.f fVarC = jVar.C();
                    br.l.d(fVarC, "constructorDescriptor.constructedClass");
                    if (!ts.h.b(fVarC) && !ts.d.q(jVar.C())) {
                        List listY = jVar2.Y();
                        br.l.d(listY, "constructorDescriptor.valueParameters");
                        if (!listY.isEmpty()) {
                            Iterator it = listY.iterator();
                            while (it.hasNext()) {
                                ht.x type = ((ur.q0) it.next()).getType();
                                br.l.d(type, "it.type");
                                if (xu.l.P(type)) {
                                    if (f0Var.E()) {
                                        return new mr.h(constructor, kc.f.n(obj, f0Var.C()), 0);
                                    }
                                    Class declaringClass = constructor.getDeclaringClass();
                                    br.l.d(declaringClass, "constructor.declaringClass");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    br.l.d(genericParameterTypes, "constructor.genericParameterTypes");
                                    return new mr.i(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : mq.l.h0(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (f0Var.E()) {
            return new mr.h(constructor, kc.f.n(obj, f0Var.C()), 1);
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        br.l.d(declaringClass2, "constructor.declaringClass");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls2 = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        br.l.d(genericParameterTypes2, "constructor.genericParameterTypes");
        return new mr.i(constructor, declaringClass2, cls2, genericParameterTypes2, 1);
    }

    @Override // lr.r
    public final d0 A() {
        return this.f15612x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // lr.r
    public final mr.g B() {
        return (mr.g) this.F.getValue();
    }

    @Override // lr.r
    public final boolean E() {
        return !br.l.a(this.B, br.c.f2901a);
    }

    @Override // lr.r
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final rr.u C() {
        ir.v vVar = G[0];
        Object objC = this.D.c();
        br.l.d(objC, "<get-descriptor>(...)");
        return (rr.u) objC;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        return s(obj);
    }

    @Override // ar.a
    public final Object c() {
        return s(new Object[0]);
    }

    public final boolean equals(Object obj) {
        f0 f0VarB = z1.b(obj);
        return f0VarB != null && br.l.a(this.f15612x, f0VarB.f15612x) && getName().equals(f0VarB.getName()) && br.l.a(this.f15613y, f0VarB.f15613y) && br.l.a(this.B, f0VarB.B);
    }

    @Override // br.i
    public final int f() {
        return ir.f0.A(z());
    }

    @Override // ir.c
    public final String getName() {
        String strB = ((ur.n) C()).getName().b();
        br.l.d(strB, "descriptor.name.asString()");
        return strB;
    }

    @Override // ar.o
    public final Object h(Object obj, Object obj2, Object obj3) {
        return s(obj, obj2, obj3);
    }

    public final int hashCode() {
        return this.f15613y.hashCode() + ((getName().hashCode() + (this.f15612x.hashCode() * 31)) * 31);
    }

    @Override // ar.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return s(obj, obj2, obj3, obj4);
    }

    @Override // ir.c
    public final boolean r() {
        return C().r();
    }

    public final String toString() {
        ss.j jVar = w1.f15712a;
        return w1.b(C());
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return s(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // lr.r
    public final mr.g z() {
        return (mr.g) this.E.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(d0 d0Var, rr.u uVar) {
        br.l.e(uVar, "descriptor");
        String strB = ((ur.n) uVar).getName().b();
        br.l.d(strB, "descriptor.name.asString()");
        this(d0Var, strB, x1.c(uVar).i(), uVar, br.c.f2901a);
    }
}
