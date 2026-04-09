package ps;

import ba.m;
import bf.n;
import com.google.android.gms.internal.measurement.e5;
import f5.u;
import h7.h0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ls.c0;
import ls.g0;
import ls.j;
import ls.l;
import ls.q0;
import ls.y;
import ls.y0;
import mq.p;
import os.k;
import rs.o;
import rs.t;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final rs.g f20642a;

    static {
        rs.g gVar = new rs.g();
        gVar.a(k.f19778a);
        gVar.a(k.f19779b);
        gVar.a(k.f19780c);
        gVar.a(k.f19781d);
        gVar.a(k.f19782e);
        gVar.a(k.f19783f);
        gVar.a(k.f19784g);
        gVar.a(k.f19785h);
        gVar.a(k.f19786i);
        gVar.a(k.j);
        gVar.a(k.k);
        gVar.a(k.f19787l);
        gVar.a(k.f19788m);
        gVar.a(k.f19789n);
        f20642a = gVar;
    }

    public static e a(l lVar, ns.f fVar, h0 h0Var) {
        String strX0;
        br.l.e(lVar, "proto");
        br.l.e(fVar, "nameResolver");
        br.l.e(h0Var, "typeTable");
        o oVar = k.f19778a;
        br.l.d(oVar, "constructorSignature");
        os.c cVar = (os.c) a.a.o(lVar, oVar);
        String string = (cVar == null || (cVar.f19742d & 1) != 1) ? "<init>" : fVar.getString(cVar.f19743g);
        if (cVar == null || (cVar.f19742d & 2) != 2) {
            List<y0> list = lVar.f15823x;
            br.l.d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            for (y0 y0Var : list) {
                br.l.d(y0Var, "it");
                String strE = e(m.T(y0Var, h0Var), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strX0 = mq.o.x0(arrayList, "", "(", ")V", null, 56);
        } else {
            strX0 = fVar.getString(cVar.f19744r);
        }
        return new e(string, strX0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static ps.d b(ls.g0 r4, ns.f r5, h7.h0 r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            br.l.e(r4, r0)
            java.lang.String r0 = "nameResolver"
            br.l.e(r5, r0)
            java.lang.String r0 = "typeTable"
            br.l.e(r6, r0)
            rs.o r0 = os.k.f19781d
            java.lang.String r1 = "propertySignature"
            br.l.d(r0, r1)
            java.lang.Object r0 = a.a.o(r4, r0)
            os.e r0 = (os.e) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f19753d
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            os.b r0 = r0.f19754g
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f19736d
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f19737g
            goto L3b
        L39:
            int r7 = r4.f15785y
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f19736d
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f19738r
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            ls.q0 r4 = ba.m.P(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            ps.d r6 = new ps.d
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.i.b(ls.g0, ns.f, h7.h0, boolean):ps.d");
    }

    public static e c(y yVar, ns.f fVar, h0 h0Var) {
        String strJ;
        br.l.e(yVar, "proto");
        br.l.e(fVar, "nameResolver");
        br.l.e(h0Var, "typeTable");
        o oVar = k.f19779b;
        br.l.d(oVar, "methodSignature");
        os.c cVar = (os.c) a.a.o(yVar, oVar);
        int i10 = (cVar == null || (cVar.f19742d & 1) != 1) ? yVar.f15919y : cVar.f19743g;
        if (cVar == null || (cVar.f19742d & 2) != 2) {
            List listJ = e5.J(m.M(yVar, h0Var));
            List<y0> list = yVar.K;
            br.l.d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(p.a0(list, 10));
            for (y0 y0Var : list) {
                br.l.d(y0Var, "it");
                arrayList.add(m.T(y0Var, h0Var));
            }
            ArrayList arrayListE0 = mq.o.E0(listJ, arrayList);
            ArrayList arrayList2 = new ArrayList(p.a0(arrayListE0, 10));
            Iterator it = arrayListE0.iterator();
            while (it.hasNext()) {
                String strE = e((q0) it.next(), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(m.O(yVar, h0Var), fVar);
            if (strE2 == null) {
                return null;
            }
            strJ = w.g.j(new StringBuilder(), mq.o.x0(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strJ = fVar.getString(cVar.f19744r);
        }
        return new e(fVar.getString(i10), strJ);
    }

    public static final boolean d(g0 g0Var) {
        br.l.e(g0Var, "proto");
        ns.b bVar = c.f20633a;
        Object objK = g0Var.k(k.f19782e);
        br.l.d(objK, "proto.getExtension(JvmProtoBuf.flags)");
        return bVar.e(((Number) objK).intValue()).booleanValue();
    }

    public static String e(q0 q0Var, ns.f fVar) {
        if (q0Var.p()) {
            return b.b(fVar.n(q0Var.E));
        }
        return null;
    }

    public static final lq.l f(String[] strArr, String[] strArr2) throws t {
        br.l.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        g gVarG = g(byteArrayInputStream, strArr2);
        ls.a aVar = j.f15794g0;
        aVar.getClass();
        u uVar = new u(byteArrayInputStream);
        rs.b bVar = (rs.b) aVar.a(uVar, f20642a);
        try {
            uVar.c(0);
            if (bVar.b()) {
                return new lq.l(gVarG, (j) bVar);
            }
            t tVar = new t(new n().getMessage());
            tVar.f21776a = bVar;
            throw tVar;
        } catch (t e4) {
            e4.f21776a = bVar;
            throw e4;
        }
    }

    public static g g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        os.j jVar = (os.j) os.j.D.b(byteArrayInputStream, f20642a);
        br.l.d(jVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new g(jVar, strArr);
    }

    public static final lq.l h(String[] strArr, String[] strArr2) throws t {
        br.l.e(strArr, "data");
        br.l.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        g gVarG = g(byteArrayInputStream, strArr2);
        ls.a aVar = c0.H;
        aVar.getClass();
        u uVar = new u(byteArrayInputStream);
        rs.b bVar = (rs.b) aVar.a(uVar, f20642a);
        try {
            uVar.c(0);
            if (bVar.b()) {
                return new lq.l(gVarG, (c0) bVar);
            }
            t tVar = new t(new n().getMessage());
            tVar.f21776a = bVar;
            throw tVar;
        } catch (t e4) {
            e4.f21776a = bVar;
            throw e4;
        }
    }
}
