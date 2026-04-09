package lr;

import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p.l2;

/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f15671a = new ConcurrentHashMap();

    public static final wr.e a(Class cls) {
        tr.b bVarJ;
        tr.d dVarJ;
        br.l.e(cls, "<this>");
        ClassLoader classLoaderD = xr.d.d(cls);
        a2 a2Var = new a2(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f15671a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(a2Var);
        if (weakReference != null) {
            wr.e eVar = (wr.e) weakReference.get();
            if (eVar != null) {
                return eVar;
            }
            concurrentHashMap.remove(a2Var, weakReference);
        }
        l2 l2Var = new l2(23, classLoaderD);
        ClassLoader classLoader = lq.b0.class.getClassLoader();
        br.l.d(classLoader, "Unit::class.java.classLoader");
        l2 l2Var2 = new l2(23, classLoader);
        o2.g gVar = new o2.g(26, classLoaderD);
        String str = "runtime module for " + classLoaderD;
        wr.d dVar = wr.d.f24591b;
        wr.d dVar2 = wr.d.f24592c;
        br.l.e(str, "moduleName");
        gt.l lVar = new gt.l("DeserializationComponentsForJava.ModuleData");
        qr.l lVar2 = new qr.l(lVar, qr.i.FROM_DEPENDENCIES);
        ur.a0 a0Var = new ur.a0(qs.g.g("<" + str + '>'), lVar, lVar2, 56);
        gt.n nVar = lVar.f9658a;
        nVar.lock();
        try {
            if (lVar2.f19673a != null) {
                throw new AssertionError("Built-ins module is already set: " + lVar2.f19673a + " (attempting to reset to " + a0Var + ")");
            }
            lVar2.f19673a = a0Var;
            nVar.unlock();
            lVar2.f20994f = new or.l(a0Var, 1);
            js.g gVar2 = new js.g();
            b9.e eVar2 = new b9.e(15, false);
            js.e eVar3 = new js.e(lVar, a0Var);
            js.h hVar = js.h.f13808c;
            bs.i iVar = bs.i.f2941c;
            bs.i iVar2 = bs.i.f2939a;
            z.b bVar = new z.b(lVar);
            rr.p0 p0Var = rr.p0.f21711g;
            or.m mVar = new or.m(a0Var, eVar3);
            as.v vVar = as.v.f2253c;
            as.c cVar = new as.c(vVar);
            ds.b bVar2 = ds.b.f7468a;
            is.c cVar2 = new is.c();
            jt.k.f13857b.getClass();
            jt.l lVar3 = jt.j.f13856b;
            ds.d dVar3 = new ds.d(new ds.a(lVar, gVar, l2Var, gVar2, iVar, dVar, iVar2, bVar, dVar2, eVar2, hVar, p0Var, zr.c.f27520a, a0Var, mVar, cVar, cVar2, as.n.f2235a, bVar2, lVar3, vVar, new js.h()));
            ps.f fVar = ps.f.f20634g;
            br.l.e(fVar, "jvmMetadataVersion");
            i4.b bVar3 = new i4.b(l2Var, gVar2);
            r2 r2Var = new r2(l2Var);
            r2Var.f10471d = lVar.b(new j1.a(1, r2Var));
            r2Var.f10472g = a0Var;
            r2Var.f10473r = eVar3;
            r2Var.f10474x = new io.sentry.internal.debugmeta.c(a0Var, eVar3);
            r2Var.f10475y = ps.f.f20634g;
            r2Var.f10475y = fVar;
            List listH = e5.H(ht.m.f10929a);
            or.h hVar2 = a0Var.f23623x;
            qr.l lVar4 = hVar2 instanceof qr.l ? (qr.l) hVar2 : null;
            js.h hVar3 = js.h.f13807b;
            if (lVar4 == null || (bVarJ = lVar4.J()) == null) {
                bVarJ = tr.a.f22953b;
            }
            tr.b bVar4 = bVarJ;
            if (lVar4 == null || (dVarJ = lVar4.J()) == null) {
                dVarJ = tr.a.f22955d;
            }
            dt.k kVar = new dt.k(lVar, a0Var, bVar3, r2Var, dVar3, dVar, hVar3, mq.w.f16945a, eVar3, bVar4, dVarJ, ps.i.f20642a, lVar3, new z.b(lVar), listH, 262144);
            gVar2.f13806a = kVar;
            eVar2.f2481d = new y9.u(3, dVar3);
            qr.r rVarJ = lVar2.J();
            qr.r rVarJ2 = lVar2.J();
            z.b bVar5 = new z.b(lVar);
            br.l.e(rVarJ, "additionalClassPartsProvider");
            br.l.e(rVarJ2, "platformDependentDeclarationFilter");
            qr.s sVar = new qr.s(lVar, l2Var2, a0Var);
            a2.g gVar3 = new a2.g(sVar);
            et.a aVar = et.a.f8347m;
            sVar.f21011c = new dt.k(lVar, a0Var, gVar3, new bm.e(a0Var, eVar3, aVar), sVar, dt.m.f7514a, dt.l.f7512c, e5.I(new pr.a(lVar, a0Var), new qr.h(lVar, a0Var)), eVar3, rVarJ, rVarJ2, aVar.f6667a, lVar3, bVar5, null, 786432);
            a0Var.D = new gb.k(2, mq.l.A0(new ur.a0[]{a0Var}));
            a0Var.E = new ur.m(e5.I(dVar3, sVar), "CompositeProvider@RuntimeModuleData for " + a0Var);
            wr.e eVar4 = new wr.e(kVar, new qm.c(gVar2, l2Var));
            while (true) {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(a2Var, new WeakReference(eVar4));
                if (weakReference2 == null) {
                    return eVar4;
                }
                wr.e eVar5 = (wr.e) weakReference2.get();
                if (eVar5 != null) {
                    return eVar5;
                }
                concurrentHashMap.remove(a2Var, weakReference2);
            }
        } finally {
        }
    }
}
