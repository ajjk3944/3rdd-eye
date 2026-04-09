package dt;

import com.google.android.gms.internal.measurement.e5;
import h7.h0;
import java.util.ArrayList;
import java.util.List;
import ls.e1;
import ls.g0;
import ls.q0;
import ls.y0;
import p.v2;
import rr.f0;
import rr.o0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final al.b f7538a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f7539b;

    public t(al.b bVar) {
        this.f7538a = bVar;
        k kVar = (k) bVar.f810b;
        this.f7539b = new io.sentry.internal.debugmeta.c(kVar.f7494b, kVar.f7502l);
    }

    public final w a(rr.l lVar) {
        if (lVar instanceof f0) {
            qs.c cVar = ((ur.c0) ((f0) lVar)).f23629y;
            al.b bVar = this.f7538a;
            return new v(cVar, (ns.f) bVar.f811c, (h0) bVar.f813e, (ft.k) bVar.f816h);
        }
        if (lVar instanceof ft.i) {
            return ((ft.i) lVar).R;
        }
        return null;
    }

    public final sr.h b(rs.m mVar, int i10, a aVar) {
        return !ns.e.f18530c.e(i10).booleanValue() ? sr.g.f22217a : new ft.w(((k) this.f7538a.f810b).f7493a, new p(this, mVar, aVar, 0));
    }

    public final sr.h c(g0 g0Var, boolean z10) {
        return !ns.e.f18530c.e(g0Var.f15783r).booleanValue() ? sr.g.f22217a : new ft.w(((k) this.f7538a.f810b).f7493a, new q(this, z10, g0Var));
    }

    public final ft.c d(ls.l lVar, boolean z10) {
        al.b bVar = this.f7538a;
        rr.l lVar2 = (rr.l) bVar.f812d;
        br.l.c(lVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        rr.f fVar = (rr.f) lVar2;
        int i10 = lVar.f15822r;
        a aVar = a.FUNCTION;
        ft.c cVar = new ft.c(fVar, null, b(lVar, i10, aVar), z10, rr.c.DECLARATION, lVar, (ns.f) bVar.f811c, (h0) bVar.f813e, (ns.h) bVar.f814f, (ft.k) bVar.f816h, null);
        t tVar = (t) bVar.b(cVar, mq.w.f16945a, (ns.f) bVar.f811c, (h0) bVar.f813e, (ns.h) bVar.f814f, (ns.a) bVar.f815g).f817i;
        List list = lVar.f15823x;
        br.l.d(list, "proto.valueParameterList");
        cVar.J1(tVar.g(list, lVar, aVar), ir.f0.p((e1) ns.e.f18531d.e(lVar.f15822r)));
        cVar.F1(fVar.q());
        cVar.O = fVar.M();
        cVar.S = !ns.e.f18539n.e(lVar.f15822r).booleanValue();
        return cVar;
    }

    public final ft.t e(ls.y yVar) {
        int i10;
        ht.x xVarM;
        al.b bVar = this.f7538a;
        ns.f fVar = (ns.f) bVar.f811c;
        h0 h0Var = (h0) bVar.f813e;
        br.l.e(yVar, "proto");
        if ((yVar.f15916g & 1) == 1) {
            i10 = yVar.f15917r;
        } else {
            int i11 = yVar.f15918x;
            i10 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i10;
        a aVar = a.FUNCTION;
        sr.h hVarB = b(yVar, i12, aVar);
        int i13 = yVar.f15916g;
        int i14 = i13 & 32;
        sr.f fVar2 = sr.g.f22217a;
        sr.h aVar2 = (i14 == 32 || (i13 & 64) == 64) ? new ft.a(((k) bVar.f810b).f7493a, new p(this, yVar, aVar, 1)) : fVar2;
        ft.t tVar = new ft.t((rr.l) bVar.f812d, null, hVarB, io.sentry.config.a.Y(fVar, yVar.f15919y), ir.f0.P((ls.z) ns.e.f18540o.e(i12)), yVar, (ns.f) bVar.f811c, h0Var, xs.d.g((rr.l) bVar.f812d).c(io.sentry.config.a.Y(fVar, yVar.f15919y)).equals(z.f7556a) ? ns.h.f18553a : (ns.h) bVar.f814f, (ft.k) bVar.f816h, null);
        List list = yVar.E;
        br.l.d(list, "proto.typeParameterList");
        al.b bVarB = bVar.b(tVar, list, (ns.f) bVar.f811c, (h0) bVar.f813e, (ns.h) bVar.f814f, (ns.a) bVar.f815g);
        v2 v2Var = (v2) bVarB.f809a;
        q0 q0VarM = ba.m.M(yVar, h0Var);
        ur.v vVarK = (q0VarM == null || (xVarM = v2Var.m(q0VarM)) == null) ? null : ts.o.k(tVar, xVarM, aVar2);
        rr.l lVar = (rr.l) bVar.f812d;
        rr.f fVar3 = lVar instanceof rr.f ? (rr.f) lVar : null;
        ur.v vVarR0 = fVar3 != null ? fVar3.R0() : null;
        List list2 = yVar.H;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = yVar.I;
            br.l.d(list3, "contextReceiverTypeIdList");
            ArrayList arrayList = new ArrayList(mq.p.a0(list3, 10));
            for (Integer num : list3) {
                br.l.d(num, "it");
                arrayList.add(h0Var.x(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                e5.Q();
                throw null;
            }
            ur.v vVarE = ts.o.e(tVar, v2Var.m((q0) obj), null, fVar2, i15);
            if (vVarE != null) {
                arrayList2.add(vVarE);
            }
            i15 = i16;
        }
        List listD = v2Var.d();
        t tVar2 = (t) bVarB.f817i;
        List list4 = yVar.K;
        br.l.d(list4, "proto.valueParameterList");
        tVar.J1(vVarK, vVarR0, arrayList2, listD, tVar2.g(list4, yVar, a.FUNCTION), v2Var.m(ba.m.O(yVar, h0Var)), l.d((ls.a0) ns.e.f18532e.e(i12)), ir.f0.p((e1) ns.e.f18531d.e(i12)), mq.x.f16946a);
        tVar.J = ns.e.f18541p.e(i12).booleanValue();
        tVar.K = ns.e.f18542q.e(i12).booleanValue();
        tVar.L = ns.e.f18545t.e(i12).booleanValue();
        tVar.M = ns.e.f18543r.e(i12).booleanValue();
        tVar.N = ns.e.f18544s.e(i12).booleanValue();
        tVar.R = ns.e.f18546u.e(i12).booleanValue();
        tVar.O = ns.e.f18547v.e(i12).booleanValue();
        tVar.S = !ns.e.f18548w.e(i12).booleanValue();
        ((k) bVar.f810b).f7503m.getClass();
        return tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0112  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [ur.j0] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r3v26, types: [gt.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ft.s, rr.b, rr.m0, ur.h0, ur.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ft.s f(ls.g0 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.t.f(ls.g0):ft.s");
    }

    public final List g(List list, rs.m mVar, a aVar) {
        int i10;
        sr.h wVar;
        t tVar = this;
        al.b bVar = tVar.f7538a;
        h0 h0Var = (h0) bVar.f813e;
        v2 v2Var = (v2) bVar.f809a;
        rr.l lVar = (rr.l) bVar.f812d;
        br.l.c(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        rr.b bVar2 = (rr.b) lVar;
        rr.l lVarO = bVar2.o();
        br.l.d(lVarO, "callableDescriptor.containingDeclaration");
        w wVarA = tVar.a(lVarO);
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            ht.x xVarM = null;
            if (i11 < 0) {
                e5.Q();
                throw null;
            }
            y0 y0Var = (y0) obj;
            int i13 = (y0Var.f15921g & 1) == 1 ? y0Var.f15922r : 0;
            if (wVarA == null || !ns.e.f18530c.e(i13).booleanValue()) {
                i10 = i11;
                wVar = sr.g.f22217a;
            } else {
                i10 = i11;
                wVar = new ft.w(((k) bVar.f810b).f7493a, new s(tVar, wVarA, mVar, aVar, i10, y0Var));
            }
            qs.g gVarY = io.sentry.config.a.Y((ns.f) bVar.f811c, y0Var.f15923x);
            ht.x xVarM2 = v2Var.m(ba.m.T(y0Var, h0Var));
            boolean zBooleanValue = ns.e.G.e(i13).booleanValue();
            boolean zBooleanValue2 = ns.e.H.e(i13).booleanValue();
            boolean zBooleanValue3 = ns.e.I.e(i13).booleanValue();
            int i14 = y0Var.f15921g;
            q0 q0VarX = (i14 & 16) == 16 ? y0Var.D : (i14 & 32) == 32 ? h0Var.x(y0Var.E) : null;
            if (q0VarX != null) {
                xVarM = v2Var.m(q0VarX);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ur.q0(bVar2, null, i10, wVar, gVarY, xVarM2, zBooleanValue, zBooleanValue2, zBooleanValue3, xVarM, o0.f21696s));
            arrayList = arrayList2;
            i11 = i12;
            tVar = this;
        }
        return mq.o.Q0(arrayList);
    }
}
