package es;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import ht.m0;
import ht.y0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import rr.c1;
import rr.n0;
import rr.p0;
import rr.s0;
import rr.z0;

/* loaded from: classes.dex */
public final class j extends ur.k implements cs.c {
    public final cj.a B;
    public final xr.o D;
    public final rr.f E;
    public final cj.a F;
    public final lq.q G;
    public final rr.g H;
    public final rr.z I;
    public final n.a J;
    public final boolean K;
    public final h L;
    public final p M;
    public final n0 N;
    public final at.i O;
    public final g0 P;
    public final ds.c Q;
    public final gt.i R;

    static {
        mq.l.B0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(cj.a aVar, rr.l lVar, xr.o oVar, rr.f fVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        rr.z zVar;
        br.l.e(aVar, "outerContext");
        br.l.e(lVar, "containingDeclaration");
        br.l.e(oVar, "jClass");
        ds.a aVar2 = (ds.a) aVar.f3974d;
        gt.o oVar2 = aVar2.f7446a;
        Class cls = oVar.f25509a;
        super(oVar2, lVar, qs.g.e(cls.getSimpleName()), aVar2.j.a(oVar));
        this.B = aVar;
        this.D = oVar;
        this.E = fVar;
        cj.a aVarD = i3.g.d(aVar, this, oVar, 4);
        this.F = aVarD;
        ds.a aVar3 = (ds.a) aVarD.f3974d;
        gt.o oVar3 = aVar3.f7446a;
        aVar3.f7452g.getClass();
        this.G = kc.f.F(new g(this, 2));
        this.H = cls.isAnnotation() ? rr.g.ANNOTATION_CLASS : cls.isInterface() ? rr.g.INTERFACE : cls.isEnum() ? rr.g.ENUM_CLASS : rr.g.CLASS;
        if (cls.isAnnotation() || cls.isEnum()) {
            zVar = rr.z.FINAL;
        } else {
            rr.y yVar = rr.z.Companion;
            boolean zG = oVar.g();
            boolean z10 = oVar.g() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            yVar.getClass();
            zVar = zG ? rr.z.SEALED : z10 ? rr.z.ABSTRACT : !zIsFinal ? rr.z.OPEN : rr.z.FINAL;
        }
        this.I = zVar;
        int modifiers = cls.getModifiers();
        this.J = Modifier.isPublic(modifiers) ? c1.f21680r : Modifier.isPrivate(modifiers) ? z0.f21726r : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? vr.c.f23951r : vr.b.f23950r : vr.a.f23949r;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.K = ((declaringClass != null ? new xr.o(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.L = new h(this);
        p pVar = new p(aVarD, this, oVar, fVar != null, null);
        this.M = pVar;
        p0 p0Var = n0.f21691d;
        ((jt.l) aVar3.f7464u).getClass();
        as.d dVar = new as.d(14, this);
        p0Var.getClass();
        br.l.e(oVar3, "storageManager");
        this.N = new n0(this, oVar3, dVar);
        this.O = new at.i(pVar);
        this.P = new g0(aVarD, oVar, this);
        this.Q = ic.a.H(aVarD, oVar);
        g gVar = new g(this, 1);
        gt.l lVar2 = (gt.l) oVar3;
        lVar2.getClass();
        this.R = new gt.i(lVar2, gVar);
    }

    @Override // rr.f
    public final s0 B0() {
        return null;
    }

    @Override // rr.f
    public final boolean D() {
        return false;
    }

    @Override // ur.z
    public final at.n H(jt.f fVar) {
        n0 n0Var = this.N;
        xs.d.j(n0Var.f21693a);
        return (p) ((at.n) io.sentry.config.a.Z(n0Var.f21695c, n0.f21692e[0]));
    }

    @Override // ur.b, rr.f
    public final at.n H0() {
        return (p) super.H0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, mq.w] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // rr.f
    public final Collection I() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        rr.z zVar = this.I;
        rr.z zVar2 = rr.z.SEALED;
        ?? arrayList = mq.w.f16945a;
        if (zVar != zVar2) {
            return arrayList;
        }
        Object obj = null;
        fs.a aVarF0 = b4.f0(y0.COMMON, false, null, 7);
        Class cls = this.D.f25509a;
        br.l.e(cls, "clazz");
        js.e eVar = a.a.f4e;
        if (eVar == null) {
            try {
                eVar = new js.e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 24);
            } catch (NoSuchMethodException unused) {
                eVar = new js.e(obj, obj, obj, obj, 24);
            }
            a.a.f4e = eVar;
        }
        Method method = (Method) eVar.f13799r;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, null);
            br.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new xr.q(cls2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rr.i iVarP = ((bm.d) this.F.f3978y).U((xr.q) it.next(), aVarF0).Z().p();
            rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
            if (fVar != null) {
                arrayList2.add(fVar);
            }
        }
        return mq.o.M0(arrayList2, new i());
    }

    @Override // rr.x
    public final boolean I0() {
        return false;
    }

    public final p L() {
        return (p) super.H0();
    }

    @Override // rr.x
    public final boolean M() {
        return false;
    }

    @Override // rr.f
    public final boolean P0() {
        return false;
    }

    @Override // rr.f
    public final ur.j R() {
        return null;
    }

    @Override // rr.f
    public final at.n S() {
        return this.P;
    }

    @Override // rr.f, rr.o, rr.x
    public final as.p c() {
        as.p pVar = rr.p.f21697a;
        n.a aVar = this.J;
        if (br.l.a(aVar, pVar)) {
            Class<?> declaringClass = this.D.f25509a.getDeclaringClass();
            if ((declaringClass != null ? new xr.o(declaringClass) : null) == null) {
                as.p pVar2 = as.q.f2241a;
                br.l.d(pVar2, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
                return pVar2;
            }
        }
        return i4.I(aVar);
    }

    @Override // rr.f
    public final rr.g f() {
        return this.H;
    }

    @Override // rr.f
    public final boolean g() {
        return false;
    }

    @Override // sr.a
    public final sr.h getAnnotations() {
        return this.Q;
    }

    @Override // rr.f, rr.x
    public final rr.z j() {
        return this.I;
    }

    @Override // rr.f
    public final boolean k() {
        return false;
    }

    @Override // rr.j
    public final boolean m() {
        return this.K;
    }

    @Override // rr.f, rr.j
    public final List s() {
        return (List) this.R.c();
    }

    public final String toString() {
        return "Lazy Java class " + xs.d.h(this);
    }

    @Override // rr.i
    public final m0 v() {
        return this.L;
    }

    @Override // rr.f
    public final boolean w() {
        return false;
    }

    @Override // rr.f
    public final Collection z() {
        return (List) this.M.f8324q.c();
    }

    @Override // ur.b, rr.f
    public final at.n z0() {
        return this.O;
    }
}
