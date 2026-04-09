package qr;

import br.x;
import br.y;
import com.google.android.gms.internal.measurement.e5;
import ht.b0;
import ht.s0;
import ht.x0;
import ir.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mq.w;
import rr.z;
import ur.a0;
import ur.k0;
import ur.q0;
import ur.u;

/* loaded from: classes.dex */
public final class r implements tr.b, tr.d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f21002g;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f21003a;

    /* renamed from: b, reason: collision with root package name */
    public final gt.i f21004b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f21005c;

    /* renamed from: d, reason: collision with root package name */
    public final gt.i f21006d;

    /* renamed from: e, reason: collision with root package name */
    public final gt.e f21007e;

    /* renamed from: f, reason: collision with root package name */
    public final gt.i f21008f;

    static {
        y yVar = x.f2918a;
        f21002g = new v[]{yVar.f(new br.q(yVar.b(r.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), yVar.f(new br.q(yVar.b(r.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), yVar.f(new br.q(yVar.b(r.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public r(a0 a0Var, gt.l lVar, pp.c cVar) {
        this.f21003a = a0Var;
        this.f21004b = new gt.i(lVar, cVar);
        ur.l lVar2 = new ur.l(new o(a0Var, new qs.c("java.io"), 0), qs.g.e("Serializable"), z.ABSTRACT, rr.g.INTERFACE, e5.H(new ht.z(lVar, new p(this, 0))), lVar);
        lVar2.L(at.m.f2303b, mq.y.f16947a, null);
        this.f21005c = lVar2.q();
        this.f21006d = new gt.i(lVar, new g(this, 2, lVar));
        this.f21007e = new gt.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new gt.f(), 0);
        this.f21008f = new gt.i(lVar, new p(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3 A[EDGE_INSN: B:127:0x01c3->B:59:0x01c3 BREAK  A[LOOP:4: B:72:0x01f0->B:77:0x0210]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0248  */
    @Override // tr.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection a(qs.g r17, rr.f r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.r.a(qs.g, rr.f):java.util.Collection");
    }

    @Override // tr.d
    public final boolean b(rr.f fVar, ft.t tVar) {
        br.l.e(fVar, "classDescriptor");
        es.j jVarF = f(fVar);
        if (jVarF == null || !tVar.getAnnotations().G(tr.e.f22958a)) {
            return true;
        }
        g().getClass();
        String strF = i3.g.f(tVar, 3);
        es.p pVarL = jVarF.L();
        qs.g name = tVar.getName();
        br.l.d(name, "functionDescriptor.name");
        Collection collectionF = pVarL.f(name, zr.d.FROM_BUILTINS);
        if ((collectionF instanceof Collection) && collectionF.isEmpty()) {
            return false;
        }
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            if (i3.g.f((k0) it.next(), 3).equals(strF)) {
                return true;
            }
        }
        return false;
    }

    @Override // tr.b
    public final Collection c(rr.f fVar) {
        rr.f fVarB;
        if (fVar.f() == rr.g.CLASS) {
            g().getClass();
            es.j jVarF = f(fVar);
            if (jVarF != null && (fVarB = e.b(xs.d.g(jVarF), b.f20961f)) != null) {
                x0 x0Var = new x0(a.a.g(fVarB, jVarF));
                List list = (List) jVarF.M.f8324q.c();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ur.j jVar = (ur.j) next;
                    ur.j jVar2 = jVar;
                    if (jVar2.c().f2239a.f17071d) {
                        Collection collectionZ = fVarB.z();
                        br.l.d(collectionZ, "defaultKotlinVersion.constructors");
                        Collection<ur.j> collection = collectionZ;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            for (ur.j jVar3 : collection) {
                                br.l.d(jVar3, "it");
                                if (ts.n.j(jVar3, jVar.e(x0Var)) == ts.l.OVERRIDABLE) {
                                    break;
                                }
                            }
                        }
                        if (jVar2.Y().size() == 1) {
                            List listY = jVar2.Y();
                            br.l.d(listY, "valueParameters");
                            rr.i iVarP = ((q0) mq.o.I0(listY)).getType().Z().p();
                            if (br.l.a(iVarP != null ? xs.d.h(iVarP) : null, xs.d.h(fVar))) {
                            }
                        }
                        if (!or.h.C(jVar) && !t.f21017e.contains(dr.a.I(jVarF, i3.g.f(jVar, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ur.j jVar4 = (ur.j) it2.next();
                    ur.j jVar5 = jVar4;
                    jVar5.getClass();
                    ur.t tVarB1 = jVar5.B1(x0.f10954b);
                    tVarB1.f23667d = fVar;
                    tVarB1.p(fVar.q());
                    tVarB1.K = true;
                    s0 s0VarF = x0Var.f();
                    if (s0VarF == null) {
                        ur.t.a(37);
                        throw null;
                    }
                    tVarB1.f23666a = s0VarF;
                    if (!t.f21018f.contains(dr.a.I(jVarF, i3.g.f(jVar4, 3)))) {
                        tVarB1.d((sr.h) io.sentry.config.a.Z(this.f21008f, f21002g[2]));
                    }
                    u uVarY1 = tVarB1.T.y1(tVarB1);
                    br.l.c(uVarY1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((ur.j) uVarY1);
                }
                return arrayList2;
            }
        }
        return w.f16945a;
    }

    @Override // tr.b
    public final Collection d(rr.f fVar) {
        qs.e eVarH = xs.d.h(fVar);
        LinkedHashSet linkedHashSet = t.f21013a;
        qs.e eVar = or.n.f19695g;
        boolean zEquals = eVarH.equals(eVar);
        boolean zIsAssignableFrom = false;
        b0 b0Var = this.f21005c;
        if (!zEquals) {
            HashMap map = or.n.f19691c0;
            if (map.get(eVarH) == null) {
                if (eVarH.equals(eVar) || map.get(eVarH) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = d.f20965a;
                    qs.b bVarF = d.f(eVarH);
                    if (bVarF != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.b().b()));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? e5.H(b0Var) : w.f16945a;
            }
        }
        b0 b0Var2 = (b0) io.sentry.config.a.Z(this.f21006d, f21002g[1]);
        br.l.d(b0Var2, "cloneableType");
        return e5.I(b0Var2, b0Var);
    }

    @Override // tr.b
    public final Collection e(rr.f fVar) {
        Set setD;
        br.l.e(fVar, "classDescriptor");
        g().getClass();
        es.j jVarF = f(fVar);
        if (jVarF == null || (setD = jVarF.L().d()) == null) {
            setD = mq.y.f16947a;
        }
        return setD;
    }

    public final es.j f(rr.f fVar) {
        if (fVar == null) {
            or.h.a(108);
            throw null;
        }
        qs.g gVar = or.h.f19672e;
        if (!or.h.b(fVar, or.n.f19686a) && or.h.I(fVar)) {
            qs.e eVarH = xs.d.h(fVar);
            if (eVarH.d()) {
                String str = d.f20965a;
                qs.b bVarF = d.f(eVarH);
                if (bVarF != null) {
                    rr.f fVarJ = rr.w.j(g().f20991a, bVarF.b(), zr.d.FROM_BUILTINS);
                    if (fVarJ instanceof es.j) {
                        return (es.j) fVarJ;
                    }
                }
            }
        }
        return null;
    }

    public final j g() {
        return (j) io.sentry.config.a.Z(this.f21004b, f21002g[0]);
    }
}
