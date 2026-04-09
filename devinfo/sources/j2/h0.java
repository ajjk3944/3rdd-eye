package j2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0.a0 f27169a = new u0.a0(e0.f27110b);

    /* renamed from: b, reason: collision with root package name */
    public static final u0.o2 f27170b = new u0.o2(e0.f27111c);

    /* renamed from: c, reason: collision with root package name */
    public static final u0.a0 f27171c = new u0.a0(m.f27228d);

    /* renamed from: d, reason: collision with root package name */
    public static final u0.o2 f27172d = new u0.o2(e0.f27112d);

    /* renamed from: e, reason: collision with root package name */
    public static final u0.o2 f27173e = new u0.o2(e0.f27113e);

    /* renamed from: f, reason: collision with root package name */
    public static final u0.o2 f27174f = new u0.o2(e0.f27114f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r24v0, types: [u0.p] */
    public static final void a(r rVar, mk.e eVar, u0.p pVar, int i4) {
        ?? r18;
        char c9;
        char c10;
        LinkedHashMap linkedHashMap;
        boolean z3;
        pVar.X(-520299287);
        int i10 = (pVar.h(rVar) ? 4 : 2) | i4 | (pVar.h(eVar) ? 32 : 16);
        boolean z10 = true;
        if (pVar.O(i10 & 1, (i10 & 19) != 18)) {
            Context context = rVar.getContext();
            Object objL = pVar.L();
            u0.e eVar2 = u0.l.f34851a;
            Object obj = objL;
            if (objL == eVar2) {
                m0 m0Var = new m0(context);
                pVar.g0(m0Var);
                obj = m0Var;
            }
            m0 m0Var2 = (m0) obj;
            k viewTreeOwners = rVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            a6.f fVar = viewTreeOwners.f27205b;
            Object objL2 = pVar.L();
            if (objL2 == eVar2) {
                Object parent = rVar.getParent();
                nk.k.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = f1.g.class.getSimpleName() + ':' + strValueOf;
                yb.i iVarG = fVar.g();
                Bundle bundleL = iVarG.l(str);
                c9 = 2;
                if (bundleL != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleL.keySet()) {
                        boolean z11 = z10;
                        ArrayList parcelableArrayList = bundleL.getParcelableArrayList(str2);
                        nk.k.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                        z10 = z11;
                    }
                } else {
                    linkedHashMap = null;
                }
                boolean z12 = z10;
                c10 = 0;
                m mVar = m.f27229e;
                u0.o2 o2Var = f1.i.f23623a;
                f1.h hVar = new f1.h(linkedHashMap, mVar);
                try {
                    iVarG.P(str, new b5.a0(4, hVar));
                    z3 = z12 ? 1 : 0;
                } catch (IllegalArgumentException unused) {
                    z3 = false;
                }
                d1 d1Var = new d1(hVar, new e1(z3, iVarG, str));
                pVar.g0(d1Var);
                objL2 = d1Var;
                r18 = z12;
            } else {
                r18 = 1;
                c9 = 2;
                c10 = 0;
            }
            d1 d1Var2 = (d1) objL2;
            boolean zH = pVar.h(d1Var2);
            Object objL3 = pVar.L();
            Object obj2 = objL3;
            if (zH || objL3 == eVar2) {
                c2.l0 l0Var = new c2.l0(11, d1Var2);
                pVar.g0(l0Var);
                obj2 = l0Var;
            }
            u0.q.c(yj.u.f37649a, (mk.c) obj2, pVar);
            Object objL4 = pVar.L();
            if (objL4 == eVar2) {
                objL4 = h1.a(context) ? new b1(rVar.getView()) : new q1();
                pVar.g0(objL4);
            }
            x1.a aVar = (x1.a) objL4;
            Configuration configuration = rVar.getConfiguration();
            Object objL5 = pVar.L();
            Object obj3 = objL5;
            if (objL5 == eVar2) {
                n2.c cVar = new n2.c();
                pVar.g0(cVar);
                obj3 = cVar;
            }
            n2.c cVar2 = (n2.c) obj3;
            Object objL6 = pVar.L();
            Object obj4 = objL6;
            if (objL6 == eVar2) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                pVar.g0(configuration2);
                obj4 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj4;
            Object objL7 = pVar.L();
            Object obj5 = objL7;
            if (objL7 == eVar2) {
                f0 f0Var = new f0(configuration3, cVar2);
                pVar.g0(f0Var);
                obj5 = f0Var;
            }
            f0 f0Var2 = (f0) obj5;
            boolean zH2 = pVar.h(context);
            Object objL8 = pVar.L();
            int i11 = 3;
            Object obj6 = objL8;
            if (zH2 || objL8 == eVar2) {
                c2.w wVar = new c2.w(i11, context, f0Var2);
                pVar.g0(wVar);
                obj6 = wVar;
            }
            u0.q.c(cVar2, (mk.c) obj6, pVar);
            Object objL9 = pVar.L();
            Object obj7 = objL9;
            if (objL9 == eVar2) {
                n2.d dVar = new n2.d();
                pVar.g0(dVar);
                obj7 = dVar;
            }
            n2.d dVar2 = (n2.d) obj7;
            Object objL10 = pVar.L();
            Object obj8 = objL10;
            if (objL10 == eVar2) {
                g0 g0Var = new g0(dVar2);
                pVar.g0(g0Var);
                obj8 = g0Var;
            }
            g0 g0Var2 = (g0) obj8;
            boolean zH3 = pVar.h(context);
            Object objL11 = pVar.L();
            Object obj9 = objL11;
            if (zH3 || objL11 == eVar2) {
                c2.w wVar2 = new c2.w(4, context, g0Var2);
                pVar.g0(wVar2);
                obj9 = wVar2;
            }
            u0.q.c(dVar2, (mk.c) obj9, pVar);
            u0.a0 a0Var = a1.f27087v;
            boolean zBooleanValue = ((Boolean) pVar.j(a0Var)).booleanValue() | rVar.getScrollCaptureInProgress$ui();
            p.r rVarA = f27169a.a(rVar.getConfiguration());
            p.r rVarA2 = f27170b.a(context);
            p.r rVarA3 = f5.a.f23655a.a(viewTreeOwners.f27204a);
            p.r rVarA4 = b6.b.f1967a.a(fVar);
            p.r rVarA5 = f1.i.f23623a.a(d1Var2);
            p.r rVarA6 = f27174f.a(rVar.getView());
            p.r rVarA7 = f27172d.a(cVar2);
            p.r rVarA8 = f27173e.a(dVar2);
            p.r rVarA9 = a0Var.a(Boolean.valueOf(zBooleanValue));
            p.r rVarA10 = a1.f27077l.a(aVar);
            p.r[] rVarArr = new p.r[10];
            rVarArr[c10] = rVarA;
            rVarArr[r18] = rVarA2;
            rVarArr[c9] = rVarA3;
            rVarArr[3] = rVarA4;
            rVarArr[4] = rVarA5;
            rVarArr[5] = rVarA6;
            rVarArr[6] = rVarA7;
            rVarArr[7] = rVarA8;
            rVarArr[8] = rVarA9;
            rVarArr[9] = rVarA10;
            u0.q.b(rVarArr, c1.n.c(1059770793, new g2.y0(rVar, m0Var2, eVar), pVar), pVar, 56);
        } else {
            pVar.R();
        }
        u0.m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new g2.e0(rVar, eVar, i4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
