package es;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import ht.c1;
import ht.y0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import rr.r0;
import ur.q0;

/* loaded from: classes.dex */
public abstract class c0 extends at.o {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f8270m;

    /* renamed from: b, reason: collision with root package name */
    public final cj.a f8271b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f8272c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.c f8273d;

    /* renamed from: e, reason: collision with root package name */
    public final gt.i f8274e;

    /* renamed from: f, reason: collision with root package name */
    public final gt.e f8275f;

    /* renamed from: g, reason: collision with root package name */
    public final gt.j f8276g;

    /* renamed from: h, reason: collision with root package name */
    public final gt.e f8277h;

    /* renamed from: i, reason: collision with root package name */
    public final gt.i f8278i;
    public final gt.i j;
    public final gt.i k;

    /* renamed from: l, reason: collision with root package name */
    public final gt.e f8279l;

    static {
        br.y yVar = br.x.f2918a;
        f8270m = new ir.v[]{yVar.f(new br.q(yVar.b(c0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), yVar.f(new br.q(yVar.b(c0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), yVar.f(new br.q(yVar.b(c0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public c0(cj.a aVar, p pVar) {
        br.l.e(aVar, "c");
        this.f8271b = aVar;
        this.f8272c = pVar;
        gt.o oVar = ((ds.a) aVar.f3974d).f7446a;
        z zVar = new z(this, 0);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f8273d = new gt.c(lVar, zVar);
        z zVar2 = new z(this, 2);
        gt.l lVar2 = (gt.l) oVar;
        lVar2.getClass();
        this.f8274e = new gt.i(lVar2, zVar2);
        this.f8275f = ((gt.l) oVar).b(new a0(this, 1));
        this.f8276g = ((gt.l) oVar).c(new a0(this, 0));
        this.f8277h = ((gt.l) oVar).b(new a0(this, 2));
        z zVar3 = new z(this, 3);
        gt.l lVar3 = (gt.l) oVar;
        lVar3.getClass();
        this.f8278i = new gt.i(lVar3, zVar3);
        z zVar4 = new z(this, 4);
        gt.l lVar4 = (gt.l) oVar;
        lVar4.getClass();
        this.j = new gt.i(lVar4, zVar4);
        z zVar5 = new z(this, 1);
        gt.l lVar5 = (gt.l) oVar;
        lVar5.getClass();
        this.k = new gt.i(lVar5, zVar5);
        this.f8279l = ((gt.l) oVar).b(new a0(this, 3));
    }

    public static ht.x l(xr.x xVar, cj.a aVar) {
        br.l.e(xVar, "method");
        Class<?> declaringClass = ((Method) xVar.b()).getDeclaringClass();
        br.l.d(declaringClass, "member.declaringClass");
        return ((bm.d) aVar.f3978y).U(xVar.f(), b4.f0(y0.COMMON, declaringClass.isAnnotation(), null, 6));
    }

    public static ab.g u(cj.a aVar, ur.u uVar, List list) {
        lq.l lVar;
        ht.x xVar;
        qs.g gVar;
        qs.g gVarE;
        bm.d dVar = (bm.d) aVar.f3978y;
        ds.a aVar2 = (ds.a) aVar.f3974d;
        rr.a0 a0Var = aVar2.f7458o;
        iu.g gVarV0 = mq.o.V0(list);
        ArrayList arrayList = new ArrayList(mq.p.a0(gVarV0, 10));
        Iterator it = gVarV0.iterator();
        boolean z10 = false;
        while (true) {
            mq.a0 a0Var2 = (mq.a0) it;
            if (!a0Var2.f16922d.hasNext()) {
                return new ab.g(mq.o.Q0(arrayList), z10, 2);
            }
            mq.z zVar = (mq.z) a0Var2.next();
            int i10 = zVar.f16948a;
            xr.d0 d0Var = (xr.d0) zVar.f16949b;
            ds.c cVarH = ic.a.H(aVar, d0Var);
            fs.a aVarF0 = b4.f0(y0.COMMON, false, null, 7);
            boolean z11 = d0Var.f25500d;
            xr.b0 b0Var = d0Var.f25497a;
            if (z11) {
                xr.i iVar = b0Var instanceof xr.i ? (xr.i) b0Var : null;
                if (iVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + d0Var);
                }
                c1 c1VarT = dVar.T(iVar, aVarF0, true);
                lVar = new lq.l(c1VarT, a0Var.n().f(c1VarT));
            } else {
                lVar = new lq.l(dVar.U(b0Var, aVarF0), null);
            }
            ht.x xVar2 = (ht.x) lVar.f15571a;
            ht.x xVar3 = (ht.x) lVar.f15572d;
            if (br.l.a(uVar.getName().b(), "equals") && list.size() == 1 && a0Var.n().o().equals(xVar2)) {
                gVarE = qs.g.e("other");
            } else {
                String str = d0Var.f25499c;
                qs.g gVarD = str != null ? qs.g.d(str) : null;
                if (gVarD == null) {
                    z10 = true;
                }
                if (gVarD == null) {
                    gVarE = qs.g.e("p" + i10);
                } else {
                    xVar = xVar2;
                    gVar = gVarD;
                    arrayList.add(new q0(uVar, null, i10, cVarH, gVar, xVar, false, false, false, xVar3, aVar2.j.a(d0Var)));
                }
            }
            xVar = xVar2;
            gVar = gVarE;
            arrayList.add(new q0(uVar, null, i10, cVarH, gVar, xVar, false, false, false, xVar3, aVar2.j.a(d0Var)));
        }
    }

    @Override // at.o, at.p
    public Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return (Collection) this.f8273d.c();
    }

    @Override // at.o, at.n
    public Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return !g().contains(gVar) ? mq.w.f16945a : (Collection) this.f8279l.a(gVar);
    }

    @Override // at.o, at.n
    public final Set d() {
        return (Set) io.sentry.config.a.Z(this.f8278i, f8270m[0]);
    }

    @Override // at.o, at.n
    public final Set e() {
        return (Set) io.sentry.config.a.Z(this.k, f8270m[2]);
    }

    @Override // at.o, at.n
    public Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return !d().contains(gVar) ? mq.w.f16945a : (Collection) this.f8277h.a(gVar);
    }

    @Override // at.o, at.n
    public final Set g() {
        return (Set) io.sentry.config.a.Z(this.j, f8270m[1]);
    }

    public abstract Set h(at.f fVar, ar.k kVar);

    public abstract Set i(at.f fVar, at.k kVar);

    public void j(ArrayList arrayList, qs.g gVar) {
        br.l.e(gVar, "name");
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, qs.g gVar);

    public abstract void n(ArrayList arrayList, qs.g gVar);

    public abstract Set o(at.f fVar);

    public abstract ur.v p();

    public abstract rr.l q();

    public boolean r(cs.g gVar) {
        return true;
    }

    public abstract y s(xr.x xVar, ArrayList arrayList, ht.x xVar2, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lq.h] */
    public final cs.g t(xr.x xVar) {
        br.l.e(xVar, "method");
        cj.a aVar = this.f8271b;
        cs.g gVarK1 = cs.g.K1(q(), ic.a.H(aVar, xVar), xVar.c(), ((ds.a) aVar.f3974d).j.a(xVar), ((c) this.f8274e.c()).c(xVar.c()) != null && ((ArrayList) xVar.g()).isEmpty());
        br.l.e(aVar, "<this>");
        cj.a aVar2 = new cj.a((ds.a) aVar.f3974d, new bj.c(aVar, gVarK1, xVar, 0), (lq.h) aVar.f3976r);
        ArrayList typeParameters = xVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(mq.p.a0(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            r0 r0VarA = ((ds.e) aVar2.f3975g).a((xr.c0) it.next());
            br.l.b(r0VarA);
            arrayList.add(r0VarA);
        }
        ab.g gVarU = u(aVar2, gVarK1, xVar.g());
        y yVarS = s(xVar, arrayList, l(xVar, aVar2), (List) gVarU.f309g);
        List list = yVarS.f8344d;
        ur.v vVarP = p();
        ArrayList arrayList2 = yVarS.f8343c;
        List list2 = yVarS.f8342b;
        ht.x xVar2 = yVarS.f8341a;
        rr.y yVar = rr.z.Companion;
        boolean zIsAbstract = Modifier.isAbstract(((Method) xVar.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) xVar.b()).getModifiers());
        yVar.getClass();
        gVarK1.J1(null, vVarP, mq.w.f16945a, arrayList2, list2, xVar2, zIsAbstract ? rr.z.ABSTRACT : !zIsFinal ? rr.z.OPEN : rr.z.FINAL, i4.I(xVar.e()), mq.x.f16946a);
        gVarK1.f6665a0 = cs.f.get(false, gVarU.f308d);
        if (list.isEmpty()) {
            return gVarK1;
        }
        ((ds.a) aVar2.f3974d).f7450e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
